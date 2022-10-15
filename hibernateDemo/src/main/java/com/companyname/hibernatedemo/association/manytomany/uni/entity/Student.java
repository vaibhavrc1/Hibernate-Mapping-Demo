package com.companyname.hibernatedemo.association.manytomany.uni.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import lombok.Data;

@Data
@Entity
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int sid;
	
	private String studentName;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable
	private Set<Book> books=new HashSet<>();
}
