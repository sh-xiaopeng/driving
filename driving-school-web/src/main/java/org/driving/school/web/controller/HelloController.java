package org.driving.school.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	
	@RequestMapping("/webhello")
	public String hello(){
		return "/user/user";
	}
}
