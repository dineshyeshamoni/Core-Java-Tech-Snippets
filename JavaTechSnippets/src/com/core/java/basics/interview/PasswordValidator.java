package com.core.java.basics.interview;

import java.util.ArrayList;
import java.util.List;

public class PasswordValidator {

    public static List<Integer> validatePassword(String password) {
        List<Integer> violations = new ArrayList<>();
        if (password.length() < 10) {
            violations.add(1); // Rule 1: Password length should be at least 10 characters
        }
        if (!password.matches(".*[A-Z].*")) {
            violations.add(2); // Rule 2: Password should contain at least one uppercase letter
        }
        if (!password.matches(".*[0-9].*")) {
            violations.add(3); // Rule 3: Password should contain at least one digit
        }
        if (!password.matches(".*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?].*")) {
            violations.add(4); // Rule 4: Password should contain at least one special character
        }
        if (password.matches(".*password.*")) {
            violations.add(5); // Rule 5: Password should not contain the word "password"
        }
        return violations;
    }

    public static void main(String[] args) {
        //String password = "Strongpwd9999#abc";
    	String password = "Strongp";
        List<Integer> violations = validatePassword(password);
        System.out.println("Violations for password: " + violations);
    }
}
