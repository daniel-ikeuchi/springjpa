package com.example.springjpa.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springjpa.entities.User;
import com.example.springjpa.reposistories.UserRepository;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@Autowired
	UserRepository userRepository;
	
	@GetMapping
	public ResponseEntity<List<User>> findAll() {
		List<User> users = userRepository.findAll();
		return ResponseEntity.ok().body(users);
	}

}
