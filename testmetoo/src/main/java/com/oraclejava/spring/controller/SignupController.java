package com.oraclejava.spring.controller;
 
import java.util.LinkedHashMap;
import java.util.Map;

import org.hibernate.event.spi.SaveOrUpdateEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.oraclejava.model.Users;
import com.oraclejava.spring.service.UserDao;




@Controller//회원가입 컨트롤러
public class SignupController {

	
	@Autowired
	private UserDao userDao;
	
	//라디오 버튼용 변수
	private Map<Boolean,String> radioMarriage;
	
	//라디오 버튼용 초기화 메소드
	private Map<Boolean,String> initRadioMarriage(){
		Map<Boolean,String> radio= new LinkedHashMap<>();
		
		radio.put(true, "기혼");
		radio.put(false, "미혼");
		
		return radio;
		
		
		
	}
	@ModelAttribute//public으로 하기
	public Users setUpUsers() {
		Users users=new Users();
		return users;
	}//객체 생성 나머지는 알아서 해준다. 모델이 여러개일때 //모델어트리뷰트를 추가하여 회원가입 폼 화면이 나오게 한다.
	
	
	
		@GetMapping("/signup")
		public String getSignup(Model model) {
			radioMarriage=initRadioMarriage();
			model.addAttribute("radioMarriage",radioMarriage);
			
			return "login/signup"; //login폴터의 signup.jsp로 이동
		}
		@PostMapping("/signup")
		public String postSignup(Users users,Model model) {
		
			userDao.saveOrUpdate(users);
			
			return "users";
	}
}
