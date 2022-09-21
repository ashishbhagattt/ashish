package com.example.demo.DAO;


import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.Model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Serializable>,JpaRepository<Employee, Serializable> {

	@Query(value="select*from emp1 where city=?",nativeQuery=true)
	public List<Employee>findByCity(String city);
	@Query(value="select*from emp1 where name=?",nativeQuery=true)
	public List<Employee>findByName(String name);

}
