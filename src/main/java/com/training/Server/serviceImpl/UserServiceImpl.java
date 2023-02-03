package com.training.Server.serviceImpl;

import com.training.Server.model.User;
import com.training.Server.service.UserService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Override
    public List<User> getall() {
        List<User>getall=new ArrayList<>();
        User u1=new User(1,"aman",23);
        User u2=new User(2,"aarav",24);
        User u3=new User(3,"pooja",25);
        getall.add(u1);
        getall.add(u2);
        getall.add(u3);


        return getall;
    }

    @Override
    public User addUser(User user) {
        return user;
    }

    @Override
    public User updateUser(User user) {
        return user;
    }

    @Override
    public User deleteUser(Long id) {
        return null;
    }
}
