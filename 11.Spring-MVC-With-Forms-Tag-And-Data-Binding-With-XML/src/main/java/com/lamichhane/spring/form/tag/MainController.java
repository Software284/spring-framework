package com.lamichhane.spring.form.tag;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class MainController {
	@RequestMapping("/")
	public String loadFirstPage() {
		return "main-menu";
	}
}
