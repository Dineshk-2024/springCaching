package com.example.caching;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class ServiceArticle {
     @Cacheable("articles")
    public void fetchArticle(Integer articleId){
        System.out.println("fetching article" + articleId);
    }
    @CachePut("articles")
    public void updateArticle(Article a){
        System.out.println("updating article" + a.getId());
    }
    @CacheEvict("articles")
    public void deleteArticle(Integer articleId){
        System.out.println("deleting artocle" + articleId);
    }
}
