package com.srm.authapp.authentication.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class AuthenticationController {
	@GetMapping("/signup")
	public String showSignUpPage() {
		
		return "signup";
	}
	@GetMapping("/login")
	public String showloginPage() {
		return "login";
	}
	@GetMapping("/otp")
	public String showotpPage() {
		return "otp";
	}
	@GetMapping("/dashboard")
	public String showdashboardPage() {
		return "dashboard";
	}
	@GetMapping("/register")
	public String showregisterPage() {
		return "register";
	}
	@GetMapping("/link")
	public String showlinkPage() {
		return "link";
	}
	
	
	

}