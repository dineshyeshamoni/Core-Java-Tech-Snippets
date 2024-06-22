package com.core.java.stream.demo;

import java.util.stream.IntStream;

public class ParallelStreamExample {
    public static void main(String[] args) {
        // Create a range of numbers from 1 to 10
        int startInclusive = 1;
        int endExclusive = 3;

        // Sequential Stream Example
        long sequentialSum = IntStream.range(startInclusive, endExclusive)
                .mapToLong(n -> n * n)
                .sum();
        System.out.println("Sequential Sum of Squares: " + sequentialSum);

        // Parallel Stream Example
        long parallelSum = IntStream.range(startInclusive, endExclusive)
                .parallel() // Convert to parallel stream
                .mapToLong(n -> n * n)
                .sum();
        System.out.println("Parallel Sum of Squares: " + parallelSum);
    }
}