package com.greetingapp.service;

import org.springframework.stereotype.Service;
import org.springframework.stereotype.Service;

//@Service
//public class GreetingService {
//
//    // Method that always returns "Hello World"
//    public String getSimpleGreeting() {
//        return "Hello World";
//    }



    @Service
    public class GreetingService {
        public String getGreetingMessage() {
            return "Hello World";
        }
    }

