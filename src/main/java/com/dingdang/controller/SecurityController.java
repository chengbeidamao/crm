package com.dingdang.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/hello")
public class SecurityController {

    @GetMapping
    public String hello() {
        return "hello"+ LocalDateTime.now();
    }
}
