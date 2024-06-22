package com.core.java.basics.interview;

public class StringToIntegerConversion {
    public static void main(String[] args) {
        String numberString = "123";

        // Convert string to integer
        int convertedNumber = stringToInteger(numberString);

        // Display the result
        System.out.println("Original String: " + numberString);
        System.out.println("Converted Integer: " + convertedNumber);
    }

    private static int stringToInteger(String numberString) {
        int result = 0;
        int sign = 1;
        int index = 0;

        // Check for sign
        /*if (numberString.charAt(0) == '-') {
            sign = -1;
            index = 1;
        }*/

        // Iterate through the characters and convert to integer
        while (index < numberString.length()) {
            char digit = numberString.charAt(index);
            
            // Check if the character is a valid digit
            if (digit >= '0' && digit <= '9') {
                int digitValue = digit - '0';
                
                // Update the result by multiplying it by 10 and adding the current digit
                result = result * 10 + digitValue;
            } else {
                // Handle invalid characters if needed
                throw new NumberFormatException("Invalid character in the string");
            }

            index++;
        }

        return result * sign;
    }
}
