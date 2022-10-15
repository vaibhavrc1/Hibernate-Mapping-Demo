package com.companyname.hibernatedemo.association.onetomany.uni.repository;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.companyname.hibernatedemo.association.onetomany.uni.entity.Student;
import com.companyname.hibernatedemo.config.HibernateConfig;


public class OneToManyRepository {
	
	private Session session;

	public void save(Student student) {
		session=HibernateConfig.getSession();
		Transaction transaction=session.beginTransaction();
		int sid=(int)session.save(student);
		System.out.println(sid);
		transaction.commit();
		session.close();
		printResult(sid);
	}
	
	private void printResult(int id) {
		session=HibernateConfig.getSession();
		Transaction transaction=session.beginTransaction();
		Student student=session.get(Student.class, id);
		System.out.println(student);
		transaction.commit();
		session.close();
	}
}
