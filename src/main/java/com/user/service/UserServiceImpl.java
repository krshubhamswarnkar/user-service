package com.user.service;

import com.user.entity.User;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class UserServiceImpl implements UserService {

    // user list

    List<User> list = List.of(
            new User(121L,"Abhisek", "9875485243"),
            new User(122L,"Balram", "9955892492"),
            new User(123L, "Chandan", "9865271824"),
            new User(124L, "Durga", "8962462594"),
            new User(125L,"Evan", "8729628234")

    );

    @Override
    public User getUser(Long id) {
        return list.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null);
    }
}
