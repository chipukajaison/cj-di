package com.chipukajaison.cjdi.services;

import org.springframework.stereotype.Service;

/**
 * Created by IntelliJ IDEA.
 * User: Jaison.Chipuka
 */

@Service
public class ConstructorGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello World - Constructor";
    }
}
