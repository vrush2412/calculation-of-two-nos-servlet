<%@page import="Llinkcode.model.model"%>


<%@page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1> Arithmatic Calculation ...........Result Page....</h1>
	<%model calci = null;%>
	<%
	Object o = session.getAttribute("ans");
	calci= (model)o; %>

	<table border="3px" >
		<tr>
			<td>Number1</td>
			<td><%=calci.getNo1() %></td>
		</tr>
		<tr>
			<td>Number2</td>
			<td><%=calci.getNo2() %></td>
		</tr>
		<tr>
			<td>Result</td>
			<td> <%= calci.getAdd() %></td>
		</tr>
	</table>
	<h1>thank you</h1>
</body>
</html>