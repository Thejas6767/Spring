<%@ page isELIgnored="false" %>
<html>
<body>

<h2>Login</h2>

<form action="signin" method="post">

Username:
<input type="text" name="username"/>
<span style="color:red">${userError}</span>
<br><br>

Password:
<input type="password" name="password"/>
<br><br>

<button type="submit">Login</button>

</form>

<h3 style="color:red">${error}</h3>

</body>
</html>
