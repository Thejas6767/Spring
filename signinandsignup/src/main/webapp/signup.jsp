<%@ page isELIgnored="false" %>
<html>
<body>

<h2>Signup</h2>

<form action="signup" method="post">

Name:
<input type="text" name="name" value="${dto.name}"/>
<span style="color:red">${nameError}</span>
<br><br>

Username:
<input type="text" name="username" value="${dto.username}"/>
<span style="color:red">${usernameError}</span>
<br><br>

Password:
<input type="password" name="password"/>
<span style="color:red">${passwordError}</span>
<br><br>

Confirm Password:
<input type="password" name="confirmPassword"/>
<span style="color:red">${confirmError}</span>
<br><br>

<button type="submit">Signup</button>

</form>

</body>
</html>
