<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <title>Home</title>

    <style>
        body {
            margin: 0;
            font-family: 'Poppins', sans-serif;
            background: linear-gradient(135deg, #0f2027, #203a43, #2c5364);
            color: white;
        }

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

        .nav-buttons button {
            margin-left: 10px;
            padding: 8px 15px;
            border-radius: 20px;
            border: none;
            cursor: pointer;
            font-weight: bold;
        }

        .btn {
            background: #00c6ff;
        }

        .btn:hover {
            background: #0072ff;
            color: white;
        }

        .logout-btn {
            background: red;
            color: white;
        }

        .container {
            text-align: center;
            margin-top: 100px;
        }

        .card {
            background: rgba(255,255,255,0.1);
            padding: 30px;
            border-radius: 20px;
            display: inline-block;
            backdrop-filter: blur(10px);
        }
    </style>
</head>

<body>

<!-- 🔷 NAVBAR -->
<div class="navbar">

    <div class="logo">MyApp</div>

    <div class="nav-buttons">

        <!-- 🔓 NOT LOGGED IN -->
        <c:if test="${sessionScope.user == null}">
            <a href="login"><button class="btn">Login</button></a>
            <a href="signup"><button class="btn">Signup</button></a>
        </c:if>

        <!-- 🔐 LOGGED IN -->
        <c:if test="${sessionScope.user != null}">

            <span>Welcome ${sessionScope.user.name}</span>

            <a href="editProfile">
                <button class="btn">Update Profile</button>
            </a>

            <a href="profile">
                <button class="btn">Change Password</button>
            </a>

         <a href="${pageContext.request.contextPath}/logout">
             <button class="logout-btn">Logout</button>
         </a>
         <c:if test="${sessionScope.user.role == 'ADMIN'}">
             <a href="users">
                 <button class="btn">View All Users</button>
             </a>
         </c:if>

        </c:if>

    </div>

</div>

<!-- 🔷 CONTENT -->
<div class="container">

    <div class="card">

        <h2>Welcome to Dashboard</h2>

        <c:if test="${sessionScope.user != null}">
            <p>Hello ${sessionScope.user.name}, you are logged in.</p>
        </c:if>

        <c:if test="${sessionScope.user == null}">
            <p>Please login to continue</p>
        </c:if>

    </div>

</div>

</body>
</html>