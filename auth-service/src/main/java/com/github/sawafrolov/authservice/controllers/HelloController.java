package com.github.sawafrolov.authservice.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.security.core.AuthenticatedPrincipal;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.OAuth2AuthenticatedPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public String hello(@AuthenticationPrincipal OAuth2AuthenticatedPrincipal authenticatedPrincipal) {
        return Optional.ofNullable(authenticatedPrincipal)
                .map(AuthenticatedPrincipal::getName)
                .map(username -> String.format("Hello, %s!", username))
                .orElse("Не удалось передать токен авторизации");
    }
}
