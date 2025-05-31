package com.github.sawafrolov.authservice.services.impl;

import com.github.sawafrolov.authservice.dto.AuthDto;
import com.github.sawafrolov.authservice.dto.HelloResponseDto;
import com.github.sawafrolov.authservice.services.HelloService;
import com.github.sawafrolov.authservice.services.KeycloakService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class HelloServiceImpl implements HelloService {

    private final KeycloakService keycloakService;

    @Override
    public HelloResponseDto hello(AuthDto authDto) {
        keycloakService.authenticate(authDto);
        String response = String.format("Hello, %s!", authDto.getUsername());
        return HelloResponseDto
                .builder()
                .response(response)
                .build();
    }
}
