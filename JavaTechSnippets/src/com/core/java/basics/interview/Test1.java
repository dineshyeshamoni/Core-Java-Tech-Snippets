package com.core.java.basics.interview;

import java.util.Arrays;

public class Test1 {
	public static void main(String[] args) throws Exception { 

			char[] chars = new char[] {'\u0097'}; 
			String str = new String(chars); 
			byte[] bytes = str.getBytes(); 
			System.out.println(Arrays.toString(bytes));
			} 
}
