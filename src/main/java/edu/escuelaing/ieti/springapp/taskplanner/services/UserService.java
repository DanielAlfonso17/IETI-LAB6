package edu.escuelaing.ieti.springapp.taskplanner.services;

import edu.escuelaing.ieti.springapp.taskplanner.entities.User;

import java.util.List;

public interface UserService {
    List<User> getAll();

    User getById(String userId);

    User create(User user);

    User update(User user);

    void remove(String userId);
}
