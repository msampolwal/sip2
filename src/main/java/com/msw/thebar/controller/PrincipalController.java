package com.msw.thebar.controller;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.msw.thebar.model.ItemOC;
import com.msw.thebar.model.Local;
import com.msw.thebar.model.OrdenDeCompra;
import com.msw.thebar.model.Stock;
import com.msw.thebar.service.LocalServiceImpl;

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
    
    @RequestMapping(value="/codigoqr.htm")
    public ModelAndView handleRequestCodigoQR(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        logger.info("Returning login view");
    	
        return new ModelAndView("codigoqr");
    }
    
    @RequestMapping(value="/misdatos.htm")
    public ModelAndView handleRequestMisDatos(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        logger.info("Returning mis datos view");
    	
        return new ModelAndView("misdatos");
    }
    
    @RequestMapping(value="/promociones.htm")
    public ModelAndView handleRequestPromociones(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        logger.info("Returning promociones view");
    	
        return new ModelAndView("promociones");
    }
    
    @RequestMapping(value = "/generarOC/", method = RequestMethod.POST)
    public ResponseEntity<OrdenDeCompra> generarOC(@RequestBody Local l) {
        System.out.println("Login User " + l.getId());
        OrdenDeCompra oc = new OrdenDeCompra();
        oc.setFecha(new Date());
        Local local = LocalServiceImpl.getInstancia().getLocal(l.getId());
        for (Stock stock : local.getProductos()) {
			if(stock.getStockTotal() < stock.getStockMinimo()) {
				oc.getItem().add(new ItemOC(stock.getProducto(), stock.getStockMaximoTotal() - stock.getStockTotal()));
			}
		}
        return new ResponseEntity<OrdenDeCompra>(oc, HttpStatus.OK);
    }
}