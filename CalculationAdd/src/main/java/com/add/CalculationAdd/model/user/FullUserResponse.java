package com.add.CalculationAdd.model.user;


import com.add.CalculationAdd.model.post.PostResponse;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
public class FullUserResponse {
    private Long userId;
    private String nickname;
    private String name;
    private String lastName;
    private int age;
    private Date registerDate;
    private List<PostResponse> posts;
}
