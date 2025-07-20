package com.example.WebApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

	@RequestMapping("/")
	public @ResponseBody String greeting() {
		return "Hello, World!";
	}

	
	@RequestMapping("/thayna")
	public @ResponseBody String greetingThayna() {
		return "Hello, Thayna!";
	}
	
	@RequestMapping("/user")
	public @ResponseBody String greetingUser() {
		return "Hello, User!";
	}
	
	@RequestMapping("/hotfix")
	public @ResponseBody String hotfix() {
		return "Hotfix";
	}
	
	
}
