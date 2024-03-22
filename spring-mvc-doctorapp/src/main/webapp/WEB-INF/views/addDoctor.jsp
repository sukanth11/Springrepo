<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="addDoctor">
Doctor name<input type="text" name="doctorName"><br>
Doctor speciality
	<select name="speciality" >
            <option value="orthopedician">orthopedician</option>
            <option value="pediatrician">pediatrician</option>
            <option value="dentist">dentist</option>
            <option value="physician">physician</option>
            <option value="gynaecologist">gynaecologist</option>
            <option value="dermatologist">dermatologist</option>
        </select><br>
Doctor fees<input type="text" name="fees"><br>
Doctor rating
        <select name="rating" >
            <option value="1">1</option>
            <option value="2">2</option>
            <option value="3">3</option>
            <option value="4">4</option>
            <option value="5">5</option>
        </select><br>
Doctor experience<input type="text" name="experince"><br>
	
	<input type="submit" value="submit">
        
</form>
</body>
</html>