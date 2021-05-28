package com.oraclejava.spring.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.oraclejava.model.Users;
import com.oraclejava.spring.service.UserDao;

@Controller
public class UsersController {

	private final Logger logger = 
			LoggerFactory.getLogger(UsersController.class);
	
	@Autowired
	private UserDao userDao;
	
	@GetMapping("/userslist")
	public String userList(Model model) {
		logger.info("userslist");
		List<Users> users = userDao.list();
		
		model.addAttribute("users", users);
		
		return "users";
	}
	
	@GetMapping("/userDetail")
	public String getUserDetail(@RequestParam("id") int id, Model model) {
		logger.info("userDetail");
		Users user = userDao.getUser(id);
		model.addAttribute("user", user);
		return "user_detail";
	}
	
	@PostMapping(value="/userUpdate", params="update")
	public String getUserUpdate(Users user, Model model) {
		logger.info("userUpdate");
		Users oldUser = userDao.getUser(user.getId());
		oldUser.setName(user.getName());
		oldUser.setEmail(user.getEmail());
		oldUser.setPasswd(user.getPasswd());
		
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
