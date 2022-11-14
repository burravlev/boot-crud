package com.buravlev.crudapp.repository;

import com.buravlev.crudapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findById(Integer id);
}
