package com.example.happyB.services;

import com.example.happyB.model.Employee;
import com.example.happyB.model.TestEmployee;

import java.security.Principal;

public interface EmployeeService {
    boolean saveEmployee(Employee employee, Principal principal);
}
