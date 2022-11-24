package com.example.day2.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller {
    @RequestMapping("/get")

    public String display(){
        return "welcome to the Bridgelapz";
    }
    @PostMapping("/post" )

    public  String userRegister(@RequestBody String firstName , String lastName , String id ){
    return "Persons Details" +firstName + "" +lastName +""+id;
    }


}
