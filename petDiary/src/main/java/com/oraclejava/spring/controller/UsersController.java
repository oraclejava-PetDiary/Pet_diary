package com.oraclejava.spring.controller;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.oraclejava.model.Users;
import com.oraclejava.spring.service.UserDao;

@Controller
@RequestMapping("/admin")
public class UsersController {

	private final Logger logger = LoggerFactory.getLogger(UsersController.class);
	
	@Autowired
	private UserDao userDao;
	
	//@RequestMapping(value="/userslist", method=RequestMethod.GET)
	@GetMapping("/userslist")
	public String userList(Model model) {
		logger.info("userslist");
		List<Users> users = userDao.list();
		
		model.addAttribute("users", users);
		return "users";
		
		}
		
	//@RequestMapping(value="/userDetail", method=RequestMethod.POST)
	@GetMapping("/userDetail")
	public String getUserDetail(@RequestParam("id") int id, Model model) {
		logger.info("userDetail");
		Users user = userDao.getUser(id);
		model.addAttribute("user", user);
		return "user_detail";
	}
	
	@PostMapping(value="/userUpdate", params="update") //버튼이 여러개 있을 때 사용
	public String getUserUpdate(Users user, Model model) {
		logger.info("userUpdate");
		Users oldUser = userDao.getUser(user.getId());
		oldUser.setName(user.getName());
		oldUser.setEmail(user.getEmail());
		oldUser.setPassword(user.getPassword());
		
		userDao.saveOrUpdate(oldUser);
		return "redirect:/userslist";
	}
	
	@PostMapping(value="/userUpdate", params="delete")
	public String getUserDelete(Users user, Model model) {
		logger.info("userDelete");
		Users oldUser = userDao.getUser(user.getId());
		userDao.delete(oldUser);
		return "redirect:/userslist";
	}
}
