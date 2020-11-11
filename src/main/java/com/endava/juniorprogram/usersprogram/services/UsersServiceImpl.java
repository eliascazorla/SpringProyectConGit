package com.endava.juniorprogram.usersprogram.services;

import com.endava.juniorprogram.usersprogram.model.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UsersServiceImpl implements UsersService{

    @Autowired
    private DatabaseRepository repository;

    @Override
    public List<User> getUsers() {
        return repository.getUsers();
    }
}
