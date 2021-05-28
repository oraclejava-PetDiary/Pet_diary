package com.oraclejava.spring.service;
import java.util.List;

import com.oraclejava.model.Users;

 
public interface UserDao {
	public List<Users> list();
	
	public boolean delete(Users users);
	
	public Users getUser(int id);
	
	public boolean saveOrUpdate(Users users);

}

 
