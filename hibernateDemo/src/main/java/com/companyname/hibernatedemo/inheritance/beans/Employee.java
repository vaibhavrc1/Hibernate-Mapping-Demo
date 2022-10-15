package com.companyname.hibernatedemo.inheritance.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String email;
	private Integer salary;
	
}
