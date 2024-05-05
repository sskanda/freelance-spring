package com.mvc.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
		
	@GetMapping("/")
	public String home()
	{
		System.out.println("came at home");
		return "index.jsp";
	}
	
}
