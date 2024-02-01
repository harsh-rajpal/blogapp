package com.learning.blogapp.articles;

import com.learning.blogapp.articles.dtos.CreateArticleRequest;
import com.learning.blogapp.articles.dtos.UpdateArticleRequest;
import org.springframework.stereotype.Service;
import com.learning.blogapp.users.UserRepository;

@Service
public class ArticleService {
    private final ArticlesRepository articlesRepository;
    private final UserRepository usersRepository;

    public ArticleService(ArticlesRepository articlesRepository, UserRepository usersRepository) {
        this.articlesRepository = articlesRepository;
        this.usersRepository = usersRepository;
    }

    public Iterable<ArticleEntity> getArticles() {
        return articlesRepository.findAll();
    }

    public ArticleEntity getArticleBySlug(String slug) {
        var article = articlesRepository.findBySlug(slug);
        if(article == null){
            throw new ArticleNotFoundException(slug);
        }
        return article;
    }
    public ArticleEntity createArticle(CreateArticleRequest a, Long authorId){
        var author = usersRepository.findById(authorId).orElseThrow(()-> new UsersService.UserNoteFoundException(authorId));
    }

}
