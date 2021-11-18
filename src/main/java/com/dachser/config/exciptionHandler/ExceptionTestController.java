package com.dachser.config.exciptionHandler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/exception")
public class ExceptionTestController {

	
	
	@GetMapping("/entitynotfound")
	public String entitynotfound() {
		
		//return "this function to test entity not found!";
		throw new ExceptionNotFound("test entity Not Found Exception method");
	}
	
	@GetMapping("/validation/{id}")
	public String validation(@PathVariable int id) {
		
		//return "this function to test entity not found!";
		throw new ExceptionNotFound("test entity Not Found Exception method");
	}
	

}
