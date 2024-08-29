package com.add.CalculationAdd.model.post;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Schema(description = "Изменение поста")
public class UpdatePostRequest {
    @Schema(description = "Текстовый пост", example = "Это новое тело поста")
    private String body;
}
