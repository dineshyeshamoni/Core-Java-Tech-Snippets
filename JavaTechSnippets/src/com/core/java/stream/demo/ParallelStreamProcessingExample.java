package com.core.java.stream.demo;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLong;

public class ParallelStreamProcessingExample {
    public static void main(String[] args) {
        //1.0/0.0
		/*
		 * double z=1.0/0.0; System.out.println(z);
		 */
    	
    	
    	// Large dataset
        int[] largeData = new int[100];
        Arrays.fill(largeData, 1); // Fill with dummy data

        // Process large dataset in parallel
        AtomicLong sum = new AtomicLong(0);
        Arrays.stream(largeData)
                .parallel() // Convert to parallel stream
                .forEach(e -> sum.addAndGet(e)); // Perform parallel processing

        System.out.println("Sum of elements in the large dataset: " + sum);
    }
}

