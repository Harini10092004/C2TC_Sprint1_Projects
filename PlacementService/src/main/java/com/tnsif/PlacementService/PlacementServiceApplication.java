package com.tnsif.PlacementService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PlacementServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlacementServiceApplication.class, args);
        System.out.println("✅ Placement Service Running on port 8080...");
	}

}
