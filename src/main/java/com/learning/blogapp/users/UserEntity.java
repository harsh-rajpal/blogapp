package com.learning.blogapp.users;

import jakarta.persistence.*;
import io.micrometer.common.lang.NonNull;
import io.micrometer.common.lang.Nullable;
import lombok.*;


@Setter
@Getter
@Entity(name = "users")
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
@Builder

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
    private String password;

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
