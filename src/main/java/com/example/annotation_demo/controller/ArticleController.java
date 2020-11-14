package com.example.annotation_demo.controller;

import com.example.annotation_demo.annotation.RepeatSubmit;
import com.example.annotation_demo.annotation.SysLog;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/article")

public class ArticleController {

    @GetMapping("/add")
    public String add(){
        return "";
    }
}
