package com.harsh;  
  
import java.util.Scanner;

import org.springframework.context.ApplicationContext;  
import org.springframework.context.support.ClassPathXmlApplicationContext;  
public class Test {  
  
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int status;
	System.out.println("Enter 1 to Save Employee Data");
	System.out.println("Enter 2 to Update Employee Data");
	System.out.println("Enter 3 to delete Employee Data");
	int n=sc.nextInt();
    ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");  
     
    EmployeeDao dao=(EmployeeDao)ctx.getBean("edao");  
    if(n==1) {
    status=dao.saveEmployee(new Employee(103,"Asit",35000));  
    System.out.println(status);  
    }
    else if(n==2) {
    status=dao.updateEmployee(new Employee(102,"Sonoo",15000)); 
    System.out.println(status);
    }
    else if(n==3){     
    Employee e=new Employee(); 
    e.setId(102); 
    status=dao.deleteEmployee(e); 
    System.out.println(status);  
    }
}  
  
}  