package com.add.CalculationAdd.Mapper;

import com.add.CalculationAdd.Model.CreateUserRequest;
import com.add.CalculationAdd.Model.UserEntity;
import com.add.CalculationAdd.Model.UserResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")
//@Component

public interface CreateRequestToEntityMapper {
    //@Mapping(target = "userId", ignore = true)
//   @Mapping(target = "nickname", source = "nickname")
//    @Mapping(target = "name", source = "name")
//    @Mapping(target = "lastName", source = "lastName")
//    @Mapping(target = "age", source = "age")
//    @Mapping(target = "registerDate", source = "registerDate")
    UserEntity createUserRequestToEntity(CreateUserRequest request);



    //@Mapping(target = "userId", source = "userId")
   // @Mapping(target = "nickname", source = "nickname")
//    @Mapping(target = "name", source = "name")
//    @Mapping(target = "lastName", source = "lastName")
//    @Mapping(target = "age", source = "age")
//    @Mapping(target = "createDate", source = "createDate")
    UserResponse entityToResponse(UserEntity entity);
}
