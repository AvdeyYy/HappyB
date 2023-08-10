package com.example.happyB.repository;

import com.example.happyB.model.Employee;
import com.example.happyB.model.TestEmployee;
import org.springframework.data.repository.CrudRepository;

public interface TestRepository extends CrudRepository<TestEmployee, Long> {
    TestEmployee findBySmpId(String smpId);
}
