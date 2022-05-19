package com.example.restapi1.Controller;


import com.example.restapi1.model.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloRestController {

    @GetMapping("/message")
    public String message() {
        return "Hello From BridgeLabz";
    }
    }

