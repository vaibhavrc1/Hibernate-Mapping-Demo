package com.companyname.hibernatedemo.association.manytoone.uni.service;

import com.companyname.hibernatedemo.association.manytoone.uni.entity.Book;
import com.companyname.hibernatedemo.association.manytoone.uni.entity.Student;
import com.companyname.hibernatedemo.association.manytoone.uni.repository.ManyToOneRepository;

public class ManyToOneService {
	
	private ManyToOneRepository repo;
	
	public void runManyToOne() {
		repo=new ManyToOneRepository();
		
		Book book1=new Book();
		book1.setBookName("DSA");
		
		Book book2=new Book();
		book2.setBookName("Spring Boot");
		
		Book book3=new Book();
		book3.setBookName("Novel");
		
		Book book4=new Book();
		book4.setBookName("Horror");
		
		Student student1=new Student();
		student1.setStudentName("Sam");
		student1.setBook(book1);
		
		Student student2=new Student();
		student2.setStudentName("Tom");
		student2.setBook(book1);
		
		repo.save(student1);
		repo.save(student2);
	}
}
