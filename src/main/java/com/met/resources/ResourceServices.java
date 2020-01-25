package com.met.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;



@Service
public class ResourceServices {

	

	
	private ResourceServices resourceServices;
	
	public List<Resource> getAllResources(){
		List<Resource> resources = new ArrayList<>();
		resources.add(new Resource(1, "Test1","Test1"));
		resources.add(new Resource(2, "Test2","Test2"));
		resources.add(new Resource(3, "Test3","Test3"));
		return resources;
	}
	
	
}
