package com.core.java.basics.interview;

public class tryCatch {
	static int anyMethod() {
		int i=1;
		try{
			i=i+1;//2
			//return i;
		}catch(Exception e) {
			i=i+2;
		}finally {
			i=i+3;//5
			return i;
		}
		
	}

	public static void main(String[] args) {
		System.out.println(anyMethod());
		

	}

}
