package com.ph.fleetapp.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ph.fleetapp.models.Employee;
import com.ph.fleetapp.services.CountryService;
import com.ph.fleetapp.services.EmployeeService;
import com.ph.fleetapp.services.EmployeeTypeService;
import com.ph.fleetapp.services.JobTitleService;
import com.ph.fleetapp.services.StateService;


@Controller
public class EmployeeController {
	
	
	
	@Autowired private EmployeeService employeeService;
	@Autowired private StateService stateService;
	
	@Autowired private JobTitleService jobTitleService;
	
	@Autowired private EmployeeTypeService employeeTypeService;
	@Autowired private CountryService countryService;
	
	//Get All Employees
	@GetMapping("employees")
	public String findAll(Model model){
		model.addAttribute("countries", countryService.getCountries());
		model.addAttribute("states", stateService.getStates());
		model.addAttribute("employees", employeeService.getEmployees());
		model.addAttribute("jobTitles", jobTitleService.getJobTitles());
		model.addAttribute("employeeTypes", employeeTypeService.getEmployeeTypes());
		
		return "employee";
	}
	
	
	@RequestMapping("employees/findById") 
	@ResponseBody
	public Optional<Employee> findById(Integer id)
	{
		return employeeService.findById(id);
	}
	
	//Add Employee
	@PostMapping(value="employees/addNew")
	public String addNew(Employee employee) {
		employeeService.save(employee);
		return "redirect:/employees";
	}	
	
	@RequestMapping(value="employees/update", method = {RequestMethod.PUT, RequestMethod.GET})
	public String update(Employee employee) {
		employeeService.save(employee);
		return "redirect:/employees";
	}
	
	@RequestMapping(value="employees/delete", method = {RequestMethod.DELETE, RequestMethod.GET})	
	public String delete(Integer id) {
		employeeService.delete(id);
		return "redirect:/employees";
	}

	//Assign Employee Username
	@RequestMapping(value = "/employees/assignUsername")
	public  String assignUsername(int id){
		employeeService.assignUsername(id);
		return "redirect:/employees";
	}
}
