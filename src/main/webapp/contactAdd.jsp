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
						aria-current="page" href="/home">Home</a></li>
					<li class="nav-item"><a class="nav-link" href="#">Logout</a>
					</li>
					
					
				</ul>
			</div>
		</div>
	</nav>
	<div class="container">

	<h2>Add Contacts Of User</h2>

		<form action="add-contacts" method="post">

			<div class="mb-3">
				<label for="exampleFormControlInput1" class="form-label">Name</label>
				<input type="text" class="form-control"
					id="exampleFormControlInput1" placeholder="Ex: Dinga" name="name">
			</div>
			<div class="mb-3">
				<label for="exampleFormControlInput2" class="form-label">Phone</label>
				<input type="number" class="form-control"
					id="exampleFormControlInput2" placeholder="EX: 745935748"
					name="phone">
			</div>
			<div class="mb-3">
				<label for="exampleFormControlInput3" class="form-label">Adhar
					Number</label> <input type="number" class="form-control"
					id="exampleFormControlInput3" placeholder="Ex: 7392792595"
					name="adharNo">
			</div>

			<button type="submit" class="btn btn-primary">Add</button>

		</form>

	</div>
	</div>
</body>
</html>