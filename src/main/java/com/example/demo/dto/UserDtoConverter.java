package com.example.demo.dto;

import com.example.demo.domain.User;
import org.springframework.stereotype.Component;

@Component
public class UserDtoConverter {

    public UserDto convert(User user) {
        return UserDto.builder().name(user.getName())
                .password(user.getPassword())
                .yearOfBirth(user.getYearOfBirth())
                .generation(user.getGeneration())
                .creationTime(user.getCreationTime())
                .build();
    }
}
