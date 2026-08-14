<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Novell Service Form</title>
</head>
<body>

    <h2>Novell Service Form</h2>

    <form action="#" method="post">
        <div>
            <label for="username">Username:</label><br>
            <input type="text" id="username" name="username" placeholder="Enter username" required>
        </div>
        <br>

        <div>
            <label for="password">Password:</label><br>
            <input type="password" id="password" name="password" placeholder="Enter password" required>
        </div>
        <br>

        <div>
            <label for="city">City of Employment:</label><br>
            <input type="text" id="city" name="city">
        </div>
        <br>

        <div>
            <label for="server">Web Server:</label><br>
            <select id="server" name="webServer">
                <option value="">--Select Server--</option>
                <option value="apache">Apache Tomcat</option>
                <option value="nginx">Nginx</option>
                <option value="iis">IIS</option>
            </select>
        </div>
        <br>

        <fieldset>
            <legend>Please specify your role:</legend>
            <input type="radio" id="admin" name="role" value="admin">
            <label for="admin">Admin</label><br>

            <input type="radio" id="engineer" name="role" value="engineer">
            <label for="engineer">Engineer</label><br>

            <input type="radio" id="manager" name="role" value="manager">
            <label for="manager">Manager</label><br>

            <input type="radio" id="guest" name="role" value="guest">
            <label for="guest">Guest</label>
        </fieldset>
        <br>

        <fieldset>
            <legend>Single Sign-on to the following:</legend>
            <input type="checkbox" id="mail" name="sso" value="mail">
            <label for="mail">Mail</label><br>

            <input type="checkbox" id="payroll" name="sso" value="payroll">
            <label for="payroll">Payroll</label><br>

            <input type="checkbox" id="selfService" name="sso" value="selfService">
            <label for="selfService">Self Service</label>
        </fieldset>
        <br>

        <div>
            <button type="submit">Login</button>
            <button type="reset">Reset</button>
        </div>
    </form>

</body>
</html>