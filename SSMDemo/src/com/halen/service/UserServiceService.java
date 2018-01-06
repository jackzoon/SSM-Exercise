package com.halen.service;

import org.springframework.stereotype.Service;

@Service
public class UserServiceService implements UserService {
    @Override
    public String say(String value) {
        System.out.println(value);
        return value;
    }
}
