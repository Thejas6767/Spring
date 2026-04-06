<%@ page isELIgnored="false" %>
<html>
<body>
    <h2>Update Trainee</h2>
    <form action="update" method="post">
        ID: <input type="text" name="id" value="${trainee.id}" readonly style="background-color: #eee;"/><br><br>

        Name: <input type="text" name="name" value="${trainee.name}"/><br><br>
        Gender: <input type="text" name="gender" value="${trainee.gender}"/><br><br>
        Age: <input type="number" name="age" value="${trainee.age}"/><br><br>
        College: <input type="text" name="clgName" value="${trainee.clgName}"/><br><br>

        Email: <input type="text" name="email" value="${trainee.email}" readonly style="background-color: #eee;"/><br><br>

        Phone: <input type="text" name="ph" value="${trainee.ph}"/><br><br>

        <button type="submit">Update Record</button>
    </form>
    <br>
    <a href="readAllData">Cancel and Go Back</a>
</body>
</html>