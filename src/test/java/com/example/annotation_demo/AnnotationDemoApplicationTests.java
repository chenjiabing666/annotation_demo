package com.example.annotation_demo;

import com.example.annotation_demo.service.ArticleService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AnnotationDemoApplicationTests {

    @Autowired
    private ArticleService articleService;

    @Test
    void contextLoads() {
        articleService.get();
    }


}
