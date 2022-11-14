package com.buravlev.crudapp.service;

import com.buravlev.crudapp.model.User;
import java.util.List;

public interface UserService {
    List<User>getAllUsers ();
    User getUserById(Integer id);
    void save(User user);
    void delete(Integer id);
    void update(User user);
}