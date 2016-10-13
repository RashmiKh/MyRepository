package com.cybage.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cybage.model.User;
import com.cybage.service.HomeService;

@Controller
@RequestMapping("/home")
public class HomeController {
	
	@Autowired
	HomeService service;
	
	public HomeController() {
		System.out.println("Home Controller Ctor");
	}
	
	
	@RequestMapping(value="/next")
	public String showNextPage()
	{
		System.out.println("In showNextPage");
		return "home";
	}
	
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String showRegisterForm(@ModelAttribute("user") User user)
	{
		System.out.println("IN showRegisterForm");
		return "register";
	}
	
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String processRegisterForm(@ModelAttribute User user, ModelMap model)
	{
		System.out.println("in register");
		String status = service.registerUser(user);
		model.addAttribute("status", status);
		return "home";
	}
	
	@RequestMapping(value = "/get", method = RequestMethod.GET)
	public String getUser(ModelMap model)
	{
		model.addAttribute("ad", service.getUser(8));
		return "home";
	}
	
	@RequestMapping(value="/login", method = RequestMethod.GET)
	public String showLogin()
	{
		return "login";
	}
	
	@RequestMapping(value="/login", method = RequestMethod.POST)
	public String checkLogin(ModelMap model, HttpServletRequest request)
	{
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		if(email.equals("abc@gmail.com") && password.equals("123"))
		{
			model.addAttribute("status", "Login Successful!");
		}
		else
		{
			model.addAttribute("status", "Login failed!");
			return "redirect:login";
		}
		return "inbox";
	}
}
