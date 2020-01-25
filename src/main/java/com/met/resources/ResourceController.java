package com.met.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/resources")
public class ResourceController {

	private ResourceServices resourceServices;
	
	@Autowired
	public ResourceController(ResourceServices resourceServices) {
		super();
		this.resourceServices = resourceServices;
	}
	
	@GetMapping
	public String getAllResources() {
		
		this.resourceServices.getAllResources();
		
		return "resources";
	}
	
}
