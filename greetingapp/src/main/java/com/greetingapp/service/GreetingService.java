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



//    @Service
//    public class GreetingService {
//        public String getGreetingMessage() {
//            return "Hello World";
//        }

import org.springframework.stereotype.Service;


import com.greetingapp.repository.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    private final GreetingRepository greetingRepository;

    @Autowired
    public GreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    public String getGreetingMessage(String firstName, String lastName) {
        return greetingRepository.getGreetingMessage(firstName, lastName);
    }
}





