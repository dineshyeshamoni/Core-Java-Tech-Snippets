package com.core.java.basics.interview;

public class Palindrome {

	public static void main(String[] args) {
		String original="aabaa";
		String reversed= new StringBuilder(original).reverse().toString();
		//return original.equals(reversed);
		
		if(original.equals(reversed)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("not Palindrome");
		}

	}

}
