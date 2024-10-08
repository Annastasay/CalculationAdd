package com.add.CalculationAdd.repository;

import com.add.CalculationAdd.model.post.PostEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<PostEntity, Long> {

    List<PostEntity> findAllByUserId(Long userId);

}
