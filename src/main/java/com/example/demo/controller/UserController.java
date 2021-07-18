package com.example.demo.controller;

import com.example.demo.dto.UserRequestModel;
import com.example.demo.dto.UserResponseModel;
import com.example.demo.interactor.UserInteractor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final UserInteractor userInteractor;

    @GetMapping
    public List<UserResponseModel> getUsers() {
        return userInteractor.getUsers();
    }

    @PostMapping
    public UserResponseModel create(@RequestBody UserRequestModel userRequestModel) {
        return userInteractor.create(userRequestModel);
    }
}
