<%@ page isELIgnored="false" %>


<form action="resetPassword" method="post">

    <!-- 🔴 MUST HAVE THIS -->
    <input type="hidden" name="email" value="${email}"/>

    New Password:
    <input type="password" name="password" required/>

    <br><br>

    <button type="submit">Update Password</button>

</form>