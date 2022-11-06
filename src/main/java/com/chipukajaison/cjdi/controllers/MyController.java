package com.chipukajaison.cjdi.controllers;

import com.chipukajaison.cjdi.services.GreetingService;
import org.springframework.stereotype.Controller;

/**
 * Created by IntelliJ IDEA.
 * User: Jaison.Chipuka
 */

@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }

}
