package com.emp.pojo;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="location")
public class Location {
	private String location;
	private String pincode;
	@Override
	public String toString() {
		return "Location [location=" + location + ", pincode=" + pincode + "]";
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

}
