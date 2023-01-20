package com.RestApiCalls.Contoller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value={"/home","/"},method = RequestMethod.GET)
public class HelloWebRestController {
    @GetMapping(path="/{name}")
    public String getName(@RequestParam(value = "name", defaultValue = "Rahul") String name){
        return "<h1>Hii "+name+" ! Welcome to BridgeLabz!</h1>";
    }
}
