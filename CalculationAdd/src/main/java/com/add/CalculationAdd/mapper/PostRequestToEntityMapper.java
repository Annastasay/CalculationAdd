package com.add.CalculationAdd.mapper;

import com.add.CalculationAdd.model.post.CreatePostRequest;
import com.add.CalculationAdd.model.post.PostEntity;
import com.add.CalculationAdd.model.post.PostResponse;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PostRequestToEntityMapper {
    PostEntity createPostRequestToPostEntity(CreatePostRequest request);

    PostResponse postEntityToPostResponse(PostEntity entity);

    List<PostResponse> listPostEntityToPostResponse(List<PostEntity> entity);


}
