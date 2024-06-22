package com.core.java.basics.interview;

public class PrintDuplicateinArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 2,5};
        printDuplicates(array);
    }

    public static void printDuplicates(int[] array) {
        System.out.println("Duplicate elements in the array:");
        // Iterate through each element in the array
        for (int i = 0; i < array.length; i++) {
            // Check if the current element is a duplicate
            boolean isDuplicate = false;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            // If a duplicate is found, print it
            if (isDuplicate) {
                System.out.println(array[i]);
            }
        }
    }
}
