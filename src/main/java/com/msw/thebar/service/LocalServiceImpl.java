package com.msw.thebar.service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.stereotype.Service;

import com.msw.thebar.model.Local;
import com.msw.thebar.model.Stock;

@Service("localService")
public class LocalServiceImpl implements LocalService {

	private static final AtomicInteger counter = new AtomicInteger();
	private static List<Local> locales;
	private static LocalServiceImpl instancia;
	
	private LocalServiceImpl(){}
	
	public static LocalServiceImpl getInstancia() {
		if(instancia == null)
			instancia = new LocalServiceImpl();
		return instancia;
	}
	
	static{
		locales= loadLocales();
	}
	
	public List<Local> getLocales() {
		return locales;
	}
	
	public Local getLocal(Integer idLocal) {
		for (Local local : locales) {
			if(local.getId().equals(idLocal))
				return local;
		}
		return null;
	}
	
	private static List<Local> loadLocales(){
		List<Local> locales = new ArrayList<Local>();
		Local localPalermo = new Local(counter.incrementAndGet(), "Palermo", "Armenia 1000", "4556-5885", true, "palermo-c.png");
		localPalermo.getProductos().add(new Stock(1, ProductoService.getInstancia().getProducto(1), 30.0, 120.0, 30, 70, 300));
		localPalermo.getProductos().add(new Stock(2, ProductoService.getInstancia().getProducto(2), 8.0, 16.0, 70, 50, 300));
		localPalermo.getProductos().add(new Stock(3, ProductoService.getInstancia().getProducto(3), 7.2, 28.8, 70, 70, 300));
		Local localBN = new Local(counter.incrementAndGet(), "Barrio Norte", "Juramento 2600", "4556-5555", false, "barrionorte-c.png");
		Local localSanTelmo = new Local(counter.incrementAndGet(), "San Telmo", "Balcarce 500", "4888-5454", false, "santelmo-c.png");
		Local localCaballito = new Local(counter.incrementAndGet(), "Caballito", "Guayaquil 700", "4755-2211", true, "caballito-c.png");
		
		locales.add(localPalermo);
		locales.add(localBN);
		locales.add(localSanTelmo);
		locales.add(localCaballito);
		return locales;
	}
}