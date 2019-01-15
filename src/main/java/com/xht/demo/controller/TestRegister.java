package com.xht.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/register")
public class TestRegister {

    @GetMapping(value = "/test1")
    public String test1(@RequestParam String param1) {
        return "hello " + param1;
    }
}
