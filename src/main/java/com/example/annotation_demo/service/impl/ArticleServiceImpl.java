package com.example.annotation_demo.service.impl;

import com.example.annotation_demo.annotation.SysLog;
import com.example.annotation_demo.service.ArticleService;
import com.example.annotation_demo.utils.ApplicationContextUtils;
import org.apache.catalina.core.ApplicationContext;
import org.springframework.aop.framework.AopContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private ArticleService articleService;

    @SysLog
    @Override
    public void add() {
        System.out.println("...........");
    }

    @Override
    public void get() {
//        ApplicationContextUtils.getApplicationContext().getBean(ArticleService.class).add();
        ((ArticleService)AopContext.currentProxy()).add();
    }
}
