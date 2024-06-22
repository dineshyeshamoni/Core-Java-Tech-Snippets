package com.core.generics;

public class GenericMain {

	public static void main(String[] args) {
		//print(2,3);
		print("test");
		//print("Danesh");
		//print(10,20);
		print("java","test","welcome");

	}
	private static<T extends String> void print(T t) {
		System.out.println(t);
	}
	private static<T, U, X> void print(T t, U u, X x) {
		System.out.println(t);
		System.out.println(u);
		System.out.println(x);
	}
}
