package com.xiaohe.dao;



import java.util.List;

import com.xiaohe.pojo.Userinfo;

public interface UserinfoDao {
//	//����
	void finAdd(Userinfo u);
//�޸���תȡid
	Userinfo get(int id);
	
//	//ɾ��
	void finDelete(int id);
//	//�޸�
	void finUpdate(Userinfo u);
	
	//��ѯ��������ֵ
	List<Userinfo> finAll();

	
}
