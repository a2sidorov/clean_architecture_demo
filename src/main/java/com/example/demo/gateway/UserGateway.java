package com.example.demo.gateway;

import com.example.demo.domain.User;

import java.util.List;

public interface UserGateway {

    List<User> getUsers();

    void save(User user);
}
