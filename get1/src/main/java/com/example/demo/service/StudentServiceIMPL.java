package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.DAO.StudentRepository;
import com.exmple.demo.model.Student;
@Service
public class StudentServiceIMPL implements StudentService {
	@Autowired
 private StudentRepository studentRepository;

	@Override
	public Optional<Student> getmarks(Integer Id) {
		Optional<Student> student=studentRepository.findById(Id);
		return student;
	}
	
	

}
