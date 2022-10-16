package com.companyname.hibernatedemo.controller;

import com.companyname.hibernatedemo.association.manytomany.bi.service.ManyToManyBiService;
import com.companyname.hibernatedemo.association.manytomany.uni.service.ManyToManyService;
import com.companyname.hibernatedemo.association.manytoone.uni.service.ManyToOneService;
import com.companyname.hibernatedemo.association.onetomany.bi.service.OneToManyBiService;
import com.companyname.hibernatedemo.association.onetomany.uni.service.OneToManyService;
import com.companyname.hibernatedemo.association.onetoone.bi.service.OneToOneBiService;
import com.companyname.hibernatedemo.association.onetoone.uni.service.OneToOneService;
import com.companyname.hibernatedemo.inheritance.service.InheritanceService;

/*
 * 1: Inheritance  (SINGLE_TABLE, JOINED, TABLE_PER_CLASS)
 * 2: One  To One  Unidirectional
 * 3: One  To One  Bidirectional
 * 4: One  To Many Unidirectional
 * 5: One  To Many Bidirectional
 * 6: Many To One  Unidirectional
 * 7: Many To One  Bidirectional
 * 8: Many To Many Unidirectional
 * 9: Many To Many Bidirectional
*/
public class Controller {
	
	public void runController(int choice) {
		switch (choice) {
		case 1:
			runInheritance();
			break;
		case 2:
			runOneToOneUni();
			break;
		case 3:
			runOneToOneBi();
			break;
		case 4:
			runOneToManyUni();
			break;
		case 5:
			runOneToManyBi();
			break;
		case 6:
			runManyToOneUni();
			break;
		case 7:
			runManyToManyUni();
			break;
		case 8:
			runManyToManyBi();
			break;

		default:
			System.out.println("Invalid input");
			break;
		}
	}
	
	private void runInheritance() {
		InheritanceService service=new InheritanceService();
		service.runInheritance();
	}
	
	private void runManyToOneUni() {
		ManyToOneService service=new ManyToOneService();
		service.runManyToOne();
	}
	
	private void runOneToManyUni() {
		OneToManyService service=new OneToManyService();
		service.runOneToMany();
	}
	
	private void runManyToManyUni() {
		ManyToManyService service=new ManyToManyService();
		service.runManyToMany();
	}
	
	private void runOneToOneUni() {
		OneToOneService service=new OneToOneService();
		service.runOneToOne();
	}
	
	private void runOneToOneBi() {
		OneToOneBiService service=new OneToOneBiService();
		service.runOneToOneBi();
	}
	
	private void runOneToManyBi() {
		OneToManyBiService service=new OneToManyBiService();
		service.runOneToManyBi();
	}
	
	private void runManyToManyBi() {
		ManyToManyBiService service=new ManyToManyBiService();
		service.runManyToManyBi();
	}
}
