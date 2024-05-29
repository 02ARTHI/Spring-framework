package com.telusko.FirstSpringWebApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FirstController {
 
	@RequestMapping("/welcome")
	public ModelAndView displaySomeMessage()
	{
		ModelAndView mav = new ModelAndView();
		mav.addObject("message","hello! welcome to our first web app");
		mav.setViewName("index");
		return mav;
	}
}
