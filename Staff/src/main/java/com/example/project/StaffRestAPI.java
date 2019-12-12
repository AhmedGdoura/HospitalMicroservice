package com.example.project;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@RestController
@RequestMapping(value= "/staff")
public class StaffRestAPI {
	private String title="Hello, I'm the candidate Microservice";
	@Autowired 
	private StaffService staffService;
	@RequestMapping("/hello")
	public String sayHello() {
		System.out.println(title);
		return title;}
	@GetMapping
    @ResponseStatus(HttpStatus.OK)
    public  Collection<Staff>  getAll() {
        System.out.println("-------> : getAllTheStaff");
        return  staffService.getAllStaff();
    }
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<Staff> createStaff(@RequestBody Staff staff){
		return new ResponseEntity<>(staffService.addStaff(staff),HttpStatus.OK);
	}
	@PutMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<Staff> updateStaff(@PathVariable(value = "id") int id, @RequestBody Staff staff){
		return new ResponseEntity<> (staffService.updateStaff(id, staff),HttpStatus.OK);
	}
	@DeleteMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<String> deleteStaff(@PathVariable(value = "id") int id){
		return new ResponseEntity<> (staffService.deleteStaff(id),HttpStatus.OK);
	}
	
}
