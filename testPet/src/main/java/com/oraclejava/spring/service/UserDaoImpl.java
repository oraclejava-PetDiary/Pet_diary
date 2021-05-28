package com.oraclejava.spring.service;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.oraclejava.model.Users;

@Repository
@Transactional
public class UserDaoImpl implements UserDao{
	
	@Autowired
	private SessionFactory session;

	@Override
	public List<Users> list() {
		Session mysession;
		try {
				mysession = session.getCurrentSession();
			}catch (HibernateException mye) {
				mysession = session.openSession();
			}
		return mysession.createQuery("from Users").list();
	}

	@Override
	public Users getUser(int id) {
		Session mysession;
		try {
				mysession = session.getCurrentSession();
		}catch (HibernateException mye) {
			mysession = session.openSession();
		}
		Query query = mysession.createQuery("from Users u where u.id = :id");
		query.setParameter("id", id);
		return (Users) query.list().get(0);
	}
	
	
	
	
	@Override
	public boolean delete(Users users) {
	try {
		Session mysession;
		try {
			mysession = session.getCurrentSession();
		}catch (HibernateException mye) {
			mysession = session.openSession();
		}
		Transaction tx = mysession.beginTransaction();
		mysession.delete(users);
		tx.commit();
	}catch (Exception ex) {
		return false;
	}
		return true;
	}

	@Override
	public boolean saveOrUpdate(Users users) {
		Session mysession;
		try {
			mysession = session.getCurrentSession();
		}catch (HibernateException mye) {
			mysession = session.openSession();
		}
		Transaction tx = mysession.beginTransaction();
		mysession.saveOrUpdate(users);
		tx.commit();
		return true;
	}
	
	
}
