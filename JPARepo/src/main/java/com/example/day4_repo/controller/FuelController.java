package com.example.day4.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.day4.model.petrolBunk;
import com.example.day4.service.FuelService;
@RestController
public class FuelController {
@Autowired
FuelService fser;
@PostMapping("/SaveFuel")
public petrolBunk saveFuelStationDe(@RequestBody petrolBunk pb)
{
	return fser.saveDetails(pb);
}
@GetMapping("/getFuel")
public List<petrolBunk> getFuelStationDe()
{
	return fser.getDetails();
}
}