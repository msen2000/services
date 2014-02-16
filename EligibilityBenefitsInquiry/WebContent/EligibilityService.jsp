<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Senthil ! Eligibility and Benefits </title>
</head>
<body>
<!-- <form action="mailto:SMadhaiyan@delta.org?subject=mailing list" method=post enctype="text/plain"> -->
<form action="EABServlet" method=post enctype="text/plain"> 
Last name: <input type="text" name="Last Name" size=40 value=""> 
<br> 
E-mail Address: <input type="text" name="E-mail Address" size=12 value=""> 
<br> 
<input type="submit" value="Send Request" onClick="alert('Thank you. Your name has been added to our mailing list.')"> 
<input type="reset" value="Reset"> 
</form>
</body>
</html>