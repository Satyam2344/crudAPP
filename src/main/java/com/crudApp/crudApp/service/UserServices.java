package com.crudApp.crudApp.service;

import com.crudApp.crudApp.model.Users;
import com.crudApp.crudApp.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServices {

    @Autowired
    private UserRepo userRepo;

    public Users createUser(Users user){
        return userRepo.save(user);
    }

    public List<Users> getAllUsers() {
        return userRepo.findAll();
    }

    public Optional<Users> getUserById(Long id) {
        return userRepo.findById(id);
    }

    public Users updateUser(Long id, Users userDetails) {
        Users user = userRepo.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
        user.setName(userDetails.getName());
        user.setAddress(userDetails.getAddress());
        user.setEmail(userDetails.getEmail());
        return userRepo.save(user);
    }

    public void deleteUser(Long id) {
        userRepo.deleteById(id);
    }


}
