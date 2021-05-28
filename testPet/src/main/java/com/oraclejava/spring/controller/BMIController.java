package com.oraclejava.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BMIController {

	@RequestMapping("/bmi.do")
	public ModelAndView bmi() {
		ModelAndView model = new ModelAndView("/bmi");
		model.addObject("tall", 1.77); //키
		model.addObject("weight", 79);	//몸무게
		return model;
	}
}
