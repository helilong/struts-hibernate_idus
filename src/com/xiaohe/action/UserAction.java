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
	 * ����
	 * @return
	 */
	public String finAdd() {
		userDao.finAdd(userinfo);
		System.out.println("��ӷ���ִ��");
		return "finAdd";	
	}
	/**
	 * �޸���ת
	 * @return
	 */
	public String finEdit() {
		userinfo = userDao.get(userinfo.getUid());
		System.out.println("�޸���ת����ִ��");
		return "finEdit";
	}
	
	/**
	 * ɾ�����ݵķ���
	 * @return
	 */
	public String finDelete() {
		userDao.finDelete(userinfo.getUid());
		System.out.println("ɾ������ִ��");
		return "finDelete";
	}

	/**
	 * �޸����ݵķ���
	 * @return
	 */
	public String finUpdate() {
		userDao.finUpdate(userinfo);
		System.out.println("�޸ķ���ִ��");
		return "finUpdate";
	}
	
	/**
	 * ��ѯȫ�����ݵķ���
	 * @return
	 */
	public String finAll() {
		userList = userDao.finAll();
		System.out.println("��ѯȫ������ִ��");
		return "finAll";
	}
	
	
	
}
