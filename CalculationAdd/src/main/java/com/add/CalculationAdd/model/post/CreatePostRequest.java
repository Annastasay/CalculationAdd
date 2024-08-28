package com.add.CalculationAdd.model.post;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CreatePostRequest {
    private Long userId;
    private String body;
    private Date createdDate;
}