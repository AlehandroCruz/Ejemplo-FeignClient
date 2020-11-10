package com.gnp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gnp.model.ModelJson;
import com.gnp.repository.IJson;

@Service
public class ServiceJson {

	@Autowired
	private IJson iJson;
	
	public List<ModelJson> getDataAll(){
		List<ModelJson> lista = iJson.getAll();
		return lista;
	} 
	
	public ModelJson getDataOne(Integer id){
		ModelJson lista = iJson.getOne(id);
		return lista;
	} 
}
