package com.gnp.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gnp.model.Model;
import com.gnp.model.ModelJson;
import com.gnp.repository.IJson;
import com.gnp.service.ServiceJson;
import com.gnp.service.ServiceSuma;

@RestController
@RequestMapping(value = "entrada")
public class Controller {
	
	private final AtomicLong contador = new AtomicLong();
	private static final String mensaje = "Hola Mundo %s";

	@Autowired
	private ServiceJson serviceJson;
		
	@GetMapping
	public Model getModel (@RequestParam(value = "name", defaultValue = "NO MUNDO") String name) {
		return new Model( contador.incrementAndGet(),String.format(mensaje,name));
	}

	@GetMapping("/suma")
	public Double Suma(Double a, Double b) {	
		return new ServiceSuma().getSuma(a, b);
	}
	
	@GetMapping("/dato")
	public List<Integer> getLista(){
		ArrayList<Integer> lista = new ArrayList<Integer>();
		lista.add(2);
		lista.add(3);
		return lista;
	}
	
	@GetMapping("/sitio")
	public List<ModelJson> getSitioAll() {		
		return serviceJson.getDataAll();
	}
	
	@GetMapping("/sitio/{id}")
	public ModelJson getSitioOne(@PathVariable ("id") Integer id) {		
		return serviceJson.getDataOne(id);
	}
	
	
	@GetMapping("/version")
	public String getVersion() {
		
		return "\"version\" : 1.0";
	}
}
