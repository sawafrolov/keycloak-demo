package com.github.sawafrolov.authservice.services;

import com.github.sawafrolov.authservice.dto.AuthDto;
import com.github.sawafrolov.authservice.dto.HelloResponseDto;

public interface HelloService {

    HelloResponseDto hello(AuthDto authDto);
}
