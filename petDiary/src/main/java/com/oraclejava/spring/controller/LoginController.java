package com.oraclejava.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.oraclejava.model.Users;

@Controller
public class LoginController {

		@ModelAttribute("users")
		public Users setUpUsers() {
			Users users = new Users();
			return users;
		}
		
		@GetMapping("/login")
		public String getLogin(Model model) {
			return "login/login"; //login 폴더의 login.jsp
		}
}
