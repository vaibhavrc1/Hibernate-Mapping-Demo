package com.companyname.hibernatedemo;

import java.util.Scanner;

import com.companyname.hibernatedemo.config.HibernateConfig;
import com.companyname.hibernatedemo.controller.Controller;

/*
 * 1: Inheritance  (SINGLE_TABLE, JOINED, TABLE_PER_CLASS)
 * 2: One  To One  Unidirectional
 * 3: One  To One  Bidirectional
 * 4: One  To Many Unidirectional
 * 5: One  To Many Bidirectional same as Many To One  Bidirectional
 * 6: Many To One  Unidirectional
 * 7: Many To Many Unidirectional
 * 8: Many To Many Bidirectional
*/
public class App 
{
    public static void main( String[] args )
    { 
    	//Change this number for selecting operation: 1,2,3,4,5,6,7,8
    	int no=0;
        Controller controller=new Controller();
        controller.runController(no);
        Scanner sc=new Scanner(System.in);
        String choice=null;
        do{
        	System.out.println("Check Database Tables");
        	System.out.println("Stop program(Clear tables): y/n");
        	choice=sc.next();
        }while(!choice.equalsIgnoreCase("y"));
        HibernateConfig.close();
        sc.close();
    }
}
