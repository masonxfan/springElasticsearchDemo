package com.demo.elastic.springelasticdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.elastic.springelasticdemo.document.Person;
import com.demo.elastic.springelasticdemo.service.PersonService;

@RestController
@RequestMapping("/api/person")
public class PersonController {
	private final PersonService service;
	
	@Autowired
	public PersonController(PersonService service) {
		this.service = service;
	}
	
	@PostMapping
	public void save(@RequestBody final Person person) {
		service.save(person);
	}
	
	@GetMapping
	public Person findById(@PathVariable final String id) {
		return service.findById(id);
	}

}
