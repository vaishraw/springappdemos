package com.samples.springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.samples.springmvc.domain.Employee;

@Controller
public class ListController {

	@RequestMapping("/readlist")
	public ModelAndView sendlist() {
		ModelAndView modelandview = new ModelAndView();
		modelandview.setViewName("displaylist");

		List<Employee> emps = new ArrayList<>();

		Employee employee = new Employee();
		employee.setId(101);
		employee.setName("Max");
		employee.setSalary(20000);
		emps.add(employee);

		employee = new Employee();
		employee.setId(202);
		employee.setName("Sam");
		employee.setSalary(34500);
		emps.add(employee);
		
		employee = new Employee();
		employee.setId(303);
		employee.setName("Harry");
		employee.setSalary(40500);
		emps.add(employee);

		modelandview.addObject("employees", emps);

		return modelandview;
	}

}
