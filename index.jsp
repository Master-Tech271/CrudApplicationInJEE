<%@page pageEncoding="UTF-8" contentType="text/html"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
	<title>
		crud application
	</title>
</head>
<body>
	<h1>Crud Application</h1>
	<hr>
	<br>
	<%-- add --%>
	<button><a href="add.jsp">Add Members</a></button>
	<%--  delete --%>
	<button><a href="delete.jsp">Delete Members</a></button>
	<%--  update --%>
	<button> <a href="update.jsp">Update Members</a></button>

	<%-- display members --%>
	<h3>All the Members List</h3> <hr> <br>
	<table border="5">
		<tr>
			<th>Id</th>
			<th>Username</th>
			<th>Account Type</th>
		</tr>
	<c:forEach var="item" items="${members}">
		<tr>
			<td>${item.id}</td>
			<td>${item.username}</td>
			<td>${item.type}</td>
		</tr>
</c:forEach>
</table>
</body>
</html>