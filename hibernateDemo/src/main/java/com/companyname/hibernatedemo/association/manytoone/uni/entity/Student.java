package com.companyname.hibernatedemo.association.manytoone.uni.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
@Entity
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int sid;
	
	private String studentName;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "bookfk")
	private Book book;
}
