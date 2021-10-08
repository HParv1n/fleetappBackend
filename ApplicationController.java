package com.ph.fleetapp;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ph.fleetapp.services.EmployeeService;

@Controller
public class ApplicationController {
	
//	@Autowired
//	private EmployeeService employeeService;

	@GetMapping("/index")
	public String homePage() {
		return "index";
	}
	
	@GetMapping("/login")
	public String loginPage() {
		return "login";
	}
	
	@GetMapping("/blank")
	public String blank() {
		return "blank";
	}
	
	@GetMapping("/register")
	public String registr() {
		return "register";
	}
	
//	@RequestMapping(value="/profile")
//	public String profile(Model model, Principal principal) {
//		String un = principal.getName();
//		model.addAttribute("employee", employeeService.findByUsername(un));
//		return "profile";
//	}
}
