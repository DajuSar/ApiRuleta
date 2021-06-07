package com.masiv.ruletaAPI.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masiv.ruletaAPI.interfaceServices.IuserService;
import com.masiv.ruletaAPI.model.User;

@RestController
@RequestMapping
public class UserController {
	
	@Autowired
	private IuserService userService;
	
	@PostMapping("/saveUser")
	public int save(@RequestBody User user) {
		return userService.save(user);
	}
}
