package com.ph.fleetapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ph.fleetapp.models.Employee;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	public Employee findByUsername(String un);

//    List<Employee> findByKeyword(String keyword);
}
