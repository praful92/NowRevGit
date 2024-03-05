package com.velocity.restcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringBootRestController {

	@GetMapping("/getMessage")
	public String getMessage() {
		return "Hello Spring Boot";
	}
}
