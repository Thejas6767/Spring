<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Welcome to X-Workz</title>
    <style>
        body { font-family: Arial, sans-serif; text-align: center; margin-top: 50px; }
        .container { border: 1px solid #ccc; padding: 20px; display: inline-block; border-radius: 10px; }
        .btn {
            display: inline-block; padding: 10px 20px; margin: 10px;
            background-color: #007bff; color: white; text-decoration: none; border-radius: 5px;
        }
        .btn-signup { background-color: #28a745; }
    </style>
</head>
<body>

    <div class="container">
        <h1>Welcome to our Portal</h1>
        <p>Please choose an option to continue:</p>

        <a href="signin.jsp" class="btn">Login (Sign In)</a>
        <a href="signup.jsp" class="btn btn-signup">Register (Sign Up)</a>
    </div>

</body>
</html>