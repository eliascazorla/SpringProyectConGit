package com.endava.juniorprogram.usersprogram.rest;

import com.endava.juniorprogram.usersprogram.model.User;
import org.springframework.web.bind.annotation.*;

import java.net.SocketOption;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UsersController {

    @GetMapping
    public List<User> getUsers(@RequestParam(value= "name", required = false) String name){
        List<User> users = new ArrayList<>();
        if(name == null){
            users.add(new User(1L, "Diego"));
            users.add(new User(2L, "Carina"));
            users.add(new User(3L, "Elias"));
        }else{
            users.add(new User(4L, name));
        }
        return users;
    }

    @GetMapping("{id}")
    public User getUser(@PathVariable("id")  long id){
        System.out.println(id);
        return new User(id, "Diego");
    }

    @DeleteMapping("{id}")
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
    }

}
