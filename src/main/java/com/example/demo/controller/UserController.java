package com.example.demo.controller;

import com.example.demo.dto.UserDto;
import com.example.demo.interactor.UserInteractor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserInteractor userInteractor;

    @PostMapping("/user")
    public UserDto create(@RequestBody UserDto userTo) {
        return userInteractor.create(userTo);
    }
}
