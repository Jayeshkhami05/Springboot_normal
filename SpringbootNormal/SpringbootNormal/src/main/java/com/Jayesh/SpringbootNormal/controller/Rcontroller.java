package com.Jayesh.SpringbootNormal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Jayesh.SpringbootNormal.Repositry.Repo;
import com.Jayesh.SpringbootNormal.Service.Controllerservice;
import com.Jayesh.SpringbootNormal.entity.Student;

@RestController
@RequestMapping("/Student")
public class Rcontroller {

	@Autowired
	private Controllerservice controllerservice;
	
	
	
	@PostMapping("/save")
	public Student saveStudent(@RequestBody Student student) {
		return controllerservice.save(student);
	}
	
	@GetMapping("/all")
	public List<Student> getAllStudent(){
		return controllerservice.getall();
	}
	
	@GetMapping("/getByid/{id}")
	public Student getStudent(@PathVariable int id) {
		return controllerservice.getByid(id);
	}
	
	@PutMapping("/update")
	public Student updatestudent(@RequestBody Student student, @PathVariable int id ) {
		return controllerservice.updateStudent(student,id);
	
	}
	
	@DeleteMapping("/delete")
	public Student deletestudent(@PathVariable int  id) {
		return controllerservice.delete(id);
	}
}


