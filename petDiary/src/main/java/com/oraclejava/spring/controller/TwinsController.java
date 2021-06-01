package com.oraclejava.spring.controller;

import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.oraclejava.spring.service.Twins;
import com.oraclejava.spring.service.TwinsDao;

@Controller
public class TwinsController {
	
	private final Logger logger = 
			LoggerFactory.getLogger(TwinsController.class);

	@Autowired
	private TwinsDao twinsDao;
	
	@ModelAttribute("twins")
	public Twins setUpForm() {
		Twins twins = new Twins();
		return twins;
	}
	
	@RequestMapping(value="/create", method=RequestMethod.GET)
	public String create(Model model) {
		logger.info("create");
		return "create";
	}
	
	@RequestMapping(value="/create", 
			method=RequestMethod.POST)
	public String create_c(@Valid Twins twins, 
			BindingResult bindingResult) {
		logger.info("create_c");
		
		Twins id_check = twinsDao.getTwinsOne(twins.getId());
		if (id_check != null) {
			bindingResult.rejectValue("id", "error.dupId",
					"아이디가 중복되었습니다. 다른 id를 선택하세요");
		}
		
		// 공통 에러 체크
		if (bindingResult.hasErrors()) {
			return "create";
		}
		
		twinsDao.createTwins(twins);
		return "redirect:/roster";
	}
	
	
	@RequestMapping(value="/edit", method=RequestMethod.GET)
	public String edit(@RequestParam("id") int id, Model model) {
		
		logger.info("edit");
		
		model.addAttribute("twins", twinsDao.getTwinsOne(id));
		return "edit";
	}
	
	@RequestMapping(value="/edit", method=RequestMethod.POST)
	public String editu( 
			@Valid Twins twins,
			BindingResult bindingResult,
			Model model, 
			RedirectAttributes attributes
			) {
		
		logger.info("edutu");
		
		if (bindingResult.hasErrors()) {
			return "edit";
		}
		
		boolean check = twinsDao.updateTwins(twins);
		
		if (check) {
			attributes.addFlashAttribute("success", "업데이트 성공!");
		} else {
			attributes.addFlashAttribute("fail", "업데이트 실패! "
					+ "관리자에게 문의하십시오");
		}
		
		return "redirect:/roster";
	}
	
	@RequestMapping("/roster")
	public String roster(Model model) {
		
		logger.info("roster");
		
		int myung = twinsDao.getTwinsCnt();
		List<Map<String, Object>> twins = twinsDao.getTwinsList();
		
		model.addAttribute("myung", myung);
		model.addAttribute("twins", twins);
		
		return "roster";
		
	}
	
	//아이디 중복체크
	@RequestMapping("/id_check")
	@ResponseBody
	public Twins id_check(@RequestParam("id") Integer id) {
		return twinsDao.getTwinsOne(id);
	}
}
