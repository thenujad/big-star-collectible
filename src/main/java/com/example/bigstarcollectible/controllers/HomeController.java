package com.example.bigstarcollectible.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class HomeController {

    @GetMapping(path = "/home")
    public String displayHome(Model model)
    {
       return "index";
    }

    @GetMapping("/getCharacter/{charname}")
    public String getCharacter(@PathVariable("charname") String charName)
    {
        return "/characters/"+charName;
    }

    @GetMapping("/about")
    public String displayAbout(){
        return "about";
    }
}
