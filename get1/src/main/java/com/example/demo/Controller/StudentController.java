package com.example.demo.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.StudentService;
import com.exmple.demo.model.Student;

@RestController
public class StudentController {
	@Autowired
	 private StudentService studentService;
	
	@GetMapping("/getdata/{Id}")
	public  ResponseEntity<Optional<Student>> getmarks(@PathVariable("Id")Integer Id){
		Optional<Student> stu=studentService.getmarks(Id);
		return ResponseEntity.ok().body(stu);
	
	}
}
