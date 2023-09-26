package com.saurav.productcatalogservice.controllers;

import com.saurav.productcatalogservice.services.MyFirstService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController
public class MyFirstController {
    private MyFirstService myFirstService;

    public MyFirstController(MyFirstService myFirstService) {
        this.myFirstService = myFirstService;
    }
    //Spring works on annotaion and then annotations make use of reflection
    @GetMapping("/")
    public String SayHi(){
        return "Hi There";
    }
}
