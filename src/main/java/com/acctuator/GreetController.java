package com.acctuator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {
	
	@GetMapping("/greetcall")
	public String tried() {
		return "Greet controller";
	}

}
