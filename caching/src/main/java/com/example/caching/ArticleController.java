package com.example.caching;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("article")
public class ArticleController {
    @Autowired
    ServiceArticle service;
   @GetMapping("{id}")
    public void fetchArticle(@PathVariable("id") Integer articleId){
        service.fetchArticle(articleId);
    }
    @PutMapping("/")
    public void updateArticle(@RequestBody Article a){
       service.updateArticle(a);
    }
    @DeleteMapping("{id}")
    public void deleteArticle(@PathVariable("id") Integer articleId){
     service.deleteArticle(articleId);
    }

}
