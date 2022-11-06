package com.chipukajaison.cjdi.services;
/*
 *
 * Author   : Jaison.Chipuka
 * Email    : chipukajaison@gmail.com
 * Date     : Sunday 06 November 2022
 * Project  : cj-di
 *
 */

import org.springframework.stereotype.Service;

@Service
public class SetterInjectedGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - Setter Injected";
    }
}
