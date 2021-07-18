package com.example.demo.dto;

import com.example.demo.domain.User;

import java.util.List;
import java.util.stream.Collectors;

public class UserConverter {

    public static UserResponseModel convert(User user) {
        return UserResponseModel.builder().name(user.getName())
                .yearOfBirth(user.getYearOfBirth())
                .generation(user.getGeneration())
                .build();
    }

    public static List<UserResponseModel> convert(List<User> users) {
        return users.stream().map(UserConverter::convert).collect(Collectors.toList());

    }
}
