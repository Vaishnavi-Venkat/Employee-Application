package com.ty.employeeappspringmvc.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ty.employeeappspringmvc.service.EmployeeDto;

@Repository
public class EmployeeDao {

	@Autowired
	private EntityManagerFactory factory;

	public EmployeeDto insertEmployee(EmployeeDto empdto) {

		EntityManager manager=factory.createEntityManager();
		EntityTransaction tx=manager.getTransaction();
		try {
			tx.begin();
			manager.persist(empdto);
			tx.commit();
			return empdto;
		}catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
			return null;	
		}
	}

	public List<EmployeeDto> getAllEmp() {

		EntityManager manager=factory.createEntityManager();
		Query query=manager.createQuery("FROM EmployeeDto");
		query.getResultList();
		return query.getResultList();
	}

	public EmployeeDto searchEmployee(int empid) {

		EntityManager manager=factory.createEntityManager();
		EmployeeDto emp=manager.find(EmployeeDto.class, empid);
		return emp;
	}

	public EmployeeDto updateEmp(EmployeeDto empdto) {
		EntityManager manager=factory.createEntityManager();
		EntityTransaction tx=manager.getTransaction();
		try {
			tx.begin();
			manager.merge(empdto);
			tx.commit();
			return empdto;
		}catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
			return null;	
		}
	}

	public EmployeeDto deleteEmployee(EmployeeDto searchedemp) {
		
		EntityManager manager=factory.createEntityManager();
		EntityTransaction tx=manager.getTransaction();
		try {
			tx.begin();
			EmployeeDto dto=manager.merge(searchedemp);
			manager.remove(dto);
			tx.commit();
			return searchedemp;
		}catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
			return null;	
		}
	}

}
