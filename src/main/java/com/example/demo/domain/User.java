package com.example.demo.domain;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;

@Data
@RequiredArgsConstructor
public class User {

    private final String name;
    private final String password;
    private final Integer yearOfBirth;
    private Generation generation;
    private LocalDateTime creationTime;


    public void setGeneration() {
        if (this.yearOfBirth < 1946) {
            this.setGeneration(Generation.BEFORE_BABY_BOOMER);
        } else if (this.yearOfBirth <= 1964) {
            this.setGeneration(Generation.BABY_BOOMER);
        } else if (this.yearOfBirth <= 1980) {
            this.setGeneration(Generation.X);
        } else if (this.yearOfBirth <= 1996) {
            this.setGeneration(Generation.MILLENNIALS);
        } else if (this.yearOfBirth <= 2009) {
            this.setGeneration(Generation.Z);
        } else {
            this.setGeneration(Generation.ALPHA);
        }

    }
}
