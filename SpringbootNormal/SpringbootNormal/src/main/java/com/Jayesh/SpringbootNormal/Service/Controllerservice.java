package com.Jayesh.SpringbootNormal.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Jayesh.SpringbootNormal.Repositry.Repo;
import com.Jayesh.SpringbootNormal.entity.Student;

@Service
public class Controllerservice {

	@Autowired
	private Repo repo;

	public Student save(Student student) {
		return repo.save(student);
	}

	public List<Student> getall() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	public Student getByid(int id) {
		// TODO Auto-generated method stub
		Optional<Student> optional=repo.findById(id);
		if(optional.isPresent()) {
			return optional.get();}
		return null;
	}

	public Student updateStudent(Student student, int id) {
		// TODO Auto-generated method stub
		Optional<Student> optional=repo.findById(id);
		Student dbstudent= new Student();
		if(optional.isPresent()) {
			dbstudent=optional.get();
			student.setId(dbstudent.getId());
			return repo.save(student);
		}
	return null;
		
	}

	public Student delete(int id) {
		// TODO Auto-generated method stub
		Optional<Student>optional=repo.findById(id);
		if(optional.isPresent()) {
			repo.deleteById(id);
			return optional.get();
		}
		return null;
	}
}
