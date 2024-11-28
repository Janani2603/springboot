package com.ust.service.controller;




/*import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/service")//what it have ij path..should match
public class HelloController {
	@Autowired
	Environment environment;
	@GetMapping
	public String confirm() {
		return "from port# "+environment.getProperty("local.server.port");
	}
	
	

}*/


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
@RestController
@RequestMapping("/api/client")
public class HelloController {
	@Autowired
	RestTemplate template;
	public final static String CLIENT_SERVICE="clientservice";
	
	@GetMapping
	@CircuitBreaker(name=CLIENT_SERVICE, fallbackMethod="callOnFail")
	public String callServer() {
		String url="http://localhost:8094/rest/service/port";
		String Output=template.getForObject(url, String.class);
		return Output;
	}
	 public String callOnFail(Exception e) {
		 return "message from callOnFail()...";
		 
	 }

}

