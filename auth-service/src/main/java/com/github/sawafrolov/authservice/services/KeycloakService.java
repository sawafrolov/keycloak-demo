package com.github.sawafrolov.authservice.services;

import com.github.sawafrolov.authservice.dto.AuthDto;

public interface KeycloakService {

    void authenticate(AuthDto authDto);
}
