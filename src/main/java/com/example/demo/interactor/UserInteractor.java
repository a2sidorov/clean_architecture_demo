package com.example.demo.interactor;

import com.example.demo.domain.User;
import com.example.demo.dto.UserConverter;
import com.example.demo.dto.UserRequestModel;
import com.example.demo.dto.UserResponseModel;
import com.example.demo.gateway.UserGateway;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class UserInteractor {

    private final UserFactory userFactory;
    private final UserGateway userGateway;

    public List<UserResponseModel> getUsers() {
        return UserConverter.convert(userGateway.getUsers());
    }

    public UserResponseModel create(UserRequestModel userRequestModel) {
        User newUser = userFactory.create(userRequestModel.getName(),
                userRequestModel.getPassword(),
                userRequestModel.getYearOfBirth());

        newUser.setGeneration();
        userGateway.save(newUser);
        return UserConverter.convert(newUser);
    }
}
