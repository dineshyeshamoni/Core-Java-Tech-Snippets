package com.core.string.operations;

import java.util.*;
import java.lang.*;

public class revresewithStringBuilder {

	public static void main(String[] args) {
		String source="welcome";
		reverseIt(source);
		//Using stringbuffer
		String string1="whatever";
		String reverse = new StringBuffer(string1).reverse().toString();
		System.out.println(reverse);
		
		String test="HelloJava";
		String rev=new StringBuffer(test).reverse().toString();
		System.out.println(rev);
		

	}
	public static String reverseIt(String source) {
		int i, len = source.length();
	    StringBuilder dest = new StringBuilder(len);

	    for (i = (len - 1); i >= 0; i--){
	        dest.append(source.charAt(i));
	        
	    }
	    System.out.println(dest);

	    return dest.toString();
	    
	    
	}

}
