package com.core.java.basics.interview;

public class PassByValue {

	public static void main(String[] args) {
		int x=1;
		passByValueMethod(x);
		System.out.println("in main Method():"+x);

	}

	private static void passByValueMethod(int a) {
		a=10;
	}

}
