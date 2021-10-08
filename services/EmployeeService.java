package com.ph.fleetapp.services;

import java.util.List;
import java.util.Optional;

import com.ph.fleetapp.models.User;
import com.ph.fleetapp.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ph.fleetapp.models.Employee;
import com.ph.fleetapp.repositories.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Autowired
	private UserRepository userRepository;
	
	//Get All Employees
	public List<Employee> getEmployees(){
		return employeeRepository.findAll();
	}	
	
	//Get Employee By Id
	public Optional<Employee> findById(int id) {
		return employeeRepository.findById(id);
	}	
	
	//Delete Employee
	public void delete(int id) {
		employeeRepository.deleteById(id);
	}
	
	//Update Employee
	public void save( Employee employee) {
		employeeRepository.save(employee);
	}
	
	//Get Employee by username
	public Employee findByUsername(String un) {
		return employeeRepository.findByUsername(un);
	}

//	//Get Employees by keyword
//	public List<Employee> findByKeyword(String keyword){
//		return employeeRepository.findByKeyword(keyword);
//	}

	//Set the Username of the employee where firstname and lastname match
	public void assignUsername(int id){
		Employee employee = employeeRepository.findById(id).orElse(null);
		User user = userRepository.findByFirstnameAndLastname(
				employee.getFirstname(),
				employee.getLastname());
		employee.setUsername(user.getUsername());
		employeeRepository.save(employee);
	}
}
