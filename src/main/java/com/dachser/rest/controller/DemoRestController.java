package com.dachser.rest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class DemoRestController {

	@RequestMapping("/hello")
	public String returnHelloWorld() {
		
		return "Hello World of Demo Rest Controller";
	}
}
