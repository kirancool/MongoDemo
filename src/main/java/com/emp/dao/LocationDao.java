package com.emp.dao;

import java.sql.SQLException;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.emp.pojo.Emp;
import com.emp.pojo.Location;
import com.fasterxml.jackson.core.JsonProcessingException;

public interface LocationDao extends MongoRepository<Location,String> {
	@Query(value="{'location' :?0,'pincode' :?1}")
	   
	public Location findlocation(String location,String pincode);

}
