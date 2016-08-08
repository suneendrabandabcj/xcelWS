<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>   

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<form:form action="processRegistraion" method="post" commandName="customerDetails">
			<table border="0">
				<tr>
					<td colspan="2" align="center"><h2>Customer -
							Registration</h2></td>
				</tr>
				<tr>
					<td>First Name:</td>
					<td><form:input path="firstName" required="required"/></td>
				</tr>
				<tr>
					<td>Last Name:</td>
					<td><form:input path="lastName" required="required"/></td>
				</tr>
				<tr>
					<td>User Name:</td>
					<td><form:input path="userName" required="required"/></td>
				</tr>
				<tr>
					<td>Password:</td>
					<td><form:password path="password" required="required"/></td>
				</tr>
				<tr>
					<td>E-mail:</td>
					<td><form:input path="email" required="required"/></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="submit"
						value="Register" /></td>
				</tr>
			</table>
		</form:form>
	</div>
</body>
</html>