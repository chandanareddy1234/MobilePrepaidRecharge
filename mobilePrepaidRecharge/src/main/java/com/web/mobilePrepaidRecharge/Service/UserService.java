package com.web.mobilePrepaidRecharge.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.mobilePrepaidRecharge.Model.User;
import com.web.mobilePrepaidRecharge.Repository.UserRepository;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User findByMobileNumber(String mobileNumber) {
        return userRepository.findByMobileNumber(mobileNumber);
    }

    public User saveUser(User user) {
        return userRepository.save(user);
    }
}