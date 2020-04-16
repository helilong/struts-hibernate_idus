package com.xiaohe.action;

import java.util.List;

import com.xiaohe.dao.UserinfoDao;
import com.xiaohe.dao.UserinfoDaoImpl;
import com.xiaohe.pojo.Userinfo;

public class UserAction {
	
	private UserinfoDao userDao = new UserinfoDaoImpl();
	private Userinfo userinfo;
	private List<Userinfo> userList;
	
	public Userinfo getUserinfo() {
		return userinfo;
	}
	public void setUserinfo(Userinfo userinfo) {
		this.userinfo = userinfo;
	}
	public List<Userinfo> getUserList() {
		return userList;
	}
	public void setUserList(List<Userinfo> userList) {
		this.userList = userList;
	}
	/**
	 * 增加
	 * @return
	 */
	public String finAdd() {
		userDao.finAdd(userinfo);
		System.out.println("添加方法执行");
		return "finAdd";	
	}
	/**
	 * 修改跳转
	 * @return
	 */
	public String finEdit() {
		userinfo = userDao.get(userinfo.getUid());
		System.out.println("修改跳转方法执行");
		return "finEdit";
	}
	
	/**
	 * 删除数据的方法
	 * @return
	 */
	public String finDelete() {
		userDao.finDelete(userinfo.getUid());
		System.out.println("删除方法执行");
		return "finDelete";
	}

	/**
	 * 修改数据的方法
	 * @return
	 */
	public String finUpdate() {
		userDao.finUpdate(userinfo);
		System.out.println("修改方法执行");
		return "finUpdate";
	}
	
	/**
	 * 查询全部数据的方法
	 * @return
	 */
	public String finAll() {
		userList = userDao.finAll();
		System.out.println("查询全部方法执行");
		return "finAll";
	}
	
	
	
}
