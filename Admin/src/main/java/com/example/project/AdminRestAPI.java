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
@RequestMapping(value= "/Admin")
public class AdminRestAPI {
	private String title="Hello, I'm the admin Microservice";
	@Autowired 
	private AdminService adminService;
	@RequestMapping("/hello")
	public String sayHello() {
		System.out.println(title);
		return title;}
	@GetMapping
    @ResponseStatus(HttpStatus.OK)
    public  Collection<Admin>  getAll() {
        System.out.println("-------> : getAllAdmin");
        return  adminService.getAllAdmin();
    }
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<Admin> createAdmin(@RequestBody Admin admin){
		return new ResponseEntity<>(adminService.addAdmin(admin),HttpStatus.OK);
	}
	@PutMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<Admin> updateStaff(@PathVariable(value = "id") int id, @RequestBody Admin admin){
		return new ResponseEntity<> (adminService.updateAdmin(id, admin),HttpStatus.OK);
	}
	@DeleteMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<String> deleteAdmin(@PathVariable(value = "id") int id){
		return new ResponseEntity<> (adminService.deleteAdmin(id),HttpStatus.OK);
	}
	
}
