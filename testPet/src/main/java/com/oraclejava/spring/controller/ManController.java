package com.oraclejava.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ManController {

	@RequestMapping("/manInfo")
	public ModelAndView man() {
		ModelAndView mav = new ModelAndView("/man");  //man.jsp
		
		mav.addObject("name", "HyungKu Im");
		mav.addObject("mail", "damansa1@naver.com");
		mav.addObject("age", 45);
		mav.addObject("gender", false);  //남: true, 여: false
		
		return mav;
	}
}







