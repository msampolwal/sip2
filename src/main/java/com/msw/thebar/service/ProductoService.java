package com.msw.thebar.service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import com.msw.thebar.model.Producto;

public class ProductoService {

	private static final AtomicInteger counter = new AtomicInteger();
	private static List<Producto> productos;
	private static ProductoService instancia;
	
	public static ProductoService getInstancia() {
		if(instancia == null)
			instancia = new ProductoService();
		return instancia;
	}
	
	private ProductoService() {}
	
	static{
		productos= loadProductos();
	}
	
	public Producto getProducto(Integer id) {
		for (Producto p : productos) {
			if(p.getId().equals(id))
				return p;
		}
		return null;
	}
	
	private static List<Producto> loadProductos(){
		List<Producto> productos = new ArrayList<Producto>();
		productos.add(new Producto(counter.incrementAndGet(), "Stella Artois 500ml", 0.6, 25.0, "stella_bot500.jpg", "Stella", "stella@stella.com"));
		productos.add(new Producto(counter.incrementAndGet(), "Corona 355ml", 0.4, 25.0, "corona355.jpg", "Corona", "corona@corona.com"));
		productos.add(new Producto(counter.incrementAndGet(), "Dr. Lemon c/Vodka 354ml", 0.360, 20.0, "drlemon354.jpg", "Dr. Lemon", "drlemon@drlemon.com"));
		return productos;
	}
}