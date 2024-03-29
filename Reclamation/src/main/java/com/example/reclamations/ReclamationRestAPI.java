package com.example.reclamations;

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
@RequestMapping(value = "/api/reclamations")
public class ReclamationRestAPI {
	private String title = "Reclamation Microservice";
	@Autowired
	private ReclamationService reclamationService;
	@RequestMapping("/hello")
	public String sayHello() {
		System.out.println(title);
		return title;
	}
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<Reclamation> createReclamation(@RequestBody Reclamation reclamation) {
		return new ResponseEntity<>(reclamationService.addReclamation(reclamation), HttpStatus.OK);	
	}
	@PutMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<Reclamation> updatePatient(@PathVariable(value = "id") int id, @RequestBody Reclamation reclamation){
		return new ResponseEntity<>(reclamationService.updateReclamation(id, reclamation), HttpStatus.OK);
	}
	@DeleteMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<String> deleteMedicament(@PathVariable(value = "id") int id) {
		return new ResponseEntity<>(reclamationService.deleteReclamation(id), HttpStatus.OK);
	}
}
