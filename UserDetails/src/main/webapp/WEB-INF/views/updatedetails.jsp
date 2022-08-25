<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Update User</h2>
<form action="updateuser" method="post">
		<pre>
		
		Id: <input type="text" name="id" />
		Name: <input type="text" name="name" />
		Email: <input type="text" name="email" />
		<input type="submit" name="update" />
		</pre>
	</form>
	<p>

		<%=request.getAttribute("result")%></p>

</body>
</html>