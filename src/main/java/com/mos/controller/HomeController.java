package com.mos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/home")
	public String home() {
		
		return "/views/home";
	}
	
	
	
	@GetMapping("/about")
	public String about() {
		
		return "/views/about";
	}
	
	public void test(){
		
	}
}
