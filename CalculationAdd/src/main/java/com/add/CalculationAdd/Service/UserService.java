package com.add.CalculationAdd.Service;

import com.add.CalculationAdd.Mapper.CreateRequestToEntityMapper;
import com.add.CalculationAdd.Model.CreateUserRequest;
import com.add.CalculationAdd.Model.UserEntity;
import com.add.CalculationAdd.Model.UserResponse;
import com.add.CalculationAdd.Repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final CreateRequestToEntityMapper mapper;

    @Transactional
    public UserResponse createUser(CreateUserRequest request) {
        UserEntity entity = mapper.createUserRequestToEntity(request);
        return mapper.entityToResponse(userRepository.save(entity));
    }

    @Transactional
    public UserResponse findById(Long id) {
        Optional<UserEntity> entity = userRepository.findById(id);
        if(entity.isPresent()){
            return mapper.entityToResponse(entity.get());
        } else {
            throw new NullPointerException("Пользователь с таким id не найден!");
        }
    }
}
