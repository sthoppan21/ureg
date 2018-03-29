package com.example.registration.Controllers;

import com.example.registration.dao.UserDao;
import com.example.registration.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("register")

public class UserRegController {

    @Autowired
    private UserDao userDao;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public ResponseEntity<String> sayHello() {
        return ResponseEntity.ok().body("Hello there !");
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public ResponseEntity<String> insert(@RequestBody User userdata) {
        boolean isUserCreated = userDao.createUser(userdata);
        if(isUserCreated)
        return ResponseEntity.ok().body("User Created !");
        else
            return ResponseEntity.ok().body("User not Created !");
    }
}
