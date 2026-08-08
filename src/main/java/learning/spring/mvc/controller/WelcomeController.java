package learning.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/API1")
public class WelcomeController {
	
	@RequestMapping("/greeting")
	public String hello() {
		System.out.println("WelcomeController2 (API1) -> hello()");
		return "index11";
	}
	
	@RequestMapping("/login")
	public String login() {
		System.out.println("WelcomeController2 (API1) -> login()");
		return "login";
	}

	@RequestMapping("/intro")
	public String intro() {
		System.out.println("WelcomeController2 (API1) -> intro()");
		return "intro";
	}
}