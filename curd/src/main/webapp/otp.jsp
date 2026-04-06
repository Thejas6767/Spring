<%@ page isELIgnored="false" %>

<h2>Enter OTP</h2>

<form action="verifyOtp" method="post">

OTP:
<input type="text" name="otp" required/>

<input type="hidden" name="email" value="${email}"/>

<br><br>

<button type="submit">Verify OTP</button>

</form>

${msg}