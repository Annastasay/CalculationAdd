package com.add.CalculationAdd.model.user;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Schema(description = "Создание пользователя")
public class CreateUserRequest {

    String obj;


    @Schema(description = "Никнейм пользователя", example = "pavel1")
    private String nickname;

    @Schema(description = "Имя пользователя", example = "Pavel")
    private String name;

    @Schema(description = "Фамилия пользователя", example = "Durov")
    private String lastName;

    @Schema(description = "Возраст пользователя", example = "33")
    private Integer age;

    @Schema(description = "Дата регистрации пользователя", example = "2024-08-23T10:59:20.000+00:00")
    private Date registerDate;
}
