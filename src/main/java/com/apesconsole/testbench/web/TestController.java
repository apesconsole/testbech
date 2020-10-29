package com.apesconsole.testbench.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestController {

	@GetMapping("/get/{message}")
	public @ResponseBody String testApi(@PathVariable("message") String message){
		return message.concat(" - ").concat("Transformed");
	}
}
