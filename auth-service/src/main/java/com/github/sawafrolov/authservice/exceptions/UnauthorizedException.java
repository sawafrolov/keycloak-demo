package com.github.sawafrolov.authservice.exceptions;

import jakarta.annotation.Nullable;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class UnauthorizedException extends ResponseStatusException {

    public static final String REASON_UNAUTHORIZED = "Invalid username or password.";

    public UnauthorizedException(@Nullable Throwable cause) {
        super(HttpStatus.UNAUTHORIZED, REASON_UNAUTHORIZED, cause);
    }
}
