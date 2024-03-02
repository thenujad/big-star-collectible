package com.example.bigstarcollectible.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class HomeController {

    public String displayHome(Model model)
    {
       return "index";
    }
}
