package com.samples.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.samples.springmvc.domain.User;

@Controller
public class UserController {

//	@RequestMapping("/register")
//	public ModelAndView showregistrationpage() {
//		ModelAndView mv = new ModelAndView();
//		mv.setViewName("userreg");
//		return mv;
//	}

	@RequestMapping("/register")
	public String showregistrationpage() {
		return ("userreg");
	}

//	@RequestMapping(value = "/registeruser", method = RequestMethod.POST)
//	public ModelAndView registerUser(@ModelAttribute("user") User user) {
//		System.out.println("User object retrieved from UI = " + user);
//
//		ModelAndView mv = new ModelAndView();
//		mv.addObject("userfromcontroller", user);
//		mv.setViewName("userregresult");
//		return mv;
//	}

	@RequestMapping(value = "/registeruser", method = RequestMethod.POST)
	public String registerUser(@ModelAttribute("user") User user, ModelMap model) {
		model.addAttribute("userfromcontroller", user);
		return ("userregresult");
	}

}
