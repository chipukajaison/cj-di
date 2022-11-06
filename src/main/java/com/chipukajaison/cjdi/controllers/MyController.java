package com.chipukajaison.cjdi.controllers;

import org.springframework.stereotype.Controller;

/**
 * Created by IntelliJ IDEA.
 * User: Jaison.Chipuka
 */

@Controller
public class MyController {

    public String sayHello() {

        System.out.println("Hello World!!");
        return "Hi Folks";

    }

}
