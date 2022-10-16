# Hibernate-Mapping-Demo
Mapping Demo For Hibernate Which includes Inheritance and Association Mappings

Steps for setup:

1.Create oracle schema with username:dev, password: dev

2.Clone this repository

3.Import this repository using import as maven project in your IDE

4.Change the no=0 variable to different value in main class to different value
Example: int no=1;

5.Uncomment the mapping section for the number you selected in hibernate.cfg.config file
Example: 
		<!--1-->
		<!--Inheritance--> 
		<mapping class="com.companyname.hibernatedemo.inheritance.beans.Employee"/>
		<mapping class="com.companyname.hibernatedemo.inheritance.beans.HardwareEngineer"/>
		<mapping class="com.companyname.hibernatedemo.inheritance.beans.SoftwareEngineer"/>
		<mapping class="com.companyname.hibernatedemo.inheritance.beans.Admin"/>
		
6.Run the code

Note: You can use different database other than oracle by editing hibernate.config.cfg file.


