package com.ty.employeeappspringmvc.service;

import java.time.LocalDate;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="emp_table")
public class EmployeeDto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Emp_Id")
	private int id;
	@Column(name="Name")
	private String name;
	@Column(name="Email_ID")
	private String email;
	@Column(name="DOB")
	private LocalDate dob;
	@Column(name="age")
	private int age;
	@Column(name="Salary")
	private double salary;
	@Column(name="Status")
	private boolean empstatus;
	
	
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public boolean getEmpstatus() {
		return empstatus;
	}
	public void setEmpstatus(boolean empstatus) {
		this.empstatus = empstatus;
	}
	
	
	
	
	
	
	

}
