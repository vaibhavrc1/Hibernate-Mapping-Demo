package com.companyname.hibernatedemo.association.onetoone.bi.repository;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.companyname.hibernatedemo.association.onetoone.bi.entity.Book;
import com.companyname.hibernatedemo.association.onetoone.bi.entity.Student;
import com.companyname.hibernatedemo.config.HibernateConfig;

public class OneToOneBiRepository {
	
	private Session session;

	public void save(Student student) {
		session=HibernateConfig.getSession();
		Transaction transaction=session.beginTransaction();
		session.save(student);
		transaction.commit();
		session.close();
	}
	
	public void save(Book book) {
		session=HibernateConfig.getSession();
		Transaction transaction=session.beginTransaction();
		session.save(book);
		transaction.commit();
		session.close();
	}
}
