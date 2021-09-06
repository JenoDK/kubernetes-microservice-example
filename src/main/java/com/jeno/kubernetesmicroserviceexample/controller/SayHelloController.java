package com.jeno.kubernetesmicroserviceexample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1")
public class SayHelloController {

	@GetMapping(value = "/hello")
	public String countContent() {
		System.err.println("Bonjour");
		return "Hello";
	}

}
