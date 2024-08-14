package com.add.CalculationAdd.Controller;

import com.add.CalculationAdd.Model.CreateUserRequest;
import com.add.CalculationAdd.Model.UserResponse;
import com.add.CalculationAdd.Service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping( "/api/user")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public UserResponse createUser(CreateUserRequest request){
        return userService.createUser(request);
    }
}
