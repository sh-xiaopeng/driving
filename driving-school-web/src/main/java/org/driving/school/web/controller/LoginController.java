package org.driving.school.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	
	@RequestMapping("/")
	public String loginIndex(){
		return "/home/main";
	}
	
	@RequestMapping("/login")
	public String userLogin(Model model) {
		model.addAttribute("userName", "杨鹏程");
		return "/login/login";
	}
	
	@RequestMapping("/logining")
	public String userLogining(Model model) {
		//验证密码
		
		model.addAttribute("userName", "杨鹏程");
		return "/home/main";
	}
	
	@RequestMapping("/main")
	public String Login(Model model) {
		
		return "/home/main";
	}
	
	@RequestMapping("/left")
	public String left(Model model) {
		return "/home/left";
	}

	@RequestMapping("/index")
	public String index(Model model) {
		return "/home/index";
	}
	
	@RequestMapping("/top")
	public String top(Model model) {
		return "/home/top";
	}
	
}
