package com.ty.employeeappspringmvc.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ty.employeeappspringmvc.bean.Employee;
import com.ty.employeeappspringmvc.dao.EmployeeDao;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeDao empdao;

	public EmployeeDto saveEmployee(Employee employee) {

		EmployeeDto empdto=new EmployeeDto();
		empdto.setName(employee.getName());
		empdto.setEmail(employee.getEmail());
		LocalDate dob=LocalDate.parse(employee.getDob());
		empdto.setDob(dob);
		
		empdto.setAge(employee.getAge());
		empdto.setSalary(employee.getSalary());
		/*
		 * boolean type=true; if (employee.getStatus().equals("Active")) { type=true;
		 * }else { type=false; }
		 */
		Boolean empstatus=Boolean.parseBoolean(employee.getStatus());
		empdto.setEmpstatus(empstatus);
		EmployeeDto insertedempdto=empdao.insertEmployee(empdto);
		return insertedempdto;

	}

	public List<EmployeeDto> getAllEmp() {
		
		List<EmployeeDto> allEmps=empdao.getAllEmp();
		
		return allEmps;
	}

	public EmployeeDto searchEmp(int empid) {
		
		EmployeeDto emp=empdao.searchEmployee(empid);
		return emp;
	}

	public EmployeeDto updateEmp(Employee employee, int empid) {
		EmployeeDto empdto=new EmployeeDto();
		empdto.setId(empid);
		empdto.setName(employee.getName());
		LocalDate date=LocalDate.parse(employee.getDob());
		empdto.setDob(date);
		empdto.setAge(employee.getAge());
		empdto.setEmail(employee.getEmail());
		
		Boolean empstatus=Boolean.parseBoolean(employee.getStatus());
		empdto.setEmpstatus(empstatus);
		empdto.setSalary(employee.getSalary());
		 EmployeeDto updto=empdao.updateEmp(empdto);
		return updto;
	}

	public EmployeeDto deleteEmp(int empid) {
	EmployeeDto searchedemp=searchEmp(empid);
	  EmployeeDto delemp= empdao.deleteEmployee(searchedemp);
		return delemp;
	}


}
