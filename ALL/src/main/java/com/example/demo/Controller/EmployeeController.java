package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Employee;
import com.example.demo.Service.EmployeeService;

@RestController
@RequestMapping("/employee1/{Id}")
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	@GetMapping("/get/{id}")
	public ResponseEntity <Optional<Employee>> getEmployee(@PathVariable("id") Integer Id) {
		Optional<Employee> emp=employeeService.getEmployee(Id);
		return ResponseEntity.ok().body(emp);
	}
	@DeleteMapping("/delete/{id}")
	public void deleteEmployee(@PathVariable Integer Id)throws Exception{
		  employeeService.deleteEmployee(Id);
		 
		
	}
	@PostMapping("/save")
	public ResponseEntity<Employee>saveEmployee(@RequestBody Employee employee){
	Employee	emp1 =employeeService.saveEmployee(employee);
		return ResponseEntity.ok().body(emp1);
	}
	@GetMapping("/city/{city}")
	public ResponseEntity<List<Employee>>getListByCity(@PathVariable("city")String city){
		List<Employee>list=employeeService.getByCity(city);
		return ResponseEntity.ok().body(list);
		
	}
	@GetMapping(("/name/{name}"))
public ResponseEntity<List<Employee>>getListByName(@PathVariable("name")String name){
		List<Employee>list=employeeService.getByName(name);
	return ResponseEntity.ok().body(list);
		
	}

}
