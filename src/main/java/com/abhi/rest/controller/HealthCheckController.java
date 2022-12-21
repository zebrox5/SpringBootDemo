package com.abhi.rest.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HealthCheckController {
	
	@GetMapping(path="/healthcheck/liveness")
	public @ResponseBody ResponseEntity<String> livenessCheck() {
		System.out.println("Inside LlivenessCheck()");
		return new ResponseEntity<String>("Liveness Check successful", HttpStatus.OK);
	}
	
	@GetMapping(path="/healthcheck/readiness")
	public @ResponseBody ResponseEntity<String> readinessCheck() {
		System.out.println("Inside readinessCheck()");
		return new ResponseEntity<String>("Readiness Check successful", HttpStatus.OK);
	}

}
