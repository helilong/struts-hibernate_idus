package com.xiaohe.dao;

import java.util.ArrayList;
import java.util.List;


import com.xiaohe.pojo.Userinfo;

import org.hibernate.Query;
import org.hibernate.Session;
//hibernate框架的导入的包
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class UserinfoDaoImpl implements UserinfoDao{

	@Override
	public void finAdd(Userinfo u) {
		// TODO Auto-generated method stub
		List<Userinfo> userList = new ArrayList();
        SessionFactory sf = new Configuration().configure().buildSessionFactory();
        Session s = sf.openSession();
        s.beginTransaction();
        s.save(u);
        s.getTransaction().commit();
        s.close();
        sf.close();
        
	}

	@Override
	public Userinfo get(int id) {
		Userinfo u = null;
        SessionFactory sf = new Configuration().configure().buildSessionFactory();
        Session s = sf.openSession();
        u = (Userinfo)s.get(Userinfo.class, id);
        s.close();
        sf.close();
		return u;
	}

	@Override
	public void finDelete(int id) {
		List<Userinfo> userList = new ArrayList();
        SessionFactory sf = new Configuration().configure().buildSessionFactory();
        Session s = sf.openSession();
		s.beginTransaction();
		Userinfo u = (Userinfo)s.get(Userinfo.class, id);
		s.delete(u);
		s.getTransaction().commit();
		s.close();
		sf.close();
		
	}

	@Override
	public void finUpdate(Userinfo u) {
		// TODO Auto-generated method stub
        SessionFactory sf = new Configuration().configure().buildSessionFactory();
        Session s = sf.openSession();
		s.beginTransaction();
		s.update(u);
		s.getTransaction().commit();
		s.close();
		sf.close();
	}
	
	
	
	@Override
	public List<Userinfo> finAll() {
		List<Userinfo> userList = new ArrayList();
		 
        SessionFactory sf = new Configuration().configure()
                .buildSessionFactory();
        Session s = sf.openSession();
 
        Query q = s.createQuery("from Userinfo p");
 
        userList = q.list();
 
        s.close();
        sf.close();
        return userList;
	}

	@Override
	public Userinfo login(Userinfo userinfo) {
		 SessionFactory sf = new Configuration().configure()
	                .buildSessionFactory();
	        Session s = sf.openSession();
	       Transaction tx = s.beginTransaction();
	        Query q = s.createQuery("from Userinfo where uname=? and upassword=?");
	        q.setParameter(0, userinfo.getUname());
	        q.setParameter(0, userinfo.getUpassword());
	        Userinfo u = (Userinfo) q.uniqueResult();
	        System.out.println(u+"判断登录的数据库的值");
	        tx.commit();
	        s.close();
	        sf.close();
		return u;
	}

	

	

}
