package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppConfiguration {

	@RequestMapping("/hello")
	public String helloWorld()
	{
		return "Hello World from Nikhil";
	}
}
