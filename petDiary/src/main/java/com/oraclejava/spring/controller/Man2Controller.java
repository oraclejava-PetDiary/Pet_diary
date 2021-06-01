package com.oraclejava.spring.controller;

import java.io.File;
import java.io.IOException;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class Man2Controller {

	@Autowired
	private ServletContext servletContext;
	
	@ModelAttribute
	public ManForm setUpForm() {
		ManForm mf = new ManForm();
		return mf;
	}
	
	@RequestMapping(value="/manInfo2.do", method=RequestMethod.GET)
	public String showManForm() {
		return "man2";
	}
	
	@RequestMapping(value="/manInfo2.do", method=RequestMethod.POST)
	public String checkMan(
			@RequestParam("photo") MultipartFile photo,
			ManForm manForm, Model model) throws IllegalStateException, IOException {
		
		//사진을 업로드했을 경우
		if (!photo.getOriginalFilename().isEmpty() && !photo.isEmpty()) {
			String realPath = 
					servletContext.getRealPath("/resources/upload");
			File uploadFile = 
				new File(realPath + "/" + photo.getOriginalFilename());
			photo.transferTo(uploadFile);
		}
		
		model.addAttribute("name", manForm.getName());
		model.addAttribute("mail", manForm.getMail());
		model.addAttribute("age", manForm.getAge());
		model.addAttribute("gender", 
			manForm.getGender().equals("남자")?true:false);
		
		return "man";
	}
}






