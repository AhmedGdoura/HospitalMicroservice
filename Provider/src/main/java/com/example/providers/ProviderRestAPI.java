package com.example.providers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/providers")
public class ProviderRestAPI {
	private String title = "Hello, I'm the provider Microservice";
	@Autowired
	private ProviderService providerService;
	@RequestMapping("/hello")
	public String sayHello() {
		System.out.println(title);
		return title;
	}
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<Provider> createProvider(@RequestBody Provider provider) {
		return new ResponseEntity<>(providerService.addProvider(provider), HttpStatus.OK);	
	}
	@PutMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<Provider> updateProvider(@PathVariable(value = "id") int id, @RequestBody Provider provider){
		return new ResponseEntity<>(providerService.updateProvider(id, provider), HttpStatus.OK);
	}
	@DeleteMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<String> deleteProvider(@PathVariable(value = "id") int id) {
		return new ResponseEntity<>(providerService.deleteProvider(id), HttpStatus.OK);
	}

}
