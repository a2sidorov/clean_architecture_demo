package com.example.demo.interactor;

import com.example.demo.domain.User;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class UserFactory {

    User create(String name, String password, Integer yearOfBirth) {
        User newUser = new User(name, password, yearOfBirth);
        newUser.setCreationTime(LocalDateTime.now());
        return newUser;
    }
}
