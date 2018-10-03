package com.student.DemoRestSevice.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.student.DemoRestSevice.models.Student;

@Service
public interface StudentService {

	public String addStudnt(Student stud);
	public String deleteStudent(int id);
	public List<Student> getAllStudent();
	public Student getStudent(int id);
	public String updateStudent(Student stud);
	public Student getByNAme(String name);
}
