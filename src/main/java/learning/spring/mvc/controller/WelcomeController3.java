package learning.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/API3")
public class WelcomeController3 {
    
    @RequestMapping("/greeting")
    public String hello() {
        System.out.println("WelcomeController3 -> hello()");
        return "index11";
    }
    
    @RequestMapping("/login")
    public String login() {
        System.out.println("WelcomeController3 -> login()");
        return "login";
    }
    
    // 1. Changed cookie name to "firstCookie" with required = false
    @RequestMapping("/getMyCookies")
    public String getMyCookies(@CookieValue(name = "firstCookie", defaultValue = "No Cookie Found") String firstCookie, Model model) {
        
        model.addAttribute("sessionIdVal", "Your cookie value is: " + firstCookie);
        System.out.println("getMyCookies: " + firstCookie);
        return "firstCookie";
    }

    // 2. Fixed redirect path to include /API3 mapping
    @RequestMapping("/getFirstCookieValu")
    public String getFirstCookie(HttpServletResponse response, Model model) {
        Cookie cookie1 = new Cookie("firstCookie", "SensitiveInformation");
        cookie1.setMaxAge(10);
        response.addCookie(cookie1);
        System.out.println("WelcomeController3.getFirstCookie()");
        
        // Redirect to the full class-mapped path
        return "redirect:/API3/getMyCookies";
    }
}