package com.dachser.rest.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dachser.Entity.Address;
import com.dachser.Entity.Student;
import com.dachser.config.exciptionHandler.ExceptionNotFound;

@RestController
@RequestMapping("/student")
public class StudentRestController {
	Random random = new Random();
	
	
	@GetMapping()
	public List<Student> getStudentx(){
		
		List<Student> students = initializeStudentsList();

		return students;
		
	}
	
	@GetMapping("/{studentId}")
	public Student getStudentx(@PathVariable int studentId){
		
		List<Student> students = initializeStudentsList();
		
		//Student student = students.get(studentId);
		
		// the for each loop
		for (Student stu : students) {
			if (stu.getId() == studentId)
				return stu;
		}
		
		//
		throw new ExceptionNotFound("this student: " + studentId + ", not found!");
	}
	
	
	private List<Student> initializeStudentsList(){
		
		List<Student> students = new ArrayList<Student>();
		
		// initialize some random student
		for (int i = 0; i < 10; i++) {
			
			boolean active = (random.nextInt(6) > 3 );
			Address address = new Address( "street_"+i, "city_"+i, "state_"+i, "zip_"+i, "country_"+i);
			String[] languages = {"lan_"+i};
			
			Student student = new Student(i, "first Name_" +i, "last Name_" + i, active, address, languages );
			
			students.add(student);
		}
		
		return students;
		
	}
	
}
