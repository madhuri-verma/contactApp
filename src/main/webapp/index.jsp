<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Contact App</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">
</head>
<body>
	<div class="container">

		<h1>Register</h1>
		<h4>${msg}</h4>

		<form action="register" method="post">

			<div class="mb-3">
				<label for="exampleFormControlInput1" class="form-label">Email</label>
				<input type="email" class="form-control"
					id="exampleFormControlInput1" placeholder="Ex: name@example.com"
					name="email">
			</div>
			<div class="mb-3">
				<label for="exampleFormControlInput2" class="form-label">Name</label>
				<input type="text" class="form-control"
					id="exampleFormControlInput2" placeholder="EX: Dinga" name="name">
			</div>
			<div class="mb-3">
				<label for="exampleFormControlInput3" class="form-label">Phone</label>
				<input type="number" class="form-control"
					id="exampleFormControlInput3" placeholder="Ex: 7392792595"
					name="phone">
			</div>
			<div class="mb-3">
				<label for="exampleFormControlInput4" class="form-label">Password</label>
				<input type="password" class="form-control"
					id="exampleFormControlInput4" placeholder="Ex: 123@"
					name="password">
			</div>

			<button type="submit" class="btn btn-primary">Register</button>

			<a type="button" href="/login" class="btn btn-link">Login</a>
		</form>
	</div>
</body>
</html>