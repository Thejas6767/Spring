<%@ page isELIgnored="false" %>

<h2>Forgot Password</h2>

<form action="sendOtp" method="post">

Email:
<input type="email" name="email" required/>

<br><br>

<button type="submit">Send OTP</button>

</form>

<div style="color:red;">${msg}</div>