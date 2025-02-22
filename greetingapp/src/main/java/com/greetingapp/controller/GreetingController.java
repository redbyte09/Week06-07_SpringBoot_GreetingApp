package com.greetingapp.controller;

import com.greetingapp.service.GreetingService;
import com.greetingapp.model.Greeting;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/api")
public class GreetingController {

    private final GreetingService greetingService;

    @Autowired
    public GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    // UC1: Basic Greetings
    @GetMapping("/greet")
    public Greeting getGreeting() {
        return new Greeting("Hello from BridgeLabz");
    }

    @PostMapping("/greet")
    public Greeting postGreeting(@RequestBody Greeting greeting) {
        return greeting;
    }

    @PutMapping("/greet")
    public Greeting putGreeting(@RequestBody Greeting greeting) {
        return new Greeting("Updated: " + greeting.getMessage());
    }

    @DeleteMapping("/greet")
    public Greeting deleteGreeting() {
        return new Greeting("Greeting deleted");
    }

    // UC2: Greeting Service with Default Message
    @GetMapping("/greetservice")
    public Greeting getDefaultGreeting() {
        return new Greeting(greetingService.getGreetingMessage(null, null));
    }

    // UC3: Personalized Greeting with First Name and Last Name
    @GetMapping("/greetservice/custom") // UC3 Starts here
    public Greeting getCustomGreeting(
            @RequestParam(required = false) String firstName,
            @RequestParam(required = false) String lastName) {
        return new Greeting(greetingService.getGreetingMessage(firstName, lastName));
    }
}
