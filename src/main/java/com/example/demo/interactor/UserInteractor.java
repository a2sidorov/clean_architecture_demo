package com.example.demo.interactor;

import com.example.demo.domain.User;
import com.example.demo.dto.UserDto;
import com.example.demo.dto.UserDtoConverter;
import com.example.demo.gateway.UserGateway;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UserInteractor {

    private final UserFactory userFactory;
    private final UserGateway userGateway;
    private final UserDtoConverter userDtoConverter;

    public UserDto create(UserDto userTo) {
        User newUser = userFactory.create(userTo.getName(), userTo.getPassword());
        userGateway.save(newUser);
        return userDtoConverter.convert(newUser);
    }
}
