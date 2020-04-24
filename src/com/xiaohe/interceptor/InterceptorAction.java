package com.xiaohe.interceptor;

import org.apache.struts2.ServletActionContext;


import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;
import com.xiaohe.pojo.Userinfo;

public class InterceptorAction extends MethodFilterInterceptor{

	@Override
	protected String doIntercept(ActionInvocation i) throws Exception {
		// TODO Auto-generated method stub
		//ÅÐ¶ÏÊÇ·ñµÇÂ¼
		Userinfo u = (Userinfo) ServletActionContext.getRequest().getSession().getAttribute("userinfo");
		if(u == null) {
			//Ã»ÓÐµÇÂ¼
			return ActionSupport.LOGIN;
		}else {
			return i.invoke();
		}
	}
	
	
	
}
