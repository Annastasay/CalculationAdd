package com.add.CalculationAdd.model.user;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class UserResponse {
    private Long userId;
    private String nickname;
    private String name;
    private String lastName;
    private int age;
    private Date registerDate;
}
