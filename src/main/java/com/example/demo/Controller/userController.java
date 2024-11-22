package com.example.demo.Controller;

import com.example.demo.Entitty.Users;
import com.example.demo.Services.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class userController {
    @Autowired
    userService userservice;

    @GetMapping("/test")
    public String greet(){
        return "hello user";
    }
    @GetMapping("/get-all")
    public List<Users> getUser(){
        return userservice.getuser();
    }

    @PostMapping("/set-user")
    public ResponseEntity<Users> setuser(@RequestBody  Users user){
        Users user1 = userservice.createUser(user);

       return new ResponseEntity<>(user1, HttpStatus.CREATED);
    }

}
