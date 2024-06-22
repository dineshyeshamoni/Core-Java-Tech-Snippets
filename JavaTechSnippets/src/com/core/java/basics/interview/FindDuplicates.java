package com.core.java.basics.interview;

import java.io.*;
import java.util.*;

public class FindDuplicates {

	public static void main(String[] args) {
		int[] arr = { 1, 4, 6, 7, 1, 4, 6 };
		finduplicaesHashSet(arr);
		findDuplicatesUsingHashMap(arr);

	}

	public static void finduplicaesHashSet(int[] arr) {
		Set<Integer> set = new HashSet<>();
		Set<Integer> duplicates = new HashSet<>();
		for (int num : arr) {
			if (!set.add(num)) {
				duplicates.add(num);

			}
		}
		System.out.println(duplicates);

	}
	private static void findDuplicatesUsingHashMap(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        Set<Integer> duplicates = new HashSet<>();
        
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                duplicates.add(entry.getKey());
            }
        }
        
        System.out.println("Duplicates using HashMap: " + duplicates);
    }
}


