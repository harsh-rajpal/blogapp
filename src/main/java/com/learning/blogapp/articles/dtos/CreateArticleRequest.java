package com.learning.blogapp.articles.dtos;

import lombok.*;
import org.springframework.lang.Nullable;
@Data
@Setter(AccessLevel.NONE)

public class CreateArticleRequest {
    @NonNull
    private String title;

    
    @NonNull
    private String body;
    
    @Nullable
    private String subtitle;
    
}
