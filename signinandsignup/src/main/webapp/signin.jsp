<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Sign In</title>
    <style>
        body { font-family: sans-serif; display: flex; justify-content: center; padding-top: 50px; }
        .login-card { border: 1px solid #ddd; padding: 20px; border-radius: 8px; width: 300px; }
        input { width: 100%; margin: 10px 0; padding: 8px; box-sizing: border-box; }
        button { width: 100%; padding: 10px; background: #007bff; color: white; border: none; cursor: pointer; }
    </style>
</head>
<body>

    <div class="login-card">
        <h2>Login</h2>
        <form action="signin" method="post">
            <label>Username</label>
            <input type="text" name="username" required>

            <label>Password</label>
            <input type="password" name="password" required>

            <button type="submit">Sign In</button>
        </form>

        <p style="color:red;">${error}</p> <p><a href="signup.jsp">Create an account</a></p>
    </div>

</body>
</html>