<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- Spring Form Taglib Directive Added -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
    <title>Login Page</title>
</head>
<body>

    <h2>Login</h2>

    <!-- Error/Success Messages -->
    <h3 style="color:red;">${error}</h3>
    <h3 style="color:green;">${msg}</h3>

    <form:form action="${pageContext.request.contextPath}/login" method="post" modelAttribute="user">
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
    </form:form>

    <br/>
    <!-- Fixed Signup Context Path -->
    <a href="${pageContext.request.contextPath}/signup">Don't have an account? Signup here</a>

</body>
</html>