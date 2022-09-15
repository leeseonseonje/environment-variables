package com.example.env;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class EnvironmentVariables {

    @Value("${name}")
    private String name;

    @EventListener(ApplicationReadyEvent.class)
    public void test() {
        System.out.println("name = " + name);
    }
}
