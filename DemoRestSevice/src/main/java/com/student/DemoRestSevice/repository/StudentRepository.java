package com.student.DemoRestSevice.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.student.DemoRestSevice.models.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer>{
	
	public Student findByfname(String name);
	public Student findByid(int id);

}