package com.example.day2.controller;

import org.springframework.web.bind.annotation.*;


@RestController
public class Controller {
    @PostMapping("/post" )

    public  String userRegister(@RequestBody  String firstName, String lastName , String id ){
    return "Persons Details" +firstName + "" +lastName +""+id;
    }


}
