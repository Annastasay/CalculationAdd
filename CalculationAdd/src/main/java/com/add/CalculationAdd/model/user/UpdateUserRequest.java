package com.add.CalculationAdd.model.user;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Schema(description = "Обновление пользователя")
public class UpdateUserRequest {
    @Schema(description = "Никнейм пользователя", example = "pavel2")
    private String nickname;
}
