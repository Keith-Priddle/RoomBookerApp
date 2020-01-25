package com.met.resources;

public class Resource {

	private long id;
	private String type;
	private String location;
	
	public Resource() {
		
	}

	public Resource(long id, String type, String location) {
		super();
		this.id = id;
		this.type = type;
		this.location = location;
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

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Resource [id=");
		builder.append(id);
		builder.append(", type=");
		builder.append(type);
		builder.append(", location=");
		builder.append(location);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
	
	
}
