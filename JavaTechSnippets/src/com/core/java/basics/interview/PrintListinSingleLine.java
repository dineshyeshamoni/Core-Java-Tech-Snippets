package com.core.java.basics.interview;
import java.util.*;

public class PrintListinSingleLine {

	public static void main(String[] args) {
		List<String> list=Arrays.asList("Hi","wel","come");
		
		String str=String.join("", list);
		System.out.println(str);

	}

}
