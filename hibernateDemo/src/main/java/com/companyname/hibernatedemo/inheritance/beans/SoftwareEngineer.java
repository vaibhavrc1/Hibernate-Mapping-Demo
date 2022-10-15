package com.companyname.hibernatedemo.inheritance.beans;

import javax.persistence.Entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = false)
@Entity
public class SoftwareEngineer extends Employee{

	private String tool;
	
}
