package com.example.demo.interactor;

import com.example.demo.domain.User;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class UserFactory {

    User create(String name, String password) {
        return new User(name, password, LocalDateTime.now());
    }
}
