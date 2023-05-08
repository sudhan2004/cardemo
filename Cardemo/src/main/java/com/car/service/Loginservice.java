package com.car.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.car.model.Login;
import com.car.repository.Loginrepository;

@Service
public class Loginservice {
	@Autowired
	Loginrepository lrep;
	public List<Login> getVal()
	{
		return lrep.findAll();
	}
	public Login postVal(Login l)
	{
		return lrep.save(l);
	}
}
