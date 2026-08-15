package learning.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/API2")
public class WelcomeController2 {
	
	@RequestMapping("/greeting")
	public String hello() {
		System.out.println("WelcomeController2 (API1) -> hello()");
		return "index11";
	}
	
	@RequestMapping("/login")
	@ResponseBody
	public String login(@RequestParam(name ="login" ,defaultValue = "My-Default-LoginName") String name, Model model ) {
		model.addAttribute("login", name);
		System.out.println("WelcomeController2 (API1) -> login()" +name);
		return "login " +name;
	}

	@RequestMapping("/getCookies")
	public String getCookies(
	        @CookieValue(name = "JSESSIONID") String JSESSIONID, Model model) {
	    
	    model.addAttribute("sessionIdVal", "Your JSESSIONID is " + JSESSIONID);
	    System.out.println("JSESSIONID: " + JSESSIONID);
	    return "cookieVal";
	}
}