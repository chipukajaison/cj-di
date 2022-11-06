package com.chipukajaison.cjdi.controllers;

import com.chipukajaison.cjdi.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/*
 *
 * Author   : Jaison.Chipuka
 * Email    : chipukajaison@gmail.com
 * Date     : Sunday 06 November 2022
 * Project  : cj-di
 *
 */

class ConstructorInjectedControllerTest {

    ConstructorInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new ConstructorInjectedController(new ConstructorGreetingService());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}