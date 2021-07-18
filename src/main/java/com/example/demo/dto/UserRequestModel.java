package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class UserRequestModel {
    private String name;
    private String password;
    private Integer yearOfBirth;
}
