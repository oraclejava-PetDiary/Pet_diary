package com.oraclejava.spring.service;

import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class TwinsMain {
	public static void main(String[] args) {
		ApplicationContext context = 
				new ClassPathXmlApplicationContext(
						"applicationContext.xml");
		JdbcTemplate jdbcTemplate = context.getBean(JdbcTemplate.class);
		//카운트 쿼리처럼 단일 데이터를 리턴하는 sql -> queryForObject
		//select * from 테이블 처럼 여러행을 리턴하는 sql -> queryForList
		int myung = jdbcTemplate
			.queryForObject("select count(*) from lgtwins", Integer.class);
		System.out.println(myung + "명");
		
		List<Map<String, Object>> list = 
				jdbcTemplate.queryForList("select * from lgtwins");
		System.out.println("선수id\t선수명\t연봉(만원)");
		for (Map<String, Object> map : list) {
			System.out.println(map.get("sunsu_id") + "\t" 
						+ map.get("sunsu") + "\t"
						+ map.get("salary"));
		}
		
	}
}












