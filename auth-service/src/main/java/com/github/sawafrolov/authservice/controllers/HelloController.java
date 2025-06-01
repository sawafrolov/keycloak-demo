package com.github.sawafrolov.authservice.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public String hello(@AuthenticationPrincipal UserDetails userDetails) {
        return String.format("Hello, %s!", userDetails.getUsername());
    }
}
