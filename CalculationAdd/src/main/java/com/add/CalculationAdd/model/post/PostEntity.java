package com.add.CalculationAdd.model.post;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
@Table(name = "posts")
public class PostEntity {
    @Id
    @Column(name = "post_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long postId;

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "body")
    private String body;

    @Column(name = "created_date")
    private Date createdDate;

}
