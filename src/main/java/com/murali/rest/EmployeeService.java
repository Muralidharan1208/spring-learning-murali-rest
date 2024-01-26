package com.murali.rest;

public class EmployeeService {
	
	
	public Employee getEmployee() {
		
		Employee e1 = new Employee(1, "Murali", 15000.50);
		
		return e1;
	}
 
	
	public static void main(String args[]) {
		EmployeeService es = new EmployeeService();
		Employee x = es.getEmployee();
		//java looks for x.toString()
		// if toString() method is not found in Employee, then Java would take a look into super class 
		// Here, super class of Employee is java.lang.Object which contains a default implementation for 
		//toString method.
		//default implementation of toString returns something like this "com.murali.rest.Employee@626b2d4a"
		System.out.println(x);
	}
}
