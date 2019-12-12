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
@RequestMapping(value = "/api/patients")
public class PatientRestAPI {

	private String title = "Patients Microservice";
	@Autowired
	private PatientService patientService;
	@RequestMapping("/hello")
	public String sayHello() {
		System.out.println(title);
		return title;
	}
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<Patient> createPatient(@RequestBody Patient patient) {
		return new ResponseEntity<>(patientService.addPatient(patient), HttpStatus.OK);	
	}
	@PutMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<Patient> updatePatient(@PathVariable(value = "id") int id, @RequestBody Patient patient){
		return new ResponseEntity<>(patientService.updatePatient(id, patient), HttpStatus.OK);
	}
	@DeleteMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<String> deletePatient(@PathVariable(value = "id") int id) {
		return new ResponseEntity<>(patientService.deletePatient(id), HttpStatus.OK);
	}
}

	


