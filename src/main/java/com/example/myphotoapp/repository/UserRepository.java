package com.example.myphotoapp.repository;

import com.example.myphotoapp.model.User;
import org.springframework.stereotype.Repository;

@Repository

public class UserRepository {
    public User getUser()
    {

        User user=new User(  "brahmjeet", "66 village lake crescent", 27);
        return user;
    }
}
