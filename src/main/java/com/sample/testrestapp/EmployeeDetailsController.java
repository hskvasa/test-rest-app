package com.sample.testrestapp;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeDetailsController {

	@GetMapping(path="/getemployees") 
	public List<Employee> getEmployees() {
		return Arrays.asList(new Employee[] {new Employee(100,"Hemanth"), new Employee(200, "Srinivas")});
	}
}

class Employee {
	private int empId;
	private String empName;
		
	public Employee(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	
}
