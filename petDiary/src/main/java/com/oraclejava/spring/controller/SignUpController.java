package com.oraclejava.spring.controller;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.oraclejava.model.Users;
import com.oraclejava.spring.service.UserDao;

@Controller
public class SignUpController {

	@Autowired
	private UserDao userDao;
	
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	
	//라디오 버튼용 변수
	private Map<Boolean,String> radioMarriage;
	
	//라디오 버튼용 초기화 메소드
	private Map<Boolean, String> initRadioMarriage() {
		Map<Boolean, String> radio = new LinkedHashMap<>();
		
		radio.put(true,"기혼");
		radio.put(false,"미혼");
		
		return radio;
	}
	
	@ModelAttribute
	public Users setUpUsers() {
		Users users = new Users();
		return users;
	}
	
	@GetMapping("/signup")
	public String getSignup(Model model) {
		
		radioMarriage = initRadioMarriage();
		model.addAttribute("radioMarriage", radioMarriage);
		
		return "login/signup"; //login폴더의 signup.jsp로 이동
		
	}
	
	@PostMapping("/signup")
	public String postSignup(Users users, Model model) {
		users.setRole("ROLE_USER");
		users.setPassword(passwordEncoder.encode(users.getPassword()));
		userDao.saveOrUpdate(users);
		return "redirect:/login";
	}
}
