<h2>Edit Profile</h2>

<form action="updateProfile" method="post">

    Name:
    <input type="text" name="name" value="${user.name}" required/><br><br>

    Gender:
    <input type="text" name="gender" value="${user.gender}" /><br><br>

    Age:
    <input type="number" name="age" value="${user.age}" /><br><br>

    Address:
    <input type="text" name="address" value="${user.address}" /><br><br>

    <!-- 🔴 IMPORTANT -->
    <input type="hidden" name="email" value="${user.email}"/>

    <button type="submit">Update</button>

</form>