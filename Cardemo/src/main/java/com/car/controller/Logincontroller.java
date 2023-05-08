package com.car.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.car.model.Login;
import com.car.service.Loginservice;

@RestController
@CrossOrigin
public class Logincontroller {
	@Autowired 
	Loginservice lser;
	@GetMapping("/get")
	public List<Login> getVal()
	{
		return lser.getVal();
	}
	@PostMapping("/post")
	public Login postVal(@RequestBody Login l)
	{
		return lser.postVal(l);
	}
}
