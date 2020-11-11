package com.endava.juniorprogram.usersprogram.services.repositories;

import com.endava.juniorprogram.usersprogram.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UsersRepo implements DatabaseRepository{
    @Override
    public List<User> getUsers() {
        List<User> users = new ArrayList<>();
        users.add(new User(1L, "Diego"));
        users.add(new User(2L, "Carina"));
        users.add(new User(3L, "Elias"));
        return users;
    }
}
