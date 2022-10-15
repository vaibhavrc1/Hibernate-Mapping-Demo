package com.companyname.hibernatedemo.association.onetoone.uni.service;

import com.companyname.hibernatedemo.association.onetoone.uni.entity.Book;
import com.companyname.hibernatedemo.association.onetoone.uni.entity.Student;
import com.companyname.hibernatedemo.association.onetoone.uni.repository.OneToOneRepository;

public class OneToOneService {
	
	private OneToOneRepository repo;
	
	public void runOneToOne() {
		repo=new OneToOneRepository();
		
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
