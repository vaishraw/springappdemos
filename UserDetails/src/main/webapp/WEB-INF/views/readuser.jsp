<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>User Details</h2>

	<form action="readuser" method="post">
		<pre>
		
		Id: <input type="text" name="id" />
		
		<input type="submit" name="Show" />
		</pre>
	</form>
	<p>

		<%=request.getAttribute("result")%></p>

</body>
</html>