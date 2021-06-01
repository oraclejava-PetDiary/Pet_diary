package com.oraclejava.spring.service;
import java.util.List;
import com.oraclejava.model.Users;
public interface UserDao {
	public List<Users> list();
	
	public Users getUser(int id);
	
	public boolean delete(Users users);
	public boolean saveOrUpdate(Users users);
	
	
}
