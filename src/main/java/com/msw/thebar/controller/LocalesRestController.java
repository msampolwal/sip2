package com.msw.thebar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.msw.thebar.model.Local;
import com.msw.thebar.service.LocalService;

@RestController
public class LocalesRestController {
	
	@Autowired
    LocalService localService;
    
    @RequestMapping(value = "/locales/")
    public ResponseEntity<List<Local>> locales() {
        List<Local> locales = localService.getLocales();
        if (locales != null) {
            System.out.println("Locales recuperadas con exito");
            return new ResponseEntity<List<Local>>(locales, HttpStatus.OK);
        }else {
        	return new ResponseEntity<List<Local>>(HttpStatus.CONFLICT);
        }
    }
}
