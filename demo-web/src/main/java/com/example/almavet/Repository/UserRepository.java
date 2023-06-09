package com.example.almavet.Repository;


import com.example.almavet.Entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
    User findByUsername(String username);
    boolean findByUsernameAndPassword(String username, String password);
}
