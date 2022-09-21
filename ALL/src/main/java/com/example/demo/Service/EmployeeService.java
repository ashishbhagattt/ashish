package com.example.demo.Service;

import java.util.List;
import java.util.Optional;



import com.example.demo.Model.Employee;


public interface EmployeeService {
	
	public Employee saveEmployee(Employee employee);
	public Optional<Employee>  getEmployee( Integer Id);
	public void deleteEmployee(Integer Id);
	public List<Employee> getByCity(String city);
	public List<Employee> getByName(String name);
	

}
