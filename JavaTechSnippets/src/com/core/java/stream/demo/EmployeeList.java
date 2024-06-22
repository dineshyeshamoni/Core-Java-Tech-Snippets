package com.core.java.stream.demo;

import java.io.*;
import java.util.*;
import java.util.stream.*;

public class EmployeeList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> emplist = new ArrayList<Employee>();
		emplist.add(new Employee(111, "John Brian", 34, "Male", "Acct", 2005, 13800.00));
		emplist.add(new Employee(112, "Smitha hay", 65, "Male", "Security", 1998, 10500.00));
		emplist.add(new Employee(113, "Natsha ABC", 40, "Female", "Acct", 2001, 13500.00));
		emplist.add(new Employee(114, "Danesh Yeshamoni", 35, "Male", "Acct", 2004, 13500.00));
		emplist.add(new Employee(112, "Sandy Rubella", 22, "Female", "IT", 2020, 9500.00));

		//How many male, female employees in this organization- query
		Map<String, Long> noOfMaleFemaleEmployees=emplist.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		System.out.println("Male and Female employees: "+noOfMaleFemaleEmployees);
		
		//Print the name of all departments in the organization?
	emplist.stream()
		.map(Employee::getDepartment)
		.distinct()
		.forEach(System.out::println);
	//What is the average age of male and female employees?
	Map<String, Double> avgAgeOfMaleFemaleEmployees=emplist.stream()
			.collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
	
	System.out.println("avgAgeOfMaleFemaleEmployees: "+avgAgeOfMaleFemaleEmployees);	
	//Get the details of highest paid employee in the organization?
	Optional<Employee> highestpaidEmployee=emplist.stream()
			.collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));
	System.out.println(highestpaidEmployee.get().getName());
	//Employee highpaid=highestpaidEmployee.get();
	//System.out.println("Highest paid EMP Name:"+highpaid.getName());
	
	//Get the names of all employees who have joined after 2015?
	System.out.println("Below employee joined after 2015");
	System.out.println();emplist.stream()
	.filter(e->e.getYearOfJoining()>2015)
	.map(Employee::getName)
	.forEach(System.out::println);
	//Count the number of employees in each department?
	Map<String, Long> empforEachdeptCount=emplist.stream()
			.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
	System.out.println("empforEachdeptCount:"+empforEachdeptCount);
	
	//Get the details of youngest male employee in the product development department?

	Optional<Employee> youngEmp=emplist.stream()
			.filter(e->e.getGender()=="Male" && e.getDepartment()=="Acct")
			.min(Comparator.comparingInt(Employee::getAge));
	System.out.println("Below youngest employee info"+youngEmp.get());
	
	}
	

}
