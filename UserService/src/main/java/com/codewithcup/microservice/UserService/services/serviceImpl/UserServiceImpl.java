package com.codewithcup.microservice.UserService.services.serviceImpl;

import com.codewithcup.microservice.UserService.entity.User;
import com.codewithcup.microservice.UserService.services.UserService;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    //Fake User List

    List<User> userList = Arrays.asList(
            new User(1111L,"Deendayal","12345"),
            new User(1112L,"Mukesh","12345"),
            new User(1113L,"Kapil","12345"),
            new User(1114L,"Shiv Jeet","12345"),
            new User(1115L,"Prashant","12345")
    );

    @Override
    public User getUser(Long id) {
        return this.userList.stream().filter(user-> user.getUserId().equals(id)).findAny().orElse(null);
    }
}
