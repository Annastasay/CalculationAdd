package com.add.CalculationAdd.service;

import com.add.CalculationAdd.mapper.PostRequestToEntityMapper;
import com.add.CalculationAdd.model.post.CreatePostRequest;
import com.add.CalculationAdd.model.post.PostEntity;
import com.add.CalculationAdd.model.post.PostResponse;
import com.add.CalculationAdd.model.post.UpdatePostRequest;
import com.add.CalculationAdd.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PostService {
    private final PostRepository postRepository;
    private final PostRequestToEntityMapper mapper;

    @Transactional
    public PostResponse create(CreatePostRequest request) {
        PostEntity createdEntity = mapper.createPostRequestToPostEntity(request);
        return mapper.postEntityToPostResponse(postRepository.save(createdEntity));
    }

    @Transactional
    public List<PostResponse> findAllByUserId(Long userId) {
        List<PostEntity> entities = postRepository.findAllByUserId(userId);
        return mapper.listPostEntityToPostResponse(entities);
    }

    @Transactional
    public PostResponse findById(Long postId) {
        Optional<PostEntity> entity = postRepository.findById(postId);
        if (entity.isPresent()) {
            return mapper.postEntityToPostResponse(entity.get());
        } else {
            throw new NullPointerException("Пользователь с таким id не найден!");
        }
    }

    @Transactional
    public PostResponse update(Long postId, UpdatePostRequest request) {
        Optional<PostEntity> updatedEntity = postRepository.findById(postId);
        if (updatedEntity.isPresent()) {
            PostEntity newEntity = updatedEntity.get();
            newEntity.setBody(request.getBody());
            return mapper.postEntityToPostResponse(newEntity);
        } else {
            throw new NullPointerException("Пользователь с таким id не найден!");
        }
    }

    @Transactional
    public String delete(Long postId) {
        Optional<PostEntity> entity = postRepository.findById(postId);
        if (entity.isPresent()) {
            postRepository.delete(entity.get());
            return "Запись удалена";
        } else {
            return "Пользователь с таким id не найден!";
        }
    }

    @Transactional
    public String deleteByUserId(Long userId) {
        List<PostEntity> entities = postRepository.findAllByUserId(userId);
        System.out.println(entities.size());
        if (entities.isEmpty()) {
            return "Пользователь с таким id не найден!";
        } else {
            postRepository.deleteAll(entities);
        }
        return String.format("Все записи пользователя %d были удалены", userId);
    }
}
