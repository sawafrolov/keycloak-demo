package com.github.sawafrolov.authservice.services.impl;

import com.github.sawafrolov.authservice.dto.AuthDto;
import com.github.sawafrolov.authservice.services.KeycloakService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class KeycloakServiceImpl implements KeycloakService {

    @Override
    public void authenticate(AuthDto authDto) {
        // todo реализовать
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
