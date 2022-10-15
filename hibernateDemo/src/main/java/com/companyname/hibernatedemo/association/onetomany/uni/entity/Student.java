package com.companyname.hibernatedemo.association.onetomany.uni.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.Data;

@Data
@Entity
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int sid;
	
	private String studentName;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "studentfk")
	private Set<Book> books=new HashSet<>();
}
