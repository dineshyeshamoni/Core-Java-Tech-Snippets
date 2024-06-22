package com.core.java.basics.interview;
import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class MaxMinWithCollectors {
	static List<Employee> employeelist = Arrays.asList(
			new Employee("Sam", 101, 450003.00),
			new Employee("Ram", 104, 1200.00),
			new Employee("Sam", 101, 7500.00),
			new Employee("Sam", 101, 95000.00));

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Optional<Employee> maxSalaryEmp =employeelist.stream()
				.collect(Collectors.maxBy(Comparator.comparing(Employee::getSal)));
		System.out.println("max sal emp:"+(maxSalaryEmp.isPresent()? maxSalaryEmp.get():"Not applicable"));
				

	}

}
