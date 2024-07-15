package com.learning.springBootForm;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {
  
	@GetMapping("/register")
	public String getform(Model model)
	{
		User user = new User();
		model.addAttribute("user",user);
		List<String> jobs = Arrays.asList("Devops","aws","azure");
		model.addAttribute("listProfession",jobs);
		return "register_form";                                                                                 
	}
	
	@PostMapping("/register")
	public String submitform(Model model,@ModelAttribute("user") User user)
	{
		System.out.println(user);
		
		return"register_success";
	}
}
