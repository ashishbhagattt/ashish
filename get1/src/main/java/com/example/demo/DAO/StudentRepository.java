package com.example.demo.DAO;


import java.io.Serializable;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import com.exmple.demo.model.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student,Serializable> {
	
	public Optional <Student > findById(Integer Id);

}
