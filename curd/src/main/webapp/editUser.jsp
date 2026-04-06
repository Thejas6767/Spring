<%@ page isELIgnored="false" %>

<!DOCTYPE html>
<html>
<head>
    <title>Edit User</title>

    <style>
        body {
            font-family: 'Poppins';
            background: linear-gradient(135deg, #0f2027, #203a43, #2c5364);
            color: white;
            text-align: center;
        }

        .card {
            background: rgba(255,255,255,0.1);
            padding: 30px;
            border-radius: 20px;
            width: 350px;
            margin: auto;
            margin-top: 50px;
        }

        input {
            width: 90%;
            padding: 10px;
            margin: 8px;
            border-radius: 10px;
            border: none;
        }

        button {
            padding: 10px;
            border-radius: 10px;
            border: none;
            background: #00c6ff;
            font-weight: bold;
            cursor: pointer;
        }
    </style>
</head>

<body>

<div class="card">

<h2>Edit User</h2>

<form action="updateUser" method="post">

    <input type="hidden" name="id" value="${editUser.id}"/>

    Name:
    <input type="text" name="name" value="${editUser.name}" required/><br>

    Email:
    <input type="text" name="email" value="${editUser.email}" readonly/><br>

    Gender:
    <input type="text" name="gender" value="${editUser.gender}"/><br>

    Age:
    <input type="number" name="age" value="${editUser.age}"/><br>

    Address:
    <input type="text" name="address" value="${editUser.address}"/><br>

    <button type="submit">Update</button>

</form>

</div>

</body>
</html>