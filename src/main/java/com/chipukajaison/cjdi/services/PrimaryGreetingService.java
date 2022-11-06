package com.chipukajaison.cjdi.services;
/*
 *
 * Author   : Jaison.Chipuka
 * Email    : chipukajaison@gmail.com
 * Date     : Sunday 06 November 2022
 * Project  : cj-di
 *
 */

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class PrimaryGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - from PRIMARY Bean";
    }
}
