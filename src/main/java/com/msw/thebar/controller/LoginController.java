package com.msw.thebar.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.msw.thebar.model.User;
import com.msw.thebar.service.LoginService;

@RestController
public class LoginController {

    protected final Log logger = LogFactory.getLog(getClass());
    @Autowired
    LoginService loginService;
    
    @RequestMapping(value="/login.htm")
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        logger.info("Returning login view");
    	
        return new ModelAndView("login");
    }
    
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
    
    @RequestMapping(value = "/register/", method = RequestMethod.POST)
    public ResponseEntity<User> register(@RequestBody User user) {
        System.out.println("Register User " + user);
 
        User u = loginService.createUser(user);
        if (u != null) {
            System.out.println("Registro realizado con exito");
            return new ResponseEntity<User>(u, HttpStatus.OK);
        }else {
        	return new ResponseEntity<User>(HttpStatus.CONFLICT);
        }
    }
}