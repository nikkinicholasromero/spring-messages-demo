package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
public class MainController {
    @Autowired
    private MessageSource messageSource;

    @GetMapping("")
    public String main() {
        return messageSource.getMessage("greetings", null, Locale.US);
    }
}
