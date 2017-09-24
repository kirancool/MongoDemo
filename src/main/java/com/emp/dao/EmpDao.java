package com.emp.dao;



import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.emp.pojo.Emp;

public interface EmpDao extends MongoRepository<Emp,String>{
	@Query(value="{'name' :?0,'adddress' :?1}")
   
	public Emp findname(String name,String address);
	


}
