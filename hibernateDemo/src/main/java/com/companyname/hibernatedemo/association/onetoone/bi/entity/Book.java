package com.companyname.hibernatedemo.association.onetoone.bi.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.Data;

@Data
@Entity
public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int bid;
	
	private String bookName;
	
	@OneToOne
	@JoinColumn(name="student_fk")
	private Student student;

}
