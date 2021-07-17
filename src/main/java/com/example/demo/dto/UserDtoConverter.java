package com.example.demo.dto;

import com.example.demo.domain.User;
import org.springframework.stereotype.Component;

@Component
public class UserDtoConverter {

    public UserDto convert(User user) {
        return new UserDto(user.getName(), user.getPassword(), user.getCreationTime());
    }
}
