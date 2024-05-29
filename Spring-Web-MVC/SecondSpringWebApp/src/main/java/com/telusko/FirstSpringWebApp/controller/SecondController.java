package com.telusko.FirstSpringWebApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;



@Controller
@RequestMapping("controller2")
public class SecondController {
 
	@RequestMapping(value="/welcome", method=RequestMethod.GET) // get method by default
	public String displaySomeMessage(Model model)
	{
		
		model.addAttribute("message","focus is the key");
		return "course"; //logical view name
	}
}
