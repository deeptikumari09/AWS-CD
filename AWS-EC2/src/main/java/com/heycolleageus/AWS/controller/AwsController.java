package com.heycolleageus.AWS.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class AwsController {
	@GetMapping("/show")
	public String AwsDeploy() {
		return "Congratulations Deploy Successfully on AWS";
	}

}
