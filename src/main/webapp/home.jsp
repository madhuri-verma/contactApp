<%@page import="org.hibernate.internal.build.AllowSysOut"%>
<%@page import="com.example.demo.entity.Contact"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">
</head>
<body>
	<h1>Welcome to Home Page</h1>
	<nav class="navbar navbar-expand-lg bg-body-tertiary">
		<div class="container-fluid">
			<a class="navbar-brand" href="#">Navbar</a>
			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarNav"
				aria-controls="navbarNav" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarNav">
				<ul class="navbar-nav">
					<li class="nav-item"><a class="nav-link active"
						aria-current="page" href="#">Home</a></li>
					<li class="nav-item"><a class="nav-link" href="#">Features</a>
					</li>
					<li class="nav-item"><a class="nav-link" href="#">Pricing</a>
					</li>
					<li class="nav-item"><a class="nav-link disabled"
						aria-disabled="true">Disabled</a></li>
				</ul>
			</div>
		</div>
	</nav>

	<%
	List<Contact> contacts = (List<Contact>) request.getAttribute("contacts");

	if (contacts != null) {
	%>

	<table class="table">
		<thead>
			<tr>
				<th scope="col">Cid</th>
				<th scope="col">Name</th>
				<th scope="col">Phone</th>
				<th scope="col">Adhar No</th>
				<th scope="col">Update</th>
				<th scope="col">Delete</th>
			</tr>
		</thead>
		<tbody>

			<%
			for (Contact contact : contacts) {
			%>
			<tr>
				<th scope="row"><%=contact.getCid()%></th>
				<td><%=contact.getName()%></td>
				<td><%=contact.getPhone()%></td>
				<td><%=contact.getAdharNo()%></td>
				<td>
					<button type="button" class="btn btn-success">Update</button>
				</td>
				<td>
					<button type="button" class="btn btn-danger">Delete</button>
				</td>
			</tr>
			<%
			}
			%>
		</tbody>
	</table>
	<%
	} else {
	%>

	<h4>${msg}</h4>

	<%
	}
	%>
</body>
</html>