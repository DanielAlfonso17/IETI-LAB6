package edu.escuelaing.ieti.springapp.taskplanner.services.impl;

import edu.escuelaing.ieti.springapp.taskplanner.TaskplannerApplication;
import edu.escuelaing.ieti.springapp.taskplanner.entities.User;
import edu.escuelaing.ieti.springapp.taskplanner.services.UserService;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {


    @Override
    public List<User> getAll() {
        return TaskplannerApplication.users;
    }

    @Override
    public User getById(String userId) {
        return null;
    }

    @Override
    public User create(User user) {
        return null;
    }

    @Override
    public User update(User user) {
        return null;
    }

    @Override
    public void remove(String userId) {

    }
}
