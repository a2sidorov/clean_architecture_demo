package com.example.demo.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class User {

    private String name;
    private String password;
    private LocalDateTime creationTime;
}
