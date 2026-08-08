<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Form</title>
</head>
<body>

	<h2>Login Form</h2>
	<form>
		<div>
			<label for="username">Username:</label><br> <input type="text"
				id="username" name="username" placeholder="Enter username">
		</div>
		<br>
		<div>
			<label for="password">Password:</label><br> <input
				type="password" id="password" name="password"
				placeholder="Enter password">
		</div>
		<br>
		<div>
			<label for="city">City of Employment:</label><br> <input
				type="text" id="city" name="city">
		</div>
		<br>
		<div>
			<label for="server">Web Server:</label><br> <select id="server"
				name="webServer">
				<option value="">--Select Server--</option>
				<option value="apache">Apache Tomcat</option>
				<option value="nginx">Nginx</option>
				<option value="iis">IIS</option>
			</select>
		</div>
		<br>
		<div>
			<label>Please Specify your role:</label><br>
			<!-- name="role" same rakhne se ek baar me ek hi select hoga -->
			<input type="radio" id="admin" name="role" value="admin"> <label
				for="admin">Admin</label><br> <input type="radio" id="engineer"
				name="role" value="engineer"> <label for="engineer">Engineer</label><br>

			<input type="radio" id="manager" name="role" value="manager">
			<label for="manager">Manager</label><br> <input type="radio"
				id="guest" name="role" value="guest"> <label for="guest">Guest</label>
		</div>
		<br>
		<div>
			<label>Single Sign-On to the following:</label><br> <input
				type="checkbox" id="mail" name="sso" value="mail"> <label
				for="mail">Mail</label><br> <input type="checkbox" id="payroll"
				name="sso" value="payroll"> <label for="payroll">Payroll</label><br>

			<input type="checkbox" id="selfService" name="sso"
				value="selfService"> <label for="selfService">Self
				Service</label>
		</div>
		<br>
		<div>
			<button type="submit">Login</button>
			<button type="reset">Reset</button>
		</div>
	</form>
</body>
</html>