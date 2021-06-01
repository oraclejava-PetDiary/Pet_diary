package com.oraclejava.spring.service;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class TwinsDaoMybatis implements TwinsDao {
	
	@Autowired
	private SqlSession session;
	
	public int getTwinsCnt() {
		return session.selectOne(
			"com.oraclejava.spring.service."
			+ "TwinsDao.getTwinsCnt");
	}
	
	public List<Map<String, Object>> getTwinsList() {
		return session
			.selectList("com.oraclejava.spring.service."
					+ "TwinsDao"
					+ ".getTwinsList");
	}
	
	
	public Twins getTwinsOne(int id) {
		return session.selectOne(
				"com.oraclejava.spring.service."
				+ "TwinsDao.getTwinsOne", id);
	}

	@Override
	public boolean updateTwins(Twins twins) {
		int count = session.update("com.oraclejava.spring.service.TwinsDao.updateTwins", twins);
		if (count == 0) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public void createTwins(Twins twins) {
		session.insert("com.oraclejava.spring.service.TwinsDao.createTwins", twins);
		
	}


}






























