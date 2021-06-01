package com.oraclejava.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {
	
	@RequestMapping("/hello")
	public ModelAndView helloWorld() {
		ModelAndView mav = new ModelAndView("/helloView");  //생성자에 뷰이름 설정
		mav.addObject("message1", "Hello World");  //모델 추가
		mav.addObject("name", "임형구");
		
		return mav;
	}
	
	@RequestMapping("/access_denied_page")
	public ModelAndView access_denied_page() {
		ModelAndView mav = new ModelAndView("/access_denied_page");  //생성자에 뷰이름 설정
		mav.addObject("message1", "NO ACCESS");  //모델 추가
		mav.addObject("name", "임형구");
		
		return mav;
}
}
