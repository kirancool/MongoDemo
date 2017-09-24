package com.emp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;



@Service
public class EmpServiceImpl {
	@Autowired
	EmpService empService;

	public String getStock(String name,String address) throws JsonProcessingException {
		String result = null;
		ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
		result = ow.writeValueAsString(empService.findname(name,address));
		return result;
	}

	public String getDetails(String location, String pincode) throws NullPointerException, JsonProcessingException {
		String result = null;
		ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
		result = ow.writeValueAsString(empService.findlcoation(location,pincode));
		return result;
	}

	
}
