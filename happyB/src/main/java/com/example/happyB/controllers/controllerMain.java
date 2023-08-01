//package com.example.happyB.controllers;
//import com.example.happyB.DBmodel.Users;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//
//@Controller
//public class controllerMain {
//    private final String argtoMain = "главной странице";
//
//    @GetMapping("/")
//    public String home(Model model) {
//        model.addAttribute("title", argtoMain); // то что передается в шаблон, по параметру title
//        return "home"; //обработка шаблона home
//    } // при переходе на главную страницу, обрабатиывается вывоз, вызывается функция
//
//    @GetMapping("/home")
//    public String homes(Model model) {
//        model.addAttribute("title", argtoMain); // то что передается в шаблон, по параметру title
//        return "home"; //обработка шаблона home
//    } // при переходе на главную страницу, обрабатиывается вывоз, вызывается функция
//
////    @Autowired
////    private Users_Repository usersRepository;
////
////    @Autowired
////    private Units_Repository unitsRepository;
//
////    @GetMapping("/peoples")
////    public String listdr(Model model) {
////        Iterable<Users> users = usersRepository.findAll();
////        model.addAttribute("users", users); // то что передается в шаблон, по параметру title
////        return "peoples"; //обработка шаблона home
////    } // при переходе на главную страницу, обрабатиывается вывоз, вызывается функция
//
//}