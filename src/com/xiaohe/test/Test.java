package com.xiaohe.test;

import com.xiaohe.dao.UserinfoDao;
import com.xiaohe.dao.UserinfoDaoImpl;
import com.xiaohe.pojo.Userinfo;

public class Test {

	public static void main(String[] args) {
		
		UserinfoDao userinfoDao = new UserinfoDaoImpl();
		for(Userinfo u:userinfoDao.finAll()) {
			System.out.println(u.getUid());
		}
	}
}
