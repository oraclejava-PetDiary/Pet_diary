package com.oraclejava.spring.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.oraclejava.spring.service.LifeMovie;

@Controller
public class MovieController {

	@RequestMapping("/ajax/lifeMovie")
	@ResponseBody 
	public List<LifeMovie> lifeMovie() {
		List<LifeMovie> movieList = new ArrayList<>();
		movieList.add(new LifeMovie(1, "신고질라", "괴수영화 ㅋㅋㅋ"));
		movieList.add(new LifeMovie(2, "트랜스포머", "넘 재밌어 ㅋㅋㅋ"));
		movieList.add(new LifeMovie(3, "평양성", "꼭 보세요 왕잼"));
		movieList.add(new LifeMovie(4, "황산벌", "최고의 전쟁영화 ㅋㅋ"));
		movieList.add(new LifeMovie(5, "인천상륙작전", "연안부두"));
		
		return movieList;
		
	}
}
