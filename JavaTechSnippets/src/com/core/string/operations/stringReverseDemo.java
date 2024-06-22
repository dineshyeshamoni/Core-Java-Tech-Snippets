package com.core.string.operations;

import java.lang.*;
import java.io.*;
import java.util.*;

public class stringReverseDemo {

	public static void main(String[] args) {
		String input = "welcome";
		char[] ch = input.toCharArray();
		for (int i = ch.length - 1; i >= 0; i--) {
			System.out.println(ch[i]);
		}

		// Using CharAt() method
		String name = "gaurav";
		String reversedString = "";
		for (int i = name.length() - 1; i >= 0; i--) {
			reversedString += name.charAt(i);
		}
		System.out.println(reversedString);
		
		// using String buffer
		String test = "HELLO";
		String test1 = new StringBuffer(test).reverse().toString();

		System.out.println(test1);

	}

}
