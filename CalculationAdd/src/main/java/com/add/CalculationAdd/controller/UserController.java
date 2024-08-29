package com.add.CalculationAdd.controller;

import com.add.CalculationAdd.model.user.CreateUserRequest;
import com.add.CalculationAdd.model.user.FullUserResponse;
import com.add.CalculationAdd.model.user.UpdateUserRequest;
import com.add.CalculationAdd.model.user.UserResponse;
import com.add.CalculationAdd.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
@RequiredArgsConstructor
@Tag(name = "User Controller", description = "Ручка работы с пользователем")
public class UserController {
    private final UserService userService;

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    @Operation(summary = "Создание пользователя")
    public UserResponse createUser(@RequestBody CreateUserRequest request) {
        return userService.createUser(request);
    }

    @GetMapping("/get")
    @Operation(summary = "Поиск пользователя по id")
    public UserResponse getUser(@RequestParam Long userId) {
        return userService.findById(userId);
    }

    @GetMapping("/getAll")
    @Operation(summary = "Получение пользователя и всех его постов")
    public FullUserResponse getAllAboutUser(@RequestParam Long userId) {
        return userService.findUserAndPostsById(userId);
    }

    @DeleteMapping("/delete")
    @Operation(summary = "Удаление пользователя")
    public String deleteUser(@RequestParam Long userId) {
        return userService.deleteUser(userId);
    }

    @PutMapping("/update")
    @Operation(summary = "Изменение пользователя")
    public UserResponse updateUser(
            @RequestParam Long userId,
            @RequestBody UpdateUserRequest request
    ) {
        return userService.updateUser(userId, request);
    }
}
