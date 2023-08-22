package com.example.day4.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.day4.model.petrolBunk;
import com.example.day4.repository.FuelRepo;

@Service
public class FuelService {
	@Autowired
	FuelRepo frepo;
	public petrolBunk saveDetails(petrolBunk p)
	{
		return frepo.save(p);
	}
	public List<petrolBunk>getDetails()
	{
		return frepo.findAll();
	}
	

}
