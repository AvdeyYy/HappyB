package com.example.happyB.services;

import com.example.happyB.model.Employee;
import com.example.happyB.model.TestEmployee;
import com.example.happyB.model.User;
import com.example.happyB.repository.EmployeeRepository;
import com.example.happyB.repository.TestRepository;
import com.example.happyB.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.security.Principal;
import java.util.Objects;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private final EmployeeRepository employeeRepository;

    @Autowired
    private final UserRepository userRepository;
    @Autowired
    private final TestRepository testRepository;
    @Override
    public boolean saveEmployee(Employee employee, Principal principal) {
        if (employeeRepository.findBySmpId(employee.getSmpId()) != null) {
            return false;
        } else if (testRepository.findBySmpId(employee.getSmpId()) == null) {
            return false;
        }
        employee.setUser(getUser(principal));
        employeeRepository.save(employee);
        return true;
}

    public User getUser(Principal principal) {
        return userRepository.findByUsername(principal.getName());
    }
}
