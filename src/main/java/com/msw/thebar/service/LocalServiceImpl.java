package com.msw.thebar.service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

import com.msw.thebar.model.Local;

@Service("localService")
public class LocalServiceImpl implements LocalService {

	private static final AtomicLong counter = new AtomicLong();
	private static List<Local> locales;
	
	static{
		locales= loadLocales();
	}
	
	public List<Local> getLocales() {
		return locales;
	}
	
	private static List<Local> loadLocales(){
		List<Local> locales = new ArrayList<Local>();
		locales.add(new Local(Long.valueOf(counter.incrementAndGet()).intValue(), "Palermo", "Armenia 100", "4556-5885", true));
		locales.add(new Local(Long.valueOf(counter.incrementAndGet()).intValue(), "Barrio Norte", "Arcos 150", "4556-5555", false));
		locales.add(new Local(Long.valueOf(counter.incrementAndGet()).intValue(), "San Telmo", "Balcarce 500", "4888-5454", false));
		locales.add(new Local(Long.valueOf(counter.incrementAndGet()).intValue(), "Caballito", "Guayaquil 700", "4755-2211", true));
		return locales;
	}
}