package com.lamichhane.spring.form.tag;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	
	
	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		Student s = new Student();
		theModel.addAttribute("student",s);
		return "student-form";
		}
	
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student theStudent) {
		return "student-confirmation";
	}
}
