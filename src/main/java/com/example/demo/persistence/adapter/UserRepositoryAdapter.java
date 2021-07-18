package com.example.demo.persistence.adapter;

import com.example.demo.domain.User;
import com.example.demo.gateway.UserGateway;
import com.example.demo.persistence.entity.UserEntity;
import com.example.demo.persistence.repository.UserJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UserRepositoryAdapter implements UserGateway {

    private final UserJpaRepository userJpaRepository;

    @Override
    public void save(User user) {
        // TODO here should be a mapper call
        UserEntity userEntity = new UserEntity(user.getName(),
                user.getPassword(),
                user.getYearOfBirth(),
                user.getGeneration(),
                user.getCreationTime());
        userJpaRepository.save(userEntity);
    }
}
