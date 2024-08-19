package com.add.CalculationAdd.Mapper;

import com.add.CalculationAdd.Model.CreateUserRequest;
import com.add.CalculationAdd.Model.UserEntity;
import com.add.CalculationAdd.Model.UserResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")
public interface CreateRequestToEntityMapper {
    UserEntity createUserRequestToEntity(CreateUserRequest request);

    UserResponse entityToResponse(UserEntity entity);
}
