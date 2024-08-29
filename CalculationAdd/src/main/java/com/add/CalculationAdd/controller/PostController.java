package com.add.CalculationAdd.controller;

import com.add.CalculationAdd.model.post.CreatePostRequest;
import com.add.CalculationAdd.model.post.PostResponse;
import com.add.CalculationAdd.model.post.UpdatePostRequest;
import com.add.CalculationAdd.service.PostService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/post")
@RequiredArgsConstructor
@Tag(name = "Post Controller", description = "Ручка работы с постами пользователей")
public class PostController {
    private final PostService postService;

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    @Operation(summary = "Создание поста")
    public PostResponse createPost(@RequestBody CreatePostRequest request) {
        return postService.create(request);
    }

    @GetMapping("/find")
    @ResponseStatus(HttpStatus.OK)
    @Operation(summary = "Получение поста по id")
    public PostResponse findById(@RequestParam Long postId) {
        return postService.findById(postId);
    }

    @GetMapping("/findAll")
    @ResponseStatus(HttpStatus.OK)
    @Operation(summary = "Получение всех постов конкретного пользователя")
    public List<PostResponse> findAllByUserId(@RequestParam Long userId) {
        return postService.findAllByUserId(userId);
    }

    @PostMapping("/update")
    @ResponseStatus(HttpStatus.OK)
    @Operation(summary = "Изменение поста")
    public PostResponse update(@RequestParam Long postId, @RequestBody UpdatePostRequest request) {
        return postService.update(postId, request);
    }

    @DeleteMapping("/delete")
    @ResponseStatus(HttpStatus.OK)
    @Operation(summary = "Удаление поста")
    public String deletePost(@RequestParam Long postId) {
        return postService.delete(postId);
    }

    @DeleteMapping("/deleteByUserId")
    @ResponseStatus(HttpStatus.OK)
    @Operation(summary = "Удаление всех постов указанного пользователя")
    public String deletePostsByUserId(@RequestParam Long userId) {
        return postService.deleteByUserId(userId);
    }
}
