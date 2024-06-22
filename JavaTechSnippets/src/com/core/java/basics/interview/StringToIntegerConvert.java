package com.core.java.basics.interview;

public class StringToIntegerConvert {

	public static void main(String[] args) {
		String s = "869555";
		Convert(s);
		String test = "25";

		try {
			int number = Integer.parseInt(test);
			System.out.println(number);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}

	}

	// String to int conversion without API methods

	public static void Convert(String s) {

		int num = 0;
		int n = s.length();
		for (int i = 0; i < n; i++) {
			num = num * 10 + ((int) s.charAt(i) - 48);

		}
		System.out.println("Before convert" + s);
		System.out.println("after convert" + num);

	}

	//

}
