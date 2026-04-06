<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <title>View Users</title>

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
            padding: 15px 40px;
            background: rgba(0,0,0,0.4);
        }

        .logo {
            font-size: 22px;
            font-weight: bold;
        }

        .navbar a {
            color: white;
            text-decoration: none;
            margin-left: 15px;
        }

        /* 🔷 CONTAINER */
        .container {
            padding: 30px;
        }

        /* 🔍 SEARCH */
        .search-box {
            text-align: center;
            margin-bottom: 20px;
        }

        input[type="text"] {
            padding: 10px;
            width: 250px;
            border-radius: 10px;
            border: none;
            outline: none;
        }

        button {
            padding: 8px 14px;
            border-radius: 10px;
            border: none;
            cursor: pointer;
            margin: 2px;
            font-weight: bold;
        }

        .btn {
            background: #00c6ff;
            color: black;
        }

        .btn:hover {
            background: #0072ff;
            color: white;
        }

        .delete-btn {
            background: red;
            color: white;
        }

        .delete-btn:hover {
            background: darkred;
        }

        /* 📊 TABLE */
        table {
            width: 100%;
            border-collapse: collapse;
            background: rgba(255,255,255,0.1);
            border-radius: 10px;
            overflow: hidden;
        }

        th, td {
            padding: 12px;
            text-align: center;
        }

        th {
            background: rgba(0,0,0,0.5);
        }

        tr:nth-child(even) {
            background: rgba(255,255,255,0.05);
        }

        /* 🔄 PAGINATION */
        .pagination {
            text-align: center;
            margin-top: 20px;
        }

        .pagination a {
            margin: 0 10px;
            text-decoration: none;
            color: white;
            font-weight: bold;
        }

    </style>
</head>

<body>

<!-- 🔷 NAVBAR -->
<div class="navbar">
    <div class="logo">MyApp</div>

    <div>
        <a href="${pageContext.request.contextPath}/">Home</a>
        <a href="${pageContext.request.contextPath}/logout">Logout</a>
    </div>
</div>

<div class="container">

    <h2 style="text-align:center;">All Users</h2>

    <!-- 🔍 SEARCH -->
    <div class="search-box">
        <form action="${pageContext.request.contextPath}/search" method="get">
            <input type="text" name="keyword" placeholder="Search by name/email" required/>
            <button type="submit" class="btn">Search</button>
        </form>
    </div>

    <!-- 📊 TABLE -->
    <table border="1">

        <tr>
            <th>Name</th>
            <th>Email</th>
            <th>Gender</th>
            <th>Age</th>
            <th>Address</th>

            <c:if test="${sessionScope.user.role == 'ADMIN'}">
                <th>Action</th>
            </c:if>
        </tr>

        <c:forEach items="${users}" var="u">
            <tr>
                <td>${u.name}</td>
                <td>${u.email}</td>
                <td>${u.gender}</td>
                <td>${u.age}</td>
                <td>${u.address}</td>

                <c:if test="${sessionScope.user.role == 'ADMIN'}">
                    <td>

                        <!-- ✏️ EDIT -->
                        <a href="${pageContext.request.contextPath}/editUser?id=${u.id}">
                            <button class="btn">Edit</button>
                        </a>

                        <!-- ❌ DELETE WITH CONFIRM -->
                        <a href="${pageContext.request.contextPath}/deleteUser?id=${u.id}"
                           onclick="return confirm('Are you sure you want to delete this user?')">
                            <button class="delete-btn">Delete</button>
                        </a>

                    </td>
                </c:if>

            </tr>
        </c:forEach>

    </table>

    <!-- 🔄 PAGINATION -->
    <div class="pagination">
        <a href="${pageContext.request.contextPath}/users?page=${currentPage - 1}">Previous</a>
        <a href="${pageContext.request.contextPath}/users?page=${currentPage + 1}">Next</a>
    </div>

</div>

</body>
</html>