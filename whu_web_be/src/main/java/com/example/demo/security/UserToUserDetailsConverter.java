package com.example.demo.security;

import com.example.demo.security.impl.UserDetailsImpl;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.NonNull;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;


@Component
public class UserToUserDetailsConverter implements Converter<User, UserDetails> {


    @Override
    public UserDetails convert(@NonNull User user) {


        UserDetailsImpl userDetails = new UserDetailsImpl();

        userDetails.setUsername(user.getUsername());
        userDetails.setPassword(user.getPassword());

        return userDetails;
    }

}
