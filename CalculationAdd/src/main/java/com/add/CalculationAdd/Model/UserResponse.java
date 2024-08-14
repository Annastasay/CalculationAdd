package com.add.CalculationAdd.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
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
