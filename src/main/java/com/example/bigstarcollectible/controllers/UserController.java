package com.example.bigstarcollectible.controllers;


import org.springframework.stereotype.Controller;

@Controller
public class UserController {

    public String displayRegistrationForm(){
        return "register-user";
    }
}
