package com.example.restapi1.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/web")
public class HelloWebController {
    @GetMapping("/message")
    public String hello() {
        return "hello";
    }
    @GetMapping("/web/message")
    public  String message(Model model) {
        model.addAttribute("message","This is custom message. Hello from bridgeLabz");
        return "message";
    }
}

