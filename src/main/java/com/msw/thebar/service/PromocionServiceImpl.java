package com.msw.thebar.service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

import com.msw.thebar.model.Promocion;

@Service("promocionService")
public class PromocionServiceImpl implements PromocionService {

	private static final AtomicLong counter = new AtomicLong();
	private static List<Promocion> promociones;
	
	static{
		promociones= loadPromociones();
	}
	
	public List<Promocion> getPromociones() {
		return promociones;
	}
	
	private static List<Promocion> loadPromociones(){
		List<Promocion> promociones = new ArrayList<Promocion>();
		promociones.add(new Promocion(Long.valueOf(counter.incrementAndGet()).intValue(), "2 x 1 Stella Artois", 10000, "img/stella_bot500.jpg"));
		promociones.add(new Promocion(Long.valueOf(counter.incrementAndGet()).intValue(), "20% OFF Warsteiner", 3000, "img/warsteiner.jpg"));
		return promociones;
	}
}