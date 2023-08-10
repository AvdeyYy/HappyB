package com.example.happyB.controllers;
import com.example.happyB.model.Employee;
import com.example.happyB.repository.EmployeeRepository;
import com.example.happyB.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
@RequiredArgsConstructor
public class ListController {
    @Autowired
    private final EmployeeRepository employeeRepository;

    @Autowired
    private final UserRepository userRepository;

    @GetMapping("/list")
    public String list(Model model) {
        Iterable<Employee> employees = employeeRepository.findAll();
        model.addAttribute("employees", employees);
        return "lists";
    }

    @PostMapping("/list/delete/{id}")
    public String deleteFromList(@PathVariable("id") Long id) {
        Employee employee = employeeRepository.findById(id).orElseThrow();
        employeeRepository.delete(employee);
        return "redirect:/list";
    }

}
