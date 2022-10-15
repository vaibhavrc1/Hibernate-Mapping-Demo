package com.companyname.hibernatedemo.association.manytomany.bi.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.Data;

@Data
@Entity
public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int bid;
	
	private String bookName;

	@ManyToMany(cascade = CascadeType.ALL,mappedBy = "books")
	private Set<Student> students=new HashSet<>();
}
