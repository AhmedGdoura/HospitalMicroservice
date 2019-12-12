package com.microservice.soa;

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
@RequestMapping(value = "/api/medicals")
public class MedicalRestAPI {
	private String title = "Hello, I'm the provider Microservice";
	@Autowired
	private MedicalService medicalService;
	@RequestMapping("/hello")
	public String sayHello() {
		System.out.println(title);
		return title;
	}
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<Medical> createMedical(@RequestBody Medical medical) {
		return new ResponseEntity<>(medicalService.addMedical(medical), HttpStatus.OK);	
	}
	@PutMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<Medical> updateMedical(@PathVariable(value = "id") int id, @RequestBody Medical medical){
		return new ResponseEntity<>(medicalService.updateMedical(id, medical), HttpStatus.OK);
	}
	@DeleteMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<String> deleteMedical(@PathVariable(value = "id") int id) {
		return new ResponseEntity<>(medicalService.deleteMedical(id), HttpStatus.OK);
	}

}

