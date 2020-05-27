package com.example.demo.controller;

import java.net.URI;

import javax.validation.Valid;
import javax.validation.constraints.Size;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.demo.entity.InputData;
import com.example.demo.service.InputDataService;


@RestController
@RequestMapping("/sendData")
public class InputDataController {
	
	@Autowired
	private InputDataService dataService;
	
	@PostMapping("/firstinput")
	public ResponseEntity<Object> addDataInput(@Valid @Size(min = 2,max=4,message = "Name Should have at least 2 and Maximum 4 character") @RequestBody  InputData data)
	{
		InputData test=dataService.addData(data);
		//System.out.print(test.getIntId());
		//System.out.print(test.getInData());		
		URI location=ServletUriComponentsBuilder.fromCurrentRequest().path("{/intId}")
				.buildAndExpand(test.getIntId()).toUri();
		
		return ResponseEntity.created(location).build();
		
	}

}
