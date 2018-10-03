package com.student.DemoRestSevice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.DemoRestSevice.models.Student;
import com.student.DemoRestSevice.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired 
	StudentRepository studRepo;

	@Override
	public String addStudnt(Student stud) {
		studRepo.save(stud);
		
		return "saved";
	}

	@Override
	public String deleteStudent(int id) {
		studRepo.deleteById(id);
		return "deleted";
	}

	@Override
	public List<Student> getAllStudent() {
		List<Student> students= (List<Student>)studRepo.findAll();
		return students;
	}

	@Override
	public Student getStudent(int id) {
		Student stud= studRepo.findByid(id);
		return stud;
	}

	@Override
	public String updateStudent(Student stud) {
		studRepo.save(stud);
		return "updated";
	}

	@Override
	public Student getByNAme(String name) {
		
		return studRepo.findByfname(name);
	}
	
	
}

