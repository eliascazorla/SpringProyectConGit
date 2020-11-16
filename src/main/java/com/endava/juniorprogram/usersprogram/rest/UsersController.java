package com.endava.juniorprogram.usersprogram.rest;

import com.endava.juniorprogram.usersprogram.model.User;
import com.endava.juniorprogram.usersprogram.services.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.net.SocketOption;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UsersController {

    @Autowired
    private UsersService usersService;

    @GetMapping
    public List<User> getUsers(@RequestParam(value= "name", required = false) String name){
        return usersService.getUsers(name);
    }

    @GetMapping("{id}")
    public User getUser(@PathVariable("id")  long id){
        return usersService.getUser(id);
    }

    /*@DeleteMapping("{id}")
    public void deleteUser(@PathVariable("id") long id){
        System.out.println("Delete user: " + id);
    }

    @PostMapping
    public void addUser(@RequestBody User user){
        System.out.println("Add user " + user);
    }

    @PutMapping
    public void updateUser(@RequestBody User user){
        System.out.println("update user " + user);
    }*/

}
