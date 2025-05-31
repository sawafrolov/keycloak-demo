package com.github.sawafrolov.authservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * DTO для ответа эндпоинта /hello
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class HelloResponseDto {

    /**
     * Ответ эндпоинта /hello
     */
    private String response;
}
