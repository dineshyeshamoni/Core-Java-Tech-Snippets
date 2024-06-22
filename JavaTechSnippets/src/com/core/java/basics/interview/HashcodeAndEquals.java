package com.core.java.basics.interview;

public class HashcodeAndEquals {

	public static void main(String[] args) {
		Student s1=new Student("Ramesh", 1);
		Student s2=new Student("Ramesh", 1);
				
		if(s1.equals(s2)) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
		System.out.println("S1 hashcode: "+s1.hashCode());
		System.out.println("S2 hashcode: "+s2.hashCode());

	}

}
