package com.example.resfulwebservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping("/hello")
	public Hello hello (){
	
		return new Hello(1L,"Hello World");
	}

}
