package com.core.java.basics.interview;

import java.io.*;
import java.util.*;

public class ArrayDuplicateFind {

	public static void main(String[] args) {
		int[] array = { 6, 2, 3, 1, 2, 6, 1,3 };
		Arrays.sort(array);
		for (int i = 1; i < array.length; i++) {
			if (array[i] == array[i - 1]) {
				System.out.println(array[i]);
			}
		}

	}
}

