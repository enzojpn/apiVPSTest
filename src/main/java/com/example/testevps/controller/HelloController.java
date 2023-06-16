package com.example.testevps.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/hi")
	public String hello() {
		return "TEST OK";
	}
	
	
}
