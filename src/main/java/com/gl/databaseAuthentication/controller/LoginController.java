package com.gl.databaseAuthentication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.gl.databaseAuthentication.service.MyUsersService;

@RestController
public class LoginController {
	@Autowired
	private MyUsersService service;

	@GetMapping(value="/index")
	public ModelAndView showIndexPage(){
		ModelAndView mv=new ModelAndView("index");
		return mv;	
	}
	@GetMapping(value="/home")
	public ModelAndView showHomePage(){
		return new ModelAndView("homePage");
	}
	@GetMapping(value="/loginpage")
	 public ModelAndView showLoginPage() {
		 return new ModelAndView("loginPage");
	 }
	@GetMapping(value="/loginerror")
	 public ModelAndView showErrorPage() {
		 return new ModelAndView("loginErrorPage");
	 }
}