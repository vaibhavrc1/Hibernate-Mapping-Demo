package com.companyname.hibernatedemo.association.onetoone.bi.service;

import com.companyname.hibernatedemo.association.onetoone.bi.entity.Book;
import com.companyname.hibernatedemo.association.onetoone.bi.entity.Student;
import com.companyname.hibernatedemo.association.onetoone.bi.repository.OneToOneBiRepository;

public class OneToOneBiService {
	
	private OneToOneBiRepository repo;
	
	public void runOneToOneBi() {
		repo=new OneToOneBiRepository();
		
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
		student1.setBookBi(book1);
		
		Student student2=new Student();
		student2.setStudentName("Tom");
		student2.setBookBi(book2);
		
		repo.save(student1);
		repo.save(student2);
	}
}
