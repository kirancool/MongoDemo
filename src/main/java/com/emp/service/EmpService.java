package com.emp.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import com.emp.dao.EmpDao;
import com.emp.dao.LocationDao;
import com.emp.pojo.Emp;
import com.emp.pojo.Location;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;



@Service
public class EmpService {
	@Autowired
	EmpDao empDao;
	@Autowired
	LocationDao locationDao;
	@Autowired
	MongoTemplate mongoTemplate;
	
	
	public Emp findname(String name,String address){
	
		/*try
		{
		 BasicDBObject mongoObj = new BasicDBObject();	    
	    MongoClient mongo=new MongoClient("localhost:27017");
	     DB db=mongo.getDB("emp");
	     DBCollection collection = db.getCollection("TestEmp");
	      mongoObj.put("name", name);
	      mongoObj.put("address",address);
	      collection.insert(new BasicDBObject(mongoObj));
		 } catch (Exception ex) {
	           ex.printStackTrace();
	       }*/
		Emp emp=new Emp();
		emp.setName(name);
		emp.setName(address);
		
		return empDao.save(emp);
	       	
		}



	public Location findlcoation(String location, String pincode) throws NullPointerException,JsonProcessingException  {
	        Location loc=new Location();
	       	loc.setLocation(location);
			loc.setPincode(pincode);   
		        
			 
			 return locationDao.save(loc);
		}
	
	
}
