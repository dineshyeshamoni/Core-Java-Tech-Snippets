package com.core.java.basics.interview;

import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

public class EvenNO {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(3, 1, 6, 8, 90, 21, 12,6);
		List<Integer> evenNumbers =list.stream()
				.filter(n->n%2==0)
				.collect(Collectors.toList());
		System.out.println("even no's:"+evenNumbers);

	}

}
