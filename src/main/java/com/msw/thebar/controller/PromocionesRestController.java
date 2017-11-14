package com.msw.thebar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.msw.thebar.model.Promocion;
import com.msw.thebar.service.PromocionService;

@RestController
public class PromocionesRestController {
	
	@Autowired
    PromocionService promocionService;
    
    @RequestMapping(value = "/promocion/", method = RequestMethod.POST)
    public ResponseEntity<List<Promocion>> promociones() {
        List<Promocion> promociones = promocionService.getPromociones();
        if (promociones != null) {
            System.out.println("Promociones recuperadas con exito");
            return new ResponseEntity<List<Promocion>>(promociones, HttpStatus.OK);
        }else {
        	return new ResponseEntity<List<Promocion>>(HttpStatus.CONFLICT);
        }
    }
}
