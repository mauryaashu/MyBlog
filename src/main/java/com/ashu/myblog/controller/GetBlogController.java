package com.ashu.myblog.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/myblog")
public class GetBlogController {

    @GetMapping("/")
    public String getBlogs(){
        return "Welcome to my blog";
    }
}
