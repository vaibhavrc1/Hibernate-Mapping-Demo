package com.companyname.hibernatedemo.association.manytomany.bi.repository;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.companyname.hibernatedemo.association.manytomany.bi.entity.Book;
import com.companyname.hibernatedemo.association.manytomany.bi.entity.Student;
import com.companyname.hibernatedemo.config.HibernateConfig;

public class ManyToManyBiRepository {
	
	private Session session;

	public void save(Student student) {
		session=HibernateConfig.getSession();
		Transaction transaction=session.beginTransaction();
		int sid=(int)session.save(student);
		System.out.println(sid);
		transaction.commit();
		session.close();
		getStudent(sid);
	}
	
	
	public Student getStudent(int id) {
		session=HibernateConfig.getSession();
		Transaction transaction=session.beginTransaction();
		Student studentDb=session.get(Student.class, id);
		transaction.commit();
		session.close();
		return studentDb;
	}
	
	public Book getBook(int id) {
		session=HibernateConfig.getSession();
		Transaction transaction=session.beginTransaction();
		Book bookDb=session.get(Book.class, id);
		transaction.commit();
		session.close();
		return bookDb;
	}
}
