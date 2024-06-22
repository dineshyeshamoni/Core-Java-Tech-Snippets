package com.core.java.basics.interview;

public class HashcodeEqualsDemo {

	public static void main(String[] args) {
		String st1 = new String("Welcome");
		String st2 = new String("Welcome");
		//System.out.println(st1 == st2);

		if (st1.equals(st2)) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
		System.out.println("Hash code st1"+st1.hashCode());
		System.out.println("Hash code st2"+st2.hashCode());

	}

}
