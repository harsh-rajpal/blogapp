package com.learning.blogapp.articles.dtos;


import lombok.*;
import org.springframework.lang.Nullable;
@Data
@Setter(AccessLevel.NONE)
public class UpdateArticleRequest {
    @Nullable
    private String title;

    @Nullable
    private String body;
    
    @Nullable
    private String subtitle;
    
}
