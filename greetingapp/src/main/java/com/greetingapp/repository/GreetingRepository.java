package com.greetingapp.repository;

import org.springframework.stereotype.Repository;

@Repository
public class GreetingRepository {

    // Method to generate greeting based on user input
    public String getGreetingMessage(String firstName, String lastName) {
        if (firstName != null && !firstName.isEmpty() && lastName != null && !lastName.isEmpty()) {
            return "Hello, " + firstName + " " + lastName + "!";
        } else if (firstName != null && !firstName.isEmpty()) {
            return "Hello, " + firstName + "!";
        } else if (lastName != null && !lastName.isEmpty()) {
            return "Hello, " + lastName + "!";
        } else {
            return "Hello World!";
        }
    }
}
