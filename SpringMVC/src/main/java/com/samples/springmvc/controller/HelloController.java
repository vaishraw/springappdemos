package com.samples.springmvc.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	@RequestMapping("/hello")
	public ModelAndView hello() {
		ModelAndView modelandview=new ModelAndView();
		modelandview.setViewName("hello");
		
		modelandview.addObject("id", 101);
		modelandview.addObject("name", "Ander");
		modelandview.addObject("salary", 60000);
		
		return modelandview;
	}

}
