package com.RestApiCalls.Contoller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWebRestController {
	@RequestMapping("/hello")
	public String index() {
		return "Hello From BridgeLabz!!!!!!!!!";
	}
}
