package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomePageController {
    @GetMapping("/quickstart")
    public String quickstart(){
        return "ahihi";
    }
    @GetMapping("/")
    public String pageIndex(){
        return "pageIndex";
    }
}
