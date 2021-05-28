package com.oraclejava.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BMI2Controller {

	@ModelAttribute("bmiForm")
	public BMIForm setUpForm() {
		BMIForm form = new BMIForm();
		return form;
	}
	
	@RequestMapping(value="/bmi2.do", method=RequestMethod.GET)
	public String showBmiForm() {
		return "bmi33";
	}
	
	@RequestMapping(value="/bmi2.do", method=RequestMethod.POST)
	public String bmi(BMIForm bmiForm, Model model) {
		
		model.addAttribute("tall", bmiForm.getTall());
		model.addAttribute("weight", bmiForm.getWeight());
		
		return "bmi";
	}
}






