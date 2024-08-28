package com.add.CalculationAdd.controller;

import com.add.CalculationAdd.model.user.CreateUserRequest;
import com.add.CalculationAdd.model.user.FullUserResponse;
import com.add.CalculationAdd.model.user.UpdateUserRequest;
import com.add.CalculationAdd.model.user.UserResponse;
import com.add.CalculationAdd.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public UserResponse createUser(@RequestBody CreateUserRequest request) {
        return userService.createUser(request);
    }

    @GetMapping("/get")
    public UserResponse getUser(@RequestParam Long userId) {
        return userService.findById(userId);
    }

    @GetMapping("/getAll")
    public FullUserResponse getAllAboutUser(@RequestParam Long userId) {
        return userService.findUserAndPostsById(userId);
    }

    @DeleteMapping("/delete")
    public String deleteUser(@RequestParam Long userId) {
        return userService.deleteUser(userId);
    }

    @PutMapping("/update")
    public UserResponse updateUser(
            @RequestParam Long userId,
            @RequestBody UpdateUserRequest request
    ) {
        return userService.updateUser(userId, request);
    }
}
