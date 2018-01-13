<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 2018/1/10
  Time: 20:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form method="post" action="/user/upload" enctype="multipart/form-data">
        <input type="text" name="id">
        <input type="file" name="file">
        <input type="submit" value="提交">
    </form>
</body>
</html>
