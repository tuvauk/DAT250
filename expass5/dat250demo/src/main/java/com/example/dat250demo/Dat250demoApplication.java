package com.example.dat250demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//From exercise 1
@RestController
public class Dat250demoApplication {

	/*public static void main(String[] args) {
		SpringApplication.run(Dat250demoApplication.class, args);
	}
*/
	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "world") String name) {
		return String.format("Hello %s!", name);
	}

}
