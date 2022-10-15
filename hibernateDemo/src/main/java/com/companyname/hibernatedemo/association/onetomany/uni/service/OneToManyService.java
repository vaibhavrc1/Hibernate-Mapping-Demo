package com.companyname.hibernatedemo.association.onetomany.uni.service;

import java.util.Set;

import com.companyname.hibernatedemo.association.onetomany.uni.entity.Book;
import com.companyname.hibernatedemo.association.onetomany.uni.entity.Student;
import com.companyname.hibernatedemo.association.onetomany.uni.repository.OneToManyRepository;

public class OneToManyService {
	
	private OneToManyRepository repo;
	
	public void runOneToMany() {
		repo=new OneToManyRepository();
		
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
		Set<Book> bookList1=student1.getBooks();
		bookList1.add(book1);
		bookList1.add(book4);
		student1.setBooks(bookList1);
		
		Student student2=new Student();
		student2.setStudentName("Tom");
		Set<Book> bookList2=student2.getBooks();
		bookList2.add(book2);
		bookList2.add(book3);
		student2.setBooks(bookList2);
		
		repo.save(student1);
		repo.save(student2);
	}
}
