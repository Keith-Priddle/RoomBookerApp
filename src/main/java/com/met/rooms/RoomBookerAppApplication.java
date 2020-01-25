package com.met.rooms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.met"})
public class RoomBookerAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(RoomBookerAppApplication.class, args);
	}

}
