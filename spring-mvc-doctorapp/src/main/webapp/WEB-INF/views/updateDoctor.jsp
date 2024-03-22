<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="updateDoctor">
Doctor Name<input type="text" name="doctorName" value="${doctor.doctorName}" disabled><br>
Doctor Id<input type="text" name="doctorId" value="${doctor.doctorId}" readonly><br>
Doctor speciality<input type="text" name="speciality" value="${doctor.speciality}" disabled><br>
Doctor Fees<input type="text" name="fees" value="${doctor.fees}"><br>
Doctor rating<input type="text" name="rating" value="${doctor.rating}" disabled><br>
Doctor experince<input type="text" name="experince" value="${doctor.experince}" disabled><br>
<input type="submit" value="submit">

</form>
</body>
</html>