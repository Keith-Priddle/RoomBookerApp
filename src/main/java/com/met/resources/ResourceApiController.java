package com.met.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.met.resources.Electrical;
import com.met.resources.Resource;
import com.met.resources.ResourceServices;

@RestController
@RequestMapping("/api")
public class ResourceApiController {

	private ResourceServices resourceServices;
	
	
	@Autowired
	public ResourceApiController(ResourceServices resourceServices) {
		//super();
		System.out.println("Testing entry ........");
		this.resourceServices = resourceServices;
	}
	

	@GetMapping("/resources")
	public List<Resource> getAllResources(){
		System.out.println("Working Here .............");
		
		return this.resourceServices.getAllResources();
	}
	
	
	
}
