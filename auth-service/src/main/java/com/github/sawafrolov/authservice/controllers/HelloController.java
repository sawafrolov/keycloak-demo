package com.github.sawafrolov.authservice.controllers;

import com.github.sawafrolov.authservice.dto.AuthDto;
import com.github.sawafrolov.authservice.dto.HelloResponseDto;
import com.github.sawafrolov.authservice.services.HelloService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
@RequiredArgsConstructor
public class HelloController {

    private final HelloService helloService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public HelloResponseDto hello(@RequestBody AuthDto authDto) {
        return helloService.hello(authDto);
    }
}
