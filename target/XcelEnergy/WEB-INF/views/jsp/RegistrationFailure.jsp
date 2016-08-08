<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>  

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ page isELIgnored="false" %>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<h2>Your Registration was failure please register again.</h2>
		<h2><a href="/XcelEnergy/">Click here for registration</a></h2>
		<h2>Error:</h2>
		<p>${error.printStackTrace()}</p>
	</div>
</body>
</html>