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

    @GetMapping("/mr")
    public String sayHello(@RequestParam String name) {
        return "Hello "+name+" From BridgeLabz";
    }

    @RequestMapping(value = {"/query"}, method = RequestMethod.GET)
    public String sayHelloParam1 (@RequestParam(value="name")String name) {
        return "Hello " + name + "!";
    }

    @PostMapping("/post")
    public String userData(@RequestBody User user) {
        return "Hello "+user.getfName()+" "+user.getlName()+" from BridgeLabz";
    }
    @PutMapping("/put/{fName}")
    public String sayHello(@PathVariable String fName,@RequestParam String lName){
        return "Hello "+fName+" "+lName+ " from BridgeLabz";
    }
    }

