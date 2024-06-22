package com.core.java.basics.interview;
import java.util.*;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrentModificationdemo {

	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		//List<String> list=new CopyOnWriteArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		
		Iterator<String> it=list.iterator();
		while(it.hasNext()) {
			String element=it.next();
			System.out.println(element);
			list.add("d");
			
		}

	}

}
