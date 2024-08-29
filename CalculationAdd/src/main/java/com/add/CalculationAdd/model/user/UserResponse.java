package com.add.CalculationAdd.model.user;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Schema(description = "Профиль пользователя")
public class UserResponse {
    @Schema(description = "Id пользователя", example = "3")
    private Long userId;

    @Schema(description = "Никнейм пользователя", example = "pavel1")
    private String nickname;

    @Schema(description = "Имя пользователя", example = "Pavel")
    private String name;

    @Schema(description = "Фамилия пользователя", example = "Durov")
    private String lastName;

    @Schema(description = "Возраст пользователя", example = "33")
    private int age;

    @Schema(description = "Дата регистрации пользователя", example = "2024-08-23T10:59:20.000+00:00")
    private Date registerDate;
}
