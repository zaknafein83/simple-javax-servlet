<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<% if (request.getParameter("testo") != null) {%>

<h1><%=request.getParameter("testo") %></h1>

<% }%>

<form action="primaServlet" method="post">
<input type="text" name="testo">
<input type="submit" value="Clicca qui!">

</form>
</body>
</html>