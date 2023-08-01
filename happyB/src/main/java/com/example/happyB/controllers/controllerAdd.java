package com.example.happyB.controllers;
import com.example.happyB.DBmodel.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class controllerAdd {
//    @Autowired
//    private Units_Repository unitsRepository;
//    @Autowired
//    private Users_Repository usersRepository;

    @GetMapping("/adlist")
    public String adlist(Model model) {
        return "/adlist";
    }

//    @PostMapping("/adlist")
//    public String addUsers(@RequestParam String smp_id_division, @RequestParam String smp_id_unit, Model model) {
//        String name = unitsRepository.select_SHORT_NAME_id(smp_id_unit);
//        String date = unitsRepository.select_DATE_BORN_DM_id(smp_id_unit);
//        String division = unitsRepository.select_DIVISION_ID_id(smp_id_unit);
//
//        if (unitsRepository.serch_same_id(smp_id_unit) == null) {
//            model.addAttribute("errorMessage", "Такого имени не существует");
//            return "/adlist";
//        } else if (usersRepository.countSmpID(smp_id_unit).size() >0) {
//            model.addAttribute("errorMessage", "Имя повторяется");
//            return "/adlist";
//        } else {
//            Users users = new Users(smp_id_unit, division, name, date);
//            usersRepository.save(users);
//            System.out.println("Имя: " + name + " ДР: " + date + " отдел: " + division);
//        }
//        return "redirect:/peoples";
//    }
}
