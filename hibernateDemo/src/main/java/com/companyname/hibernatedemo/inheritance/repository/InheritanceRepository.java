package com.companyname.hibernatedemo.inheritance.repository;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.companyname.hibernatedemo.config.HibernateConfig;
import com.companyname.hibernatedemo.inheritance.beans.Employee;

public class InheritanceRepository {

	private Session session=null;
			
	public void runTablePerColumnRepository(Employee employee) {
		session=HibernateConfig.getSession();
		Transaction transaction=session.beginTransaction();
		int id =(int)session.save(employee);
		System.out.println(id);
		transaction.commit();
		session.close();
		printResult(id);
	}
	
	private void printResult(int id) {
		session=HibernateConfig.getSession();
		Transaction transaction=session.beginTransaction();
		Employee employee=session.get(Employee.class, id);
		System.out.println(employee);
		transaction.commit();
		session.close();
	}
	
}
