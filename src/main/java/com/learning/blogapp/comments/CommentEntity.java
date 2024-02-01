package com.learning.blogapp.comments;

import java.util.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import com.learning.blogapp.articles.ArticleEntity;
import com.learning.blogapp.users.UserEntity;
import io.micrometer.common.lang.Nullable;
import jakarta.persistence.*;
import lombok.*;

@Entity(name = "comments")
@Setter
@Getter
@ToString
@Builder
@RequiredArgsConstructor
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)


public class CommentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(nullable = false)
    private Long id;
    
    @Nullable
    private String title;

    @NonNull
    private String body;

    @CreatedDate
    private Date createdAt;

    @ManyToOne
    @JoinColumn(name = "articleId", nullable = false)
    private ArticleEntity article;

    @ManyToOne
    @JoinColumn(name = "authorId", nullable = false)
    private UserEntity author;
    




    
}
