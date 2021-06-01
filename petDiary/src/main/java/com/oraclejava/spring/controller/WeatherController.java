package com.oraclejava.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WeatherController {

	@RequestMapping("/weather.do")
	public ModelAndView test() {
		ModelAndView model = new ModelAndView("/weather");
		//뷰 폴더: src/main/webapp/WEB-INF/views
		//뷰 이름: weather.jsp
		model.addObject("today", "맑음");
		return model;
	}
}
