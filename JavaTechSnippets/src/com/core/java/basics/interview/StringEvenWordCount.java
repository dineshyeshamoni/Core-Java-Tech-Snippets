package com.core.java.basics.interview;

import java.util.Arrays;

public class StringEvenWordCount {

	public static void main(String[] args) {
		String Count = "Hell Worlo we Testi";
		String test="example";
		char[] c=test.toCharArray();
		Arrays.sort(c);
		System.out.println(c);
		
		
		
		for (String s : Count.split(" ")) {

			if (s.length() % 2 == 0) {
				System.out.println(s);
			} /*
				 * else if (s.length() % 2 != 0) {
				 * 
				 * System.out.println(s); }
				 */
		}
		
		

	}
}
