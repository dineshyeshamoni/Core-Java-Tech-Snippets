package com.core.java.basics.interview;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

import java.util.Iterator;

public class FailfastMap {

	public static void main(String[] args) {
		//Map<Integer, String> map=new HashMap<>();
		Map<Integer, String> map=new ConcurrentHashMap();
		map.put(1, "one");
		map.put(2, "two");
		
		Iterator it=map.keySet().iterator();
		while(it.hasNext()) {
			Integer key=(Integer) it.next();
			System.out.println(key+":"+map.get(key));
			map.put(3, "Three");
			
			}

	}

}
