package com.add.CalculationAdd.model.post;


import lombok.*;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PostResponse {
    private Long postId;
    private Long userId;
    private String body;
    private Date createdDate;
}
