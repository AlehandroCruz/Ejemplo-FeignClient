package com.gnp.repository;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.gnp.model.ModelJson;

@Repository
@FeignClient(name="posts", url="https://jsonplaceholder.typicode.com")
public interface IJson {

	@GetMapping("/posts")
	List<ModelJson> getAll();
	
	@GetMapping("/posts/{id}")
	ModelJson getOne(@PathVariable (value = "id")Integer id);
}
