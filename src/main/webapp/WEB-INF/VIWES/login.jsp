<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Login Page</title>
</head>
<body>

    <h2>Login</h2>

    <!-- Error Message Display -->
    <h3 style="color:red;">${error}</h3>
    <h3 style="color:green;">${msg}</h3>

    <form action="login" method="post">
        <div>
            <label>Username:</label>
            <input type="text" name="username" required />
        </div>
        <br/>
        <div>
            <label>Password:</label>
            <input type="password" name="password" required />
        </div>
        <br/>
        <button type="submit">Login</button>
    </form>

    <br/>
    <a href="signup">Don't have an account? Signup here</a>

</body>
</html>