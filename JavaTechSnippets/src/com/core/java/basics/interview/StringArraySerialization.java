package com.core.java.basics.interview;

import java.io.*;

public class StringArraySerialization {
    
    public static void serialize(String[] array, String filename) throws IOException {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename))) {
            out.writeObject(array);
        }
    }
    
    public static String[] deserialize(String filename) throws IOException, ClassNotFoundException {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename))) {
            return (String[]) in.readObject();
        }
    }

    public static void main(String[] args) {
        String[] originalArray = {"Hello", "World", "Java", "Serialization"};
        String filename = "stringArray.ser";

        // Serialize the array
        try {
            serialize(originalArray, filename);
            System.out.println("Array serialized successfully.");
        } catch (IOException e) {
            System.err.println("Error occurred during serialization: " + e.getMessage());
        }

        // Deserialize the array
        try {
            String[] deserializedArray = deserialize(filename);
            System.out.println("Deserialized array:");
            for (String str : deserializedArray) {
                System.out.println(str);
            }
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error occurred during deserialization: " + e.getMessage());
        }
    }
}
