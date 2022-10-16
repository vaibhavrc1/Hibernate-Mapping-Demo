package com.companyname.hibernatedemo.inheritance.service;

import com.companyname.hibernatedemo.inheritance.beans.Admin;
import com.companyname.hibernatedemo.inheritance.beans.SoftwareEngineer;
import com.companyname.hibernatedemo.inheritance.repository.InheritanceRepository;

public class InheritanceService {

	public void runInheritance() {
		SoftwareEngineer se=new SoftwareEngineer();
		se.setName("helloSE");
		se.setEmail("hello@se.com");
		se.setSalary(500);
		se.setTool("Spring");
		
		Admin admin=new Admin();
		admin.setName("helloaAdmin");
		admin.setEmail("hello@admin.com");
		admin.setSalary(300);
		admin.setBranchName("Master");
		
		InheritanceRepository repo=new InheritanceRepository();
		repo.runTablePerColumnRepository(se);
		repo.runTablePerColumnRepository(admin);
		
	}
	
}
