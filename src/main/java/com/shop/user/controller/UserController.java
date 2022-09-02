package com.shop.user.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @RequestMapping({"/hello"})
    public String testHelloPage() {
        return "Hello World!";
    }
}
