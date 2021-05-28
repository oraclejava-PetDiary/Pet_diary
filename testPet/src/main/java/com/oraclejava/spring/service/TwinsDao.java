package com.oraclejava.spring.service;

import java.util.List;
import java.util.Map;

public interface TwinsDao {
	public int getTwinsCnt();
	public List<Map<String, Object>> getTwinsList();
	public Twins getTwinsOne(int id);
	//갱신 0건이면 false, 1건 이상이면 true
	public boolean updateTwins(Twins twins);
	//등록
	public void createTwins(Twins twins);


}
