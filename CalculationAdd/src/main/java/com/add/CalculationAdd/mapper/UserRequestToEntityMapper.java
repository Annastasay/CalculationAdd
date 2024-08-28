package com.add.CalculationAdd.mapper;

import com.add.CalculationAdd.model.user.CreateUserRequest;
import com.add.CalculationAdd.model.user.FullUserResponse;
import com.add.CalculationAdd.model.user.UserEntity;
import com.add.CalculationAdd.model.user.UserResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserRequestToEntityMapper {
    UserEntity createUserRequestToEntity(CreateUserRequest request);

    UserResponse entityToResponse(UserEntity entity);

    FullUserResponse entityToFullResponse(UserEntity entity);
}
