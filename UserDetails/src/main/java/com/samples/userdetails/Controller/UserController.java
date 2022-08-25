package com.samples.userdetails.Controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;

import org.springframework.web.bind.annotation.ModelAttribute;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.samples.userdetails.entity.User;
import com.samples.userdetails.service.UserService;

//import javax.servlet.http.HttpServlet;
////import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;

@Controller
public class UserController {

	@Autowired
	private UserService userservice;

	@RequestMapping("/register")
	public String showRegistrationPage() {
		return ("userreg");
	}

	@RequestMapping("/update")
	public String ShowUpdationPage() {
		return ("updatedetails");
	}

	@RequestMapping("/read")
	public String readuser() {
		return ("readuser");
	}

	@RequestMapping(value = "/registeruser", method = RequestMethod.POST)
	public String registerUser(@ModelAttribute("user") User user, ModelMap model) {

		int id = userservice.save(user);

		model.addAttribute("result", "User created with Id: " + id);

		return ("userreg");

	}

	@RequestMapping(value = "/updateuser", method = RequestMethod.POST)
	public String updateUser(@ModelAttribute("user") User user, ModelMap model) {

		userservice.updation(user);

		model.addAttribute("result", user);

		return ("updatedetails");

	}

	@RequestMapping(value = "/readuser", method = RequestMethod.POST)
	public String showUser(HttpServletRequest req, ModelMap model) {
	
		int id=Integer.parseInt(req.getParameter("id"));
		
		User result=userservice.read(id);

		model.addAttribute("result",result);

		return ("readuser");

	}

}
