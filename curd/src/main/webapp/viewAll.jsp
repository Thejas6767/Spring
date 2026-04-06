<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
    <table border="1">
        <tr>
            <th>Name</th><th>Gender</th><th>Age</th><th>College</th><th>Email</th><th>Phone</th>
            <th>Actions</th><th>Delete</th> </tr>
        <c:forEach items="${dtos}" var="d">
            <tr>
                <td>${d.name}</td>
                <td>${d.gender}</td>
                <td>${d.age}</td>
                <td>${d.clgName}</td>
                <td>${d.email}</td>
                <td>${d.ph}</td>
                <td>
                    <a href="edit?email=${d.email}">Edit</a>
                </td><td>
<a href="delete?id=${d.id}">Delete</a>
            </tr>
        </c:forEach>
    </table>
</body>
</html>