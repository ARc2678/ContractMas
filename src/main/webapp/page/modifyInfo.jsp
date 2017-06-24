<%--
  Created by IntelliJ IDEA.
  User: AR c
  Date: 2017/6/23
  Time: 8:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" import="java.util.*" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <base href="<%=basePath%>">
    <title>My JSP 'index.jsp' starting page</title>
    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">
    <meta http-equiv="keywords" content="modify personal information">
    <meta http-equiv="Description" content="capable of submitting modified info">
</head>
<body>
    <form action="modifyinfo.action" method="post">

        姓：<input type="text" name="user.surname"/><br><br>
        名：<input type="text" name="user.first_name"/><br><br>
        性别：<input type="text" name="user.gender"/><br><br>
        国籍：<input type="text" name="user.nationality"/><br><br>
        政治身份：<input type="text" name="user.political_status"/><br><br>
        生日：<input type="text" name="user.birthday"/><br><br>
        身份证号：<input type="text" name="user.china_id_num"/><br><br>
        教育水平：<input type="text" name="user.edu_stats"/><br><br>
        毕业院校：<input type="text" name="user.graduated_from"/><br><br>
        户籍地址：<input type="text" name="user.hj_location"/><br><br>
        户口种类：<input type="text" name="user.hk_type"/><br><br>
        户口地址：<input type="text" name="user.hk_address"/><br><br>
        户口邮编：<input type="text" name="user.hk_postcode"/><br><br>
        现住址：<input type="text" name="user.now_address"/><br><br>
        现住址邮编：<input type="text" name="user.now_postcode"/><br><br>
        移动电话号码：<input type="text" name="user.mobile_num"/><br><br>
        座机号码：<input type="text" name="user.tele_num"/><br><br>
        <input type = "submit" value = "提交"；
     </form>
</body>
</html>
