package com.companyname.hibernatedemo.association.onetoone.bi.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;

@Data
@Entity
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int sid;
	
	private String studentName;
	
	//mapped by means foreign key column will not be created on side it is mentioned
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "student")
	private Book book;
	
	public void setBookBi(Book book) {
		book.setStudent(this);
		this.book=book;
	}
}
