package com.core.java.basics.interview;
import java.io.*;
import java.text.DecimalFormat;

public class Employee {
	
	String name;
	Integer id;
	Double sal;
	
	public Employee(String name,Integer id,  Double sal) {
		this.id=id;
		this.name=name;
		this.sal=sal;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Double getSal() {
		return sal;
	}

	public void setSal(Double sal) {
		this.sal = sal;
	}
	
	public String toString(){
	    DecimalFormat dformat = new DecimalFormat(".##");
	    return "Employee Name:"+this.name 
	        + "  id:"+this.id
	        + "  Salary:"+dformat.format(this.sal);
	  }
	
	  //Standard equals() and hashcode() implementations go here
	}


