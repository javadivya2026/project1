package com.example;

import java.util.*;
public class AppUtil {

   // Using ArrayList
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        // Using Collections utility class
        Collections.sort(names);
        System.out.println("Sorted Names: " + names);

        // Simulated user input
        String userName = "User";
        System.out.println("Hello, " + userName + "!");

}
