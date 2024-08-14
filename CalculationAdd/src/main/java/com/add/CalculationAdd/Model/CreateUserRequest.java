package com.add.CalculationAdd.Model;


import lombok.*;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CreateUserRequest {
    private String nickname;
    private String name;
    private String lastName;
    private Integer age;
    private Date registerDate;
}
