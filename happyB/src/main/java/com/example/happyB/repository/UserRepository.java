package com.example.happyB.repository;

import com.example.happyB.model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<User, Long> {
    User findByUsername(String username);
    User findByEmail(String email);

    User findByActivationCode(String code);
}
