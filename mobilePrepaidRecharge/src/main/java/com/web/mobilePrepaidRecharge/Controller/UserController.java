package com.web.mobilePrepaidRecharge.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web.mobilePrepaidRecharge.Model.User;
import com.web.mobilePrepaidRecharge.Service.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/{mobileNumber}")
    public User getUserByMobileNumber(@PathVariable String mobileNumber) {
        return userService.findByMobileNumber(mobileNumber);
    }

    @PostMapping("/")
    public User saveUser(@RequestBody User user) {
        return userService.saveUser(user);
    }
}
