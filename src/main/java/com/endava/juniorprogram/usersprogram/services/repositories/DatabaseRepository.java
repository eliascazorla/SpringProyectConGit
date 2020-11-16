package com.endava.juniorprogram.usersprogram.services.repositories;

import com.endava.juniorprogram.usersprogram.model.User;

import java.util.List;

public interface DatabaseRepository {
    public List<User> getUsers(String name);
}
