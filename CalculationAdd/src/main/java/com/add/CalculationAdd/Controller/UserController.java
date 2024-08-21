package com.add.CalculationAdd.Controller;

import com.add.CalculationAdd.Model.CreateUserRequest;
import com.add.CalculationAdd.Model.UpdateUserRequest;
import com.add.CalculationAdd.Model.UserResponse;
import com.add.CalculationAdd.Service.UserService;
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
    public UserResponse getUser(@RequestParam Long id) {
        return userService.findById(id);
    }

    @DeleteMapping("/delete")
    public String deleteUser(@RequestParam Long id) {
        return userService.deleteUser(id);
    }

    @PutMapping("/update")
    public UserResponse updateUser(
            @RequestParam Long id,
            @RequestBody UpdateUserRequest request
    ) {
        return userService.updateUser(id, request);
    }
}
