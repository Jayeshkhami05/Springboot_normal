package com.Jayesh.SpringbootNormal.entity;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@Component
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String departmentname;
	private int mobilenum;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Student(int id, String name, String departmentname, int mobilenum) {
		super();
		this.id = id;
		this.name = name;
		this.departmentname = departmentname;
		this.mobilenum = mobilenum;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartmentname() {
		return departmentname;
	}
	public void setDepartmentname(String departmentname) {
		this.departmentname = departmentname;
	}
	public int getMobilenum() {
		return mobilenum;
	}
	public void setMobilenum(int mobilenum) {
		this.mobilenum = mobilenum;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", departmentname=" + departmentname + ", mobilenum="
				+ mobilenum + "]";
	}
	
	
	
}
