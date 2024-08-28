package com.add.CalculationAdd.controller;

import com.add.CalculationAdd.model.post.CreatePostRequest;
import com.add.CalculationAdd.model.post.PostResponse;
import com.add.CalculationAdd.model.post.UpdatePostRequest;
import com.add.CalculationAdd.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/post")
@RequiredArgsConstructor
public class PostController {
    private final PostService postService;

    //Создание поста
    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public PostResponse createPost(@RequestBody CreatePostRequest request) {
        return postService.create(request);
    }

    //Получение поста по id
    @GetMapping("/find")
    @ResponseStatus(HttpStatus.OK)
    public PostResponse findById(@RequestParam Long postId) {
        return postService.findById(postId);
    }

    //Получение всех постов конкретного пользователя
    @GetMapping("/findAll")
    @ResponseStatus(HttpStatus.OK)
    public List<PostResponse> findAllByUserId(@RequestParam Long userId) {
        return postService.findAllByUserId(userId);
    }

    //Изменение поста
    @PostMapping("/update")
    @ResponseStatus(HttpStatus.OK)
    public PostResponse update(@RequestParam Long postId, @RequestBody UpdatePostRequest request) {
        return postService.update(postId, request);
    }

    //Удаление поста
    @DeleteMapping("/delete")
    @ResponseStatus(HttpStatus.OK)
    public String deletePost(@RequestParam Long postId) {
        return postService.delete(postId);
    }

    //Удаление всех постов указанного пользователя
    @DeleteMapping("/deleteByUserId")
    @ResponseStatus(HttpStatus.OK)
    public String deletePostsByUserId(@RequestParam Long userId) {
        return postService.deleteByUserId(userId);
    }
}
