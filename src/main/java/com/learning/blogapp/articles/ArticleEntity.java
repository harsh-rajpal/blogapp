package com.learning.blogapp.articles;

import java.util.*;
import jakarta.persistence.Column;
import org.springframework.data.annotation.CreatedDate;

import com.learning.blogapp.users.UserEntity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.AccessLevel;

@Setter
@Getter
@Entity
@ToString
@RequiredArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)


public class ArticleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(nullable = false)
    private Long id;
    @NonNull
    


    private String title;
    private String slug;
    private String subtitle;
    private String body;

    @CreatedDate
    private Date createdAt;

    @ManyToOne
    @JoinColumn(name = "authorId", nullable = false)
    private UserEntity author;
    
}