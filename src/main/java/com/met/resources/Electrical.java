package com.met.resources;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;

@Entity
public class Electrical {

	@Id
	private long id;
	
	private String type;
	private String location;
	private String reference;
	private String manufacturer;
	
	
	public Electrical() {
		
	}
	
	public Electrical(long id, String type, String location, String reference, String manufacturer) {
		super();
		this.id = id;
		this.type = type;
		this.location = location;
		this.reference = reference;
		this.manufacturer = manufacturer;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getReference() {
		return reference;
	}
	public void setReference(String reference) {
		this.reference = reference;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	
	
	
}
