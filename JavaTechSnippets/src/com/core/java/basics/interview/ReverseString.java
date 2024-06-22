/**
 * 
 */

package com.core.java.basics.interview;

import java.io.*;
import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		String str = "welcome", nstr = "";
		char ch;

		String s1 = "Hello world here you go 123";
		/*
		 * String[] s2 = splitString(s1); for (String word : s2) {
		 * 
		 * System.out.println(word);
		 * 
		 * }
		 */
		//printwordsinreverseOrder(s1);
		printwordsinreverseOrder(s1);

		/*
		 * for (int i = 0; i < str.length(); i++) { 
		 * ch = str.charAt(i);
		 * 
		 * System.out.println(ch); 
		 * nstr = ch + str; 
		 * } 
		 * System.out.println(nstr);
		 */

	}
	public static void printwordsinreverseOrder(String inputString) {
		String[] s3=inputString.split("");
		System.out.println("original String"+s3);
		System.out.println("AFter reverse order:");
		for (int i=s3.length-1; i>=0; i--) {
			System.out.println(s3[i]);
		}
	}

	public static String[] splitString(String s1) {
		return s1.split(" ");

	}

}
