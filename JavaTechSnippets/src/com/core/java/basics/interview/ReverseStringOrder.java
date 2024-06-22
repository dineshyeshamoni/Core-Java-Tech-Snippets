package com.core.java.basics.interview;

public class ReverseStringOrder {
	public static void main(String[] args) {
		// Input string
		String inputString = "Hello world here you go";
		// Print words in reverse order
		printWordsInReverseOrder(inputString);
		
	}

	private static void printWordsInReverseOrder(String input) {
		// Splitting the string into words
		String[] words = input.split(" ");

		// Printing the words in reverse order
		System.out.println("Original String: " + input);
		System.out.println("Words in Reverse Order:");

		for (int i = words.length - 1; i >= 0; i--) {
			System.out.print(words[i] + " ");
		}
	}
}
