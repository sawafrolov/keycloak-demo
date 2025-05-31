package com.github.sawafrolov.authservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * DTO для аутентификации
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AuthDto {

    /**
     * Имя пользователя
     */
    private String username;

    /**
     * Пароль
     */
    private String password;
}
