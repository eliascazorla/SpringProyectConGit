package com.endava.juniorprogram.usersprogram.services;

import com.endava.juniorprogram.usersprogram.model.User;
import com.endava.juniorprogram.usersprogram.services.repositories.DatabaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersServiceImpl implements UsersService{

    @Autowired
    private DatabaseRepository repository;

    @Override
    public List<User> getUsers() {
        return repository.getUsers();
    }
}
