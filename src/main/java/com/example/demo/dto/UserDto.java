package com.example.demo.dto;

import com.example.demo.domain.Generation;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@AllArgsConstructor
@Getter
@Setter
@Builder
public class UserDto {

    private String name;
    private String password;
    private Integer yearOfBirth;
    private Generation generation;
    private LocalDateTime creationTime;
}
