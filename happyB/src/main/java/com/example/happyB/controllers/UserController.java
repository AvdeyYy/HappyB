package com.example.happyB.controllers;

import com.example.happyB.model.User;
import com.example.happyB.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class UserController {
    @Autowired
    private final UserService userService;

    @GetMapping("/login")
    public String login(){
        return "login";
    }
    @GetMapping("/registration")
    public String registration() {
        return "registration";
    }
    @PostMapping("/registration")
    public String registrationUser(User user) {
        userService.createUser(user);
        return "redirect:/login";
    }

//    @GetMapping("/activate/{code}")
//    public String activate(Model model, @PathVariable String code) {
//        boolean isActivated = userService.activateUser(code);
//        if (isActivated) {
//            model.addAttribute("message", "User successfully activated");
//        } else {
//            model.addAttribute("message", "Activation code is not found!");
//        }
//        return "login";
//    }
}
