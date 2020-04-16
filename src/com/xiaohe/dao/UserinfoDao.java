package com.xiaohe.dao;



import java.util.List;

import com.xiaohe.pojo.Userinfo;

public interface UserinfoDao {
//	//增加
	void finAdd(Userinfo u);
//修改跳转取id
	Userinfo get(int id);
	
//	//删除
	void finDelete(int id);
//	//修改
	void finUpdate(Userinfo u);
	
	//查询表中所有值
	List<Userinfo> finAll();

	
}
