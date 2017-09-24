package com.emp.controller;

import java.sql.SQLException;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


import com.emp.service.EmpService;
import com.emp.service.EmpServiceImpl;
import com.fasterxml.jackson.core.JsonProcessingException;




@Controller
@RequestMapping(value="/empn")
public class EmpController {
	@Autowired
	 private EmpService empService;
	
	@Autowired
	EmpServiceImpl empServiceImpl;
	
	@RequestMapping(value = "/getStock", method = RequestMethod.GET)
	public @ResponseBody String getStockPriceOpen(@RequestParam(value="name")String name,@RequestParam(value="address")String address) throws SQLException, JsonProcessingException
			 {	
		return empServiceImpl.getStock(name,address);
	}
	@RequestMapping(value = "/getDetail", method = RequestMethod.GET)
	public @ResponseBody String getDetails(@RequestParam(value="Location")String location,@RequestParam(value="pincode")String pincode) throws NullPointerException,SQLException, JsonProcessingException
			 {	
		return empServiceImpl.getDetails(location,pincode);
	}

}
