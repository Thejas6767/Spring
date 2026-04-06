<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
    <title>My Profile</title>

    <style>
        body {
            margin: 0;
            font-family: 'Poppins', sans-serif;
            background: linear-gradient(135deg, #0f2027, #203a43, #2c5364);
            color: white;
        }

        /* 🔷 NAVBAR */
        .navbar {
            display: flex;
            justify-content: space-between;
            align-items: center;
            padding: 15px 40px;
            background: rgba(0,0,0,0.4);
        }

        .logo {
            font-size: 22px;
            font-weight: bold;
        }

        .nav-links a {
            color: white;
            margin-left: 20px;
            text-decoration: none;
            font-weight: 500;
        }

        .nav-links a:hover {
            color: #00c6ff;
        }

        /* 🔷 CONTAINER */
        .container {
            display: flex;
            justify-content: center;
            align-items: center;
            margin-top: 40px;
            gap: 40px;
            flex-wrap: wrap;
        }

        /* 🔷 CARD */
        .card {
            background: rgba(255,255,255,0.1);
            padding: 30px;
            border-radius: 20px;
            width: 350px;
            box-shadow: 0 10px 25px rgba(0,0,0,0.4);
            backdrop-filter: blur(10px);
        }

        h2 {
            text-align: center;
            margin-bottom: 20px;
        }

        p {
            margin: 10px 0;
        }

        /* 🔷 BUTTON */
        .btn {
            display: block;
            width: 100%;
            padding: 10px;
            margin-top: 15px;
            border: none;
            border-radius: 10px;
            background: #00c6ff;
            color: black;
            font-weight: bold;
            cursor: pointer;
        }

        .btn:hover {
            background: #0072ff;
            color: white;
        }

        /* 🔷 INPUT */
        input {
            width: 100%;
            padding: 10px;
            margin-top: 8px;
            border-radius: 10px;
            border: none;
            outline: none;
        }

        label {
            font-size: 14px;
        }

    </style>
</head>

<body>

<!-- 🔷 NAVBAR -->
<div class="navbar">
    <div class="logo">MyApp</div>
    <div class="nav-links">
        <a href="userDashboard">Dashboard</a>
        <a href="logout">Logout</a>
    </div>
</div>

<!-- 🔷 MAIN CONTAINER -->
<div class="container">

    <!-- 👤 PROFILE CARD -->
    <div class="card">
        <h2>My Profile</h2>

        <p><b>Name:</b> ${user.name}</p>
        <p><b>Email:</b> ${user.email}</p>
        <p><b>Gender:</b> ${user.gender}</p>
        <p><b>Age:</b> ${user.age}</p>
        <p><b>Address:</b> ${user.address}</p>

        <a href="editProfile">
            <button class="btn">Edit Profile</button>
        </a>
    </div>

    <!-- 🔐 CHANGE PASSWORD CARD -->
    <div class="card">
        <h2>Change Password</h2>

        <form action="changePassword" method="post">

            <!-- hidden email -->
            <input type="hidden" name="email" value="${user.email}" />

            <label>Old Password</label>
            <input type="password" name="oldPassword" required />

            <label>New Password</label>
            <input type="password" name="newPassword"
                   pattern="^(?=.*\d.*\d)(?=.*[@$!%*?&]).{8,}$"
                   title="Minimum 8 characters, 2 numbers, 1 special character"
                   required />

            <label>Confirm Password</label>
            <input type="password" name="confirmPassword" required />

            <button type="submit" class="btn">Update Password</button>
        </form>

        <!-- messages -->
        <p style="color: lightgreen;">${success}</p>
        <p style="color: red;">${error}</p>

    </div>

</div>

</body>
</html>