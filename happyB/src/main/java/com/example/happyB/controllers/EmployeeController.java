package com.example.happyB.controllers;
import com.example.happyB.model.Employee;
import com.example.happyB.repository.EmployeeRepository;
import com.example.happyB.repository.UserRepository;
import com.example.happyB.services.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import java.security.Principal;


@Controller
@RequiredArgsConstructor
public class EmployeeController {
    @Autowired
    private final EmployeeService employeeService;

    @Autowired
    private final EmployeeRepository employeeRepository;

    @Autowired
    private final UserRepository userRepository;

    @GetMapping("/employee/add")
    public String employee() {
        return "employees";
    }


    @PostMapping("/employee/add")
    public String addEmployee(Principal principal, Employee employee, Model model) {
        if (!employeeService.saveEmployee(employee,principal)) {
            model.addAttribute("err", "Вы уже следите за пользователем");
            return "redirect:/list";
        }
        employeeService.saveEmployee(employee,principal);
        return "redirect:/list";
    }

}
