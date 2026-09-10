package learning.spring.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

// Correct Import
import learning.spring.mvc.model.Employee;
import learning.spring.mvc.service.EmployeeService;

@Controller
public class EmployeeController {
	
    private EmployeeService employeeService;

    @Autowired
	public EmployeeController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}

	@GetMapping("/")
    public String welcome() {
        System.out.println("EmployeeController.welcome()");
        return "index";
    }

    @GetMapping("/signup")
    public String signUpForm() {
        System.out.println("EmployeeController.signUpForm()");
        return "signup";
    }

    @PostMapping("/profile")
    public String createUser(@ModelAttribute Employee emp, Model model) {
        employeeService.saveEmployee(emp);
        model.addAttribute("user", emp);
        return "profile";
    }

    @GetMapping("/getEmpById/{id}")
    public String getEmp(@PathVariable(name = "id") int id, Model model) {
        return "login";
    }

    @GetMapping("/employees")
    public String listEmployees(Model model) {
        model.addAttribute("employees", employeeService.getAllEmployees());
        return "employeeList";
    }
}