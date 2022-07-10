package jp.co.sunarch.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

	@GetMapping("/")
	public String helloWorld(Model model) {
		model.addAttribute("message", "Hello World!!");
		return "index";
	}
	
	@GetMapping("/top")
	public String top(Model model) {
		return "top";
	}
	
	@GetMapping("/menu")
	public String menu(Model model) {
		return "menu";
	}
}
