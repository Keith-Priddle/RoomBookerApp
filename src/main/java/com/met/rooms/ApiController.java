package com.met.rooms;

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
public class ApiController {

	private RoomServices roomServices;
	
	
	@Autowired
	public ApiController(RoomServices roomServices) {
		super();
		System.out.println("API Call");
		this.roomServices = roomServices;
	}
	
	
	@GetMapping("/rooms")
	public List<Room> getAllRooms(){
		System.out.println("API Call");
		return this.roomServices.getAllRooms();
	}
	
	
}
