<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>显示</title>
</head>
<body>
<table align="center" border="1" cellspacing="0" width="500px">
 
    <tr>
        <td>编号</td>
        <td>用户名</td>
        <td>密码</td>
        <td>姓名</td>
        <td>修改操作</td>
        <td>删除操作</td>
    </tr>
 
    <s:iterator value="userList" var="u">
        <tr>
            <td>${u.uid}</td>
            <td>${u.uuser}</td>
            <td>${u.upassword}</td>
            <td>${u.uname}</td>
            <td><a href="userEdit?userinfo.uid=${u.uid}">修改</a></td>
            <td><a href="userDelete?userinfo.uid=${u.uid}">删除</a></td>
        </tr>
    </s:iterator>
</table>
 
<br/>
 
<form action="userAdd" method="post">
<table border="1" cellspacing="0">
<h1>添加用户</h1>
 <tr>
    <td>
      	  用户名:
    </td>
    <td>
        <input type="text" name="userinfo.uuser" value="">
    </td>
 </tr>

<tr>
    <td>
        密码：
    </td>
    <td>
        <input type="text" name="userinfo.upassword" value="">
    </td>
 </tr>
 
 <tr>
    <td>
       姓名：
    </td>
    <td>
        <input type="text" name="userinfo.uname" value="">
    </td>
 </tr>



 <tr>
    <td colspan="2" align="center"> 
        <input type="submit" value="增加">
    </td>
 </tr>
</table>
 
</form>
 
</body>
</html>