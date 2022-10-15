package com.companyname.hibernatedemo.association.manytomany.bi.service;

import java.util.Set;

import com.companyname.hibernatedemo.association.manytomany.bi.entity.Book;
import com.companyname.hibernatedemo.association.manytomany.bi.entity.Student;
import com.companyname.hibernatedemo.association.manytomany.bi.repository.ManyToManyBiRepository;

public class ManyToManyBiService {
	
	private ManyToManyBiRepository repo;
	
	public void runManyToManyBi() {
		repo=new ManyToManyBiRepository();
		
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
		bookList1.add(book2);
		bookList1.add(book4);
		student1.setBooks(bookList1);
		
		Student student2=new Student();
		student2.setStudentName("Tom");
		Set<Book> bookList2=student2.getBooks();
		bookList2.add(book2);
		bookList2.add(book4);
		student2.setBooks(bookList2);
		
		book2.getStudents().add(student1);
		book2.getStudents().add(student2);
		
		repo.save(student1);
		repo.save(student2);
		
		repo.getBook(book2.getBid());
	}
}
