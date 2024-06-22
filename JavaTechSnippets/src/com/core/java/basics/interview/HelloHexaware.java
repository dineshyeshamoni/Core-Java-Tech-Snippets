package com.core.java.basics.interview;

import java.util.*;

public class HelloHexaware {

	public static void main(String[] args) {
		int[] test = {1, 3, 7, 2, 3,2,1 };
		Arrays.sort(test);
		findDuplicates(test);

	}

	public static void findDuplicates(int test[]) {
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < test.length-1; i++) {
			for (int j = 1; j < test.length; j++) {
				if (test[i] == test[j]) {
					set.add(test[i]);

				}

			}
		}
		System.out.println(set);
	}

}
