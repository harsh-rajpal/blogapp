package com.learning.blogapp.users;

import jakarta.persistence.*;
import io.micrometer.common.lang.NonNull;
import io.micrometer.common.lang.Nullable;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@Entity
@ToString
@RequiredArgsConstructor

public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(nullable = false)
    private Long id;
    @Column(nullable=false)
    @NonNull

    private String username;
    @Column(nullable = false)
    @NonNull

    private String email;
    @Column(nullable = true)
    @Nullable
    private String bio;
    @Column(nullable = true)
    @Nullable

    private String image;

    
    
}
