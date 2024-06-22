package com.core.java.basics.interview;

public class TestGarbageCollection {

	public void finalize() {
		System.out.println("Garbage collected..!");
	}
	public static void main(String[] args) {
		TestGarbageCollection tg1= new TestGarbageCollection();
		//TestGarbageCollection tg2= new TestGarbageCollection();
		
		tg1=null;
		//tg2=null;
		System.gc();

	}

}
