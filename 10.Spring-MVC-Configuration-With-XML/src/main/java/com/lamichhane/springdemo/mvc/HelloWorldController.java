package com.lamichhane.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {
	
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(HttpServletRequest request,Model model) {
		String s = request.getParameter("studentName");
		String name = "Hi "+s.toUpperCase();
		model.addAttribute("message",name);
		return "helloworld";
	}
	
	@RequestMapping("/myForm")
	public String requestParameterExample(@RequestParam("studentName") String data,Model model) {
		model.addAttribute("message",data);
		return "helloworld";
		
	}
}
