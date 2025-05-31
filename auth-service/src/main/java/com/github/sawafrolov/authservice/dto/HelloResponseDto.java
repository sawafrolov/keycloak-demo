package com.github.sawafrolov.authservice.dto;

import lombok.Builder;
import lombok.Getter;

/**
 * DTO для ответа эндпоинта /hello
 */
@Getter
@Builder
public class HelloResponseDto {

    /**
     * Ответ эндпоинта /hello
     */
    private String response;

    /**
     * Конструктор DTO для ответа эндпоинта /hello
     * @param username Имя пользователя
     */
    public HelloResponseDto(String username) {
        response = String.format("Hello, %s!", username);
    }
}
