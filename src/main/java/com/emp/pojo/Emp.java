package com.emp.pojo;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="emplyoee")
public class Emp {
	
	String name;
	String address;
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Emp()
	{
	}
     Emp(String name,String address)
     {
    	 this.name=name;
    	 this.address=address;
     }
	Emp(String name)
	{
		this.name=name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Emp [name=" + name + ", address=" + address + "]";
	}

	
	
}
