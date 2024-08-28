package com.add.CalculationAdd.service;

import com.add.CalculationAdd.mapper.UserRequestToEntityMapper;
import com.add.CalculationAdd.model.post.PostEntity;
import com.add.CalculationAdd.model.post.PostResponse;
import com.add.CalculationAdd.model.user.*;
import com.add.CalculationAdd.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final UserRequestToEntityMapper mapper;

    @Transactional
    public UserResponse createUser(CreateUserRequest request) {
        UserEntity entity = mapper.createUserRequestToEntity(request);
        return mapper.entityToResponse(userRepository.save(entity));
    }

    @Transactional
    public UserResponse findById(Long userId) {
        Optional<UserEntity> entity = userRepository.findById(userId);
        if (entity.isPresent()) {
            return mapper.entityToResponse(entity.get());
        } else {
            throw new NullPointerException("Пользователь с таким id не найден!");
        }
    }

    @Transactional
    public FullUserResponse findUserAndPostsById(Long userId) {
        Optional<UserEntity> userEntity = userRepository.findById(userId);
        if (userEntity.isPresent()) {
            UserEntity entity = userEntity.get();
            return mapper.entityToFullResponse(entity);
        } else {
            throw new NullPointerException("Пользователь с таким id не найден!");
        }
    }

    @Transactional
    public String deleteUser(Long userId) {
        Optional<UserEntity> deletedEntity = userRepository.findById(userId);
        if (deletedEntity.isPresent()) {
            userRepository.delete(deletedEntity.get());
            return "Запись удалена";
        } else {
            return "Пользователь с таким id не найден!";
        }
    }

    @Transactional
    public UserResponse updateUser(Long userId, UpdateUserRequest request) {
        Optional<UserEntity> updatedEntity = userRepository.findById(userId);
        if (updatedEntity.isPresent()) {
            UserEntity newEntity = updatedEntity.get();
            newEntity.setNickname(request.getNickname());
            return mapper.entityToResponse(newEntity);
        } else {
            throw new NullPointerException("Пользователь с таким id не найден!");
        }
    }
}
