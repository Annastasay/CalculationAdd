package com.add.CalculationAdd.model.post;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Schema(description = "Создание поста")
public class CreatePostRequest {
    @Schema(description = "Id пользователя", example = "3")
    private Long userId;

    @Schema(description = "Текстовый пост", example = "Это тело поста")
    private String body;

    @Schema(description = "Дата создания поста", example = "2024-08-23T10:59:20.000+00:00")
    private Date createdDate;
}