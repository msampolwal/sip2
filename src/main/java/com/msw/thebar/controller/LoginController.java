package com.msw.thebar.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.msw.thebar.model.User;
import com.msw.thebar.service.LoginService;

@RestController
public class LoginController {

    protected final Log logger = LogFactory.getLog(getClass());
    @Autowired
    LoginService loginService;
    
    @RequestMapping(value = "/login/", method = RequestMethod.POST)
    public ResponseEntity<User> login(@RequestBody User user) {
        System.out.println("Login User " + user);
 
        User u = loginService.getUser(user);
        if (u != null) {
            System.out.println("Email y Password validos");
            return new ResponseEntity<User>(u, HttpStatus.OK);
        }else {
        	return new ResponseEntity<User>(HttpStatus.CONFLICT);
        }
    }
}