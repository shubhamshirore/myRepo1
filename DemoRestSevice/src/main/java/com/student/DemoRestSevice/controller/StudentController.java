package com.student.DemoRestSevice.controller;

import java.util.List;

import javax.swing.RepaintManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.student.DemoRestSevice.exceptions.IdNotFoundException;
import com.student.DemoRestSevice.models.Student;
import com.student.DemoRestSevice.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	StudentService studService;
	
	@GetMapping("/search")
	public ResponseEntity<List<Student>> getAllStudents()
	{
		List<Student> studes= studService.getAllStudent();
		return new ResponseEntity<>(studes,HttpStatus.OK);
	}
	
	
	@PostMapping("/add")
	public ResponseEntity<String> addStude(@RequestBody Student stud)
	{
		studService.addStudnt(stud);
		return new ResponseEntity<>("student added", HttpStatus.OK);
	}
	
	@GetMapping("/student/{id}")
	public ResponseEntity<Student>  getStudent(@PathVariable("id") int id)
	{
		Student stu= studService.getStudent(id);
		return new ResponseEntity<>(stu, HttpStatus.OK);
		
	}
	
	@DeleteMapping("/student/{id}")
	public ResponseEntity<String>  deleteStudent(@PathVariable("id") int id)
	{
		String status= studService.deleteStudent(id);
		return new ResponseEntity<String>(status, HttpStatus.OK);
	}
	
	@PutMapping("/student")
	public ResponseEntity<String> updateStudent(@RequestBody Student stud)
	{
		String str= studService.updateStudent(stud);
		return new ResponseEntity<>(str, HttpStatus.OK);
	}
	
	@GetMapping("/student/name/{name}")
	public ResponseEntity<Student> getStudentByname(@PathVariable("name") String name)
	{
		Student stud= studService.getByNAme(name);
		return new ResponseEntity<>(stud, HttpStatus.OK);
		
	}
	
	
}
