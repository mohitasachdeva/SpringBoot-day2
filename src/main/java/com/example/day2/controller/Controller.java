package com.example.day2.controller;

import org.springframework.web.bind.annotation.*;


@RestController
public class Controller {
    @RequestMapping("/get")

    public String display(){
        return "welcome to the Bridgelapz";
    }
    @GetMapping("/get")
    public String show(){
        return "hello mark from brigelapz";
    }
    @PostMapping("/post/{firstName}" )

    public  String userRegister(@PathVariable String firstName,@RequestBody  String lastName , String id ){
    return "Persons Details" +firstName + "" +lastName +""+id;
    }


}
