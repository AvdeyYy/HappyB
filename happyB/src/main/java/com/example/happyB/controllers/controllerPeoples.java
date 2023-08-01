package com.example.happyB.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class controllerPeoples {
    @PostMapping("/peoples")
    public String delUsers(@RequestParam String deletebythis,  Model model){
        System.out.println("Имя: " + deletebythis);
            return "redirect:/peoples";
    }



}
