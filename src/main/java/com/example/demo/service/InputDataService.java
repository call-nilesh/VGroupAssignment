package com.example.demo.service;

import java.net.URI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.demo.TestCode;
import com.example.demo.entity.InputData;
import com.example.demo.repository.InputDataRepository;

@Service
public class InputDataService {
	@Autowired
	private InputDataRepository dataRepository;
	
	public InputData addData(InputData data)
	{
		String testData=data.getInData();
		//System.out.print(testData);
				List<String> output = TestCode.generatePermutations(testData);
				System.out.print(output);
				
				//output.stream().forEach(System.out::println);
			//	Iterator<InputData> list=output.iterator();
	 return dataRepository.save(data);		
	}

}
