package com.learning.blogapp.comments;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/articles/{article-slug}/comments")
public class CommentsController {
    @GetMapping
    public String getComments() {
        return "Comments";
    }
    
}
