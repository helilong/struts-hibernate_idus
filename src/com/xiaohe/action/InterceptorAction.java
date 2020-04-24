package com.xiaohe.action;

import org.apache.struts2.components.ActionComponent;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.xiaohe.dao.UserinfoDao;
import com.xiaohe.dao.UserinfoDaoImpl;
import com.xiaohe.pojo.Userinfo;

public class InterceptorAction extends ActionSupport implements ModelDriven<Userinfo>{
	private Userinfo userinfo = new Userinfo();
	private UserinfoDao dao = new UserinfoDaoImpl();
	@Override
	public Userinfo getModel() {
		// TODO Auto-generated method stub
		return userinfo;
	}
		public String login() {
			System.out.println(userinfo);
			Userinfo u = dao.login(userinfo);
			System.out.println("u");
			if(u != null) {
				//��¼�ɹ�
				ActionContext.getContext().getSession().put("userinfo",u);
				return LOGIN;
			}else {
				//��¼ʧ��
				this.addActionError("�û��������������");
				return SUCCESS;
			}
			
			
			
			
		}

		
	
}
