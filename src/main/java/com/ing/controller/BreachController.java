package com.ing.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ing.dto.BreachDTO;
import com.ing.exception.ErrorResponse;
import com.ing.service.BreachServiceImpl;

@CrossOrigin(allowedHeaders = { "*", "*/" }, origins = { "*", "*/" })
@RestController
public class BreachController {

	@Autowired
	BreachServiceImpl breachService;
	
	@PostMapping("/user/breach")
	public ResponseEntity<ErrorResponse> createBreach(@RequestBody BreachDTO breach){
		ErrorResponse response = new ErrorResponse();
		response.setMessage(breachService.createBreach(breach));
		response.setStatusCode(201);
		return new ResponseEntity<ErrorResponse>(response, HttpStatus.CREATED);
	}
	
	@GetMapping("/user/ruleengine")
	public ResponseEntity<ErrorResponse> getRuleEngineDetails(){
		ErrorResponse response = new ErrorResponse();
		response.setMessage(breachService.getRules());
		response.setStatusCode(200);
		return new ResponseEntity<ErrorResponse>(response, HttpStatus.OK);
	}
}
