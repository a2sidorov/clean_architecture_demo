package com.example.demo.interactor;

import com.example.demo.domain.User;
import com.example.demo.dto.UserDto;
import com.example.demo.dto.UserDtoConverter;
import com.example.demo.dto.UserRequestModel;
import com.example.demo.gateway.UserGateway;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UserInteractor {

    private final UserFactory userFactory;
    private final UserGateway userGateway;
    private final UserDtoConverter userDtoConverter;

    public UserDto create(UserRequestModel userRequestModel) {
        User newUser = userFactory.create(userRequestModel.getName(),
                userRequestModel.getPassword(),
                userRequestModel.getYearOfBirth());

        newUser.setGeneration();
        userGateway.save(newUser);
        return userDtoConverter.convert(newUser);
    }
}
