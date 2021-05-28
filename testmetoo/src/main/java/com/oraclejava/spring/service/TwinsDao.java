package com.oraclejava.spring.service;

import java.util.List;
import java.util.Map;

public interface TwinsDao {
	public int getTwinsCnt();
	public List<Map<String, Object>> getTwinsList();
	public Twins getTwinsOne(int id);
	public boolean updateTwins(Twins twins);//게시판 수정,갱신처리, 갱신0건이면 false, 1건 이상이면 true
	
	//등록하기
	public void createTwins(Twins twins);
	
}
