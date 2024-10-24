package com.acctuator;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {
	
	@GetMapping("/testcall")
	public String getTest() {
		return "testin API";
	}
	

}
