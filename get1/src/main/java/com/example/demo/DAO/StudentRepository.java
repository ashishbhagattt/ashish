package com.example.demo.DAO;


import java.io.Serializable;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Employee;
import com.exmple.demo.model.Student;

@Repository
public interface StudentRepository extends CrudRepository<Employee,Serializable> {
	
	public Optional <Student > findById(Integer Id);

}
