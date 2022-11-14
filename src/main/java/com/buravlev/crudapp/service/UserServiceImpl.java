package com.buravlev.crudapp.service;

import com.buravlev.crudapp.model.User;
import com.buravlev.crudapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository repository;
    @Override
    public List<User> getAllUsers() {
        return repository.findAll();
    }

    @Override
    public User getUserById(Integer id) {
        return repository.findById(id);
    }

    @Override
    public void save(User user) {
        repository.save(user);
    }

    @Override
    public void delete(Integer id) {
        repository.delete(getUserById(id));
    }

    @Override
    public void update(User user) {
        repository.save(user);
    }
}
