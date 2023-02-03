package com.training.Server.service;
import com.training.Server.model.User;

import java.util.List;
public interface UserService {
    public List<User>getall();
    public  User addUser(User user);
    public User updateUser(User user);
    public User deleteUser(Long id);
}
