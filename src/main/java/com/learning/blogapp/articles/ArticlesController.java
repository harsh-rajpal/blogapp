package com.learning.blogapp.articles;

import com.learning.blogapp.users.UserEntity;

import org.springframework.web.bind.annotation.*;
import org.springframework.security.core.annotation.AuthenticationPrincipal;


@RestController
@RequestMapping("/articles")
public class ArticlesController {
    @GetMapping("")
    String getArticles(){
        return "get all articles.";
    }
    @GetMapping("/{id}")
    String getArticleById(@PathVariable("id") String id){
        return "get article by id."+id;
    }
        @PostMapping("")
        String createArticle(@AuthenticationPrincipal UserEntity user){
                return "create article called by "+user.getUsername();
        }
}
