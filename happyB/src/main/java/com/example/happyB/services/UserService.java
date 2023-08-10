package com.example.happyB.services;

import com.example.happyB.repository.UserRepository;
import com.example.happyB.model.User;
import com.example.happyB.model.enums.Role;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.Collections;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class UserService {
    @Autowired
    private final UserRepository userRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;

//    @Autowired
//    private final MailSender mailSender;

    public boolean createUser(User user) {
        User userDb = userRepository.findByUsername(user.getUsername());
        if (userDb != null) {
            return false;
        }
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setUsername(user.getUsername());
        user.setEmail(user.getEmail());
        user.setRoles(Collections.singleton(Role.ROLE_USER));
//        user.setActivationCode(UUID.randomUUID().toString());
        userRepository.save(user);

//        if(!StringUtils.isEmpty(user.getEmail())) {
//            String message = String.format(
//                    "Привет, %s \n" +
//                            "Ты попал в ад. Если хочешь продолжить, " +
//                            "продолжить пройди по ссылке: http://localhost:8080/activate/%s",
//                    user.getUsername(),
//                    user.getActivationCode()
//            );
//            mailSender.sendEmail(user.getEmail(), "Активация", message);
//        }

        return true;
    }

//    public boolean activateUser(String code) {
//        User user = userRepository.findByActivationCode(code);
//
//        if (user == null) {
//            return false;
//        }
//
//        user.setActivationCode(null);
//
//        userRepository.save(user);
//
//        return true;
//    }
}