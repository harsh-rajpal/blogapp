package com.learning.blogapp.articles;

import java.util.*;

import org.springframework.data.annotation.CreatedDate;

import com.learning.blogapp.users.UserEntity;

import io.micrometer.common.lang.Nullable;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;

@Setter
@Getter
@Entity
@ToString
@Builder

@RequiredArgsConstructor
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)


public class ArticleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(nullable = false)
    private Long id;
    
    @NonNull
    private String title;

    @NonNull
    @Column(unique = true)
    private String slug;
    
    @Nullable
    private String subtitle;

    @NonNull
    private String body;

    @CreatedDate
    private Date createdAt;

    @ManyToOne
    @JoinColumn(name = "authorId", nullable = false)
    private UserEntity author;
    
}
