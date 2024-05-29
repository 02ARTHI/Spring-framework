package com.telusko.FirstSpringWebApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;



@Controller
@RequestMapping("controller1")
public class FirstController {
 
	@RequestMapping(value="/welcome", method=RequestMethod.GET) // get method by default
	public String displaySomeMessage(Model model)
	{
		
		model.addAttribute("message","welcome back aliens");
		return "home"; //logical view name
	}
}
