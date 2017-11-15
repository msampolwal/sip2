package com.msw.thebar.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class PrincipalController {

    protected final Log logger = LogFactory.getLog(getClass());

    @RequestMapping(value="/administrador.htm")
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        logger.info("Returning login view");
    	
        return new ModelAndView("chart");
    }
    
    @RequestMapping(value="/principal.htm")
    public ModelAndView handleRequestPrincipal(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        logger.info("Returning login view");
    	
        return new ModelAndView("principal");
    }
}