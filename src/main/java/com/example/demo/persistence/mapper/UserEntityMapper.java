package com.example.demo.persistence.mapper;

import com.example.demo.domain.User;
import com.example.demo.persistence.entity.UserEntity;

import java.util.List;
import java.util.stream.Collectors;

public class UserEntityMapper {

    public static User convert(UserEntity userEntity) {
        return new User(userEntity.getName(),
                userEntity.getPassword(),
                userEntity.getYearOfBirth(),
                userEntity.getGeneration(),
                userEntity.getCreationTime());
    }

    public static List<User> convert(List<UserEntity> userEntities) {
        return userEntities.stream().map(UserEntityMapper::convert).collect(Collectors.toList());
    }
}
