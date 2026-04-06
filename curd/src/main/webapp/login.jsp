<%@ page isELIgnored="false" %>
<style>
body{
    background: linear-gradient(to right, #00c6ff, #0072ff);
    font-family: Arial;
    text-align:center;
    margin-top:100px;
}

form{
    background:white;
    padding:30px;
    display:inline-block;
    border-radius:10px;
}

input{
    padding:10px;
    margin:10px;
    width:200px;
}
</style>
<h2>Login</h2>

<form action="login" method="post">

Email: <input type="email" name="email" required/><br><br>

Password: <input type="password" name="password" required/><br><br>

<button type="submit">Login</button>
<div style="margin-top:10px;">
    <a href="forgot">Forgot Password?</a>
</div>
</form>

<div style="color:red;">
${error}
</div>