package com.ty.employeeappspringmvc.bean;

public class Employee {


	private String name;
	private String email;
	private String dob;
	private int age;
	private double salary;
	private String empstatus;


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

	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
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

	public String getStatus() {
		return empstatus;
	}
	public void setStatus(String status) {
		this.empstatus = status;
	}
	@Override
	public String toString() {
		return "Employee [ name=" + name + ", email=" + email + ", dob=" + dob + ", salary=" + salary
				+ ", status=" + empstatus + "]";
	}









}
