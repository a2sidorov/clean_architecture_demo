package com.example.demo.dto;

import com.example.demo.domain.Generation;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class UserResponseModel {

    private String name;
    private Integer yearOfBirth;
    private Generation generation;
}
