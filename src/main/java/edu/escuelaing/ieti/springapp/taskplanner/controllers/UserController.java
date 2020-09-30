package edu.escuelaing.ieti.springapp.taskplanner.controllers;

import edu.escuelaing.ieti.springapp.taskplanner.TaskplannerApplication;
import edu.escuelaing.ieti.springapp.taskplanner.entities.User;
import edu.escuelaing.ieti.springapp.taskplanner.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class UserController {


    @Autowired
    UserService userService;

    @GetMapping("/user")
    public List<User> getAll(){
        return userService.getAll();
    }

    @GetMapping("/user/{id}")
    public User getUserById(@RequestBody String id){
        return userService.getById(id);
    }

    @PostMapping("/user")
    public User createUser(User user){
        return userService.create(user);
    }

    @PostMapping("/user/{id}")
    public User updateUser(User user){
        User userUpdate = userService.getById(user.getId());
        userUpdate.setEmail(user.getEmail());
        userUpdate.setFirstname(user.getFirstname());
        userUpdate.setId(user.getId());
        userUpdate.setLastname(user.getLastname());
        return userUpdate;
    }

    @DeleteMapping("/user")
    public void removeUser(String id){
        userService.remove(id);
    }





}
