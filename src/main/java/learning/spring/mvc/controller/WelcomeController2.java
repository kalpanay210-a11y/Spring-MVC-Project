package learning.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/API2")
public class WelcomeController2 {
	
	@RequestMapping("/greeting")
	public String hello() {
		System.out.println("WelcomeController2 (API1) -> hello()");
		return "index11";
	}
	
	@RequestMapping("/login")
	public String login(@RequestParam(name ="login" ,defaultValue = "My-Default-LoginName") String name, Model model ) {
		model.addAttribute("login", name);
		System.out.println("WelcomeController2 (API1) -> login()" +name);
		return "login";
	}

	@RequestMapping("/Path-var/{id}")
	public String intro(@PathVariable(name = "id") int id, Model model) {
		model.addAttribute("user", "Sorry this" +id+ "is not found in our DB.");
		System.out.println("WelcomeController2 (API1) -> intro()" + id);
		return "intro";
	}
}