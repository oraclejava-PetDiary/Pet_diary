package com.oraclejava.spring.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.oraclejava.spring.service.LifeMovie;
@Controller
public class MovieController {

	@RequestMapping(value="/ajax/lifeMovie")
	@ResponseBody
	public List<LifeMovie> lifeMovie(){
		List<LifeMovie> movieList=new ArrayList<>();
		movieList.add(new LifeMovie(1,"트랜스포머","로봇의 변신"));
		movieList.add(new LifeMovie(2,"해리포터","아즈카반의 죄수가 제일 재밌었음"));
		movieList.add(new LifeMovie(3,"매드맥스","자동차 스릴 액션"));
		movieList.add(new LifeMovie(4,"어벤져스","최고의 영화"));
		movieList.add(new LifeMovie(5,"부산행과 반도","한국 좀비영화"));
	
			return movieList;
	}
}
