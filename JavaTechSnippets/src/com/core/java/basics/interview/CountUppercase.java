package com.core.java.basics.interview;

public class CountUppercase {

	public static void main(String[] args) {
		String ch="A Test hi";
		int count=0;
		for(char c: ch.toCharArray()) {
			//if(Character.isUpperCase(c)) {
			if(Character.isLowerCase(c)) {
				count++;
			}
			
		}
		System.out.println(count);

	}

}
