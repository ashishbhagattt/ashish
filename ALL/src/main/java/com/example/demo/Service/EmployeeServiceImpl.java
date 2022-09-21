package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.DAO.EmployeeRepository;
import com.example.demo.Model.Employee;
@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
    private  EmployeeRepository employeeRepository;
	
	
	
	
	//get the data
	@Override
	public Optional<Employee> getEmployee(Integer Id) {
		Optional<Employee> employee=employeeRepository.findById(Id);
		
		return employee ;
	}
	@Override
     public void deleteEmployee( Integer Id) {
		employeeRepository.deleteById(Id);
	
}
	@Override
	public Employee saveEmployee(Employee employee) {
		
		return employeeRepository.save(employee) ;
	}
	
	
	@Override
	public List<Employee> getByCity(String city) {
		List<Employee>list=employeeRepository.findByCity(city);
		return list;
	}
	@Override
	public List<Employee> getByName(String name) {
		List<Employee>list1=employeeRepository.findByName(name);
		return list1;
	}
	
	
	
	
	
	
	

}
