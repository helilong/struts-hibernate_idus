<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>修改页面</title>
</head>
<body>
<form action="userUpdate" method="post">
<table align="center" border="1" cellspacing="0">
 <tr>
    <td>
      	  用户名:
    </td>
    <td>
        <input type="text" name="userinfo.uuser" value="${userinfo.uuser }">
    </td>
 </tr>

<tr>
    <td>
        密码：
    </td>
    <td>
        <input type="text" name="userinfo.upassword" value="${userinfo.upassword }">
    </td>
 </tr>
 
 <tr>
    <td>
       姓名：
    </td>
    <td>
        <input type="text" name="userinfo.uname" value="${userinfo.uname }">
    </td>
 </tr>



 <tr>
    <td colspan="2" align="center"> 
       <input type="hidden" name="userinfo.uid" value="${userinfo.uid}"> 
        <input type="submit" value="修改">
    </td>
 </tr>
</table>
 
</form>
</body>
</html>