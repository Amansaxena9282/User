package com.training.Server.controller;
import com.training.Server.model.User;
import com.training.Server.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/vi")
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/get")
    public List<User>getall(){
        return userService.getall();
    }
    @PostMapping("/save")
    public User saveUser(@RequestBody User user){
        return userService.addUser(user);
    }
    @DeleteMapping("/delete")
    public User getDelete (@PathVariable long id){
        return userService.deleteUser(id);
    }
    @PutMapping("/update")
    public User updateUser(@RequestBody User user){
        return userService.updateUser(user);
    }
}
