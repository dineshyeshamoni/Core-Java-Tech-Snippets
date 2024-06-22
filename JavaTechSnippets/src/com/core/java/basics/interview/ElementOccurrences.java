package com.core.java.basics.interview;
//Write a java code for displaying key , value for occurrence of elements in an array

import java.util.HashMap;
import java.util.Map;

public class ElementOccurrences {
    
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3,7};
        
        // Create a HashMap to store element occurrences
        Map<Integer, Integer> occurrences = new HashMap<>();
        
        // Count occurrences of each element in the array
        for (int num : array) {
            occurrences.put(num, occurrences.getOrDefault(num, 0) + 1);
        }
        
        // Display key-value pairs for element occurrences
        System.out.println("Element Occurrences:");
        for (Map.Entry<Integer, Integer> entry : occurrences.entrySet()) {
            System.out.println("Element " + entry.getKey() + " - " + entry.getValue());
        }
    }
}

