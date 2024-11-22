package com.example.demo.Services;

import com.example.demo.Entitty.Users;
import com.example.demo.Repo.userRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class userService {
    @Autowired
    public userRepository userRepo;

    public Users createUser(Users user){
        return userRepo.save(user);
    }

    public List<Users> getuser(){
        return userRepo.findAll();
    }

}
