<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<div style="text-align: right">  
<a href="admin">admin</a><br>
</div><br>

<form action="search">

Enter Speciality<input type="text" name="choice">
<input type="submit" name="search"><br>
</form>

<h2> All Doctor</h2>
${doctors}
<h2 style="{color: red}">${messages}</h2>

</body>
</html>