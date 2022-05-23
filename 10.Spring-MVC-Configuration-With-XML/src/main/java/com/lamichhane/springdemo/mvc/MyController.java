package com.lamichhane.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/mycontroller")
public class MyController {
	
	@RequestMapping("/myData")
	public String myPage(Model model) {
		model.addAttribute("message","mahesh dai");
		return "helloworld";
	}

}
