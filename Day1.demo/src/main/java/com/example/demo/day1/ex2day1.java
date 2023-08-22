package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class ex2day1 {
	@Value("${var}")
	private String studentName; 
	@GetMapping("blue")
	public String GetName() {
		return "Welcome "+studentName;
	}
}
