<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
    <table border="1">
        <tr>
            <th>Name</th><th>Gender</th><th>Age</th><th>College</th><th>Phone</th>
        </tr>
        <c:forEach items="${dtos}" var="d">
            <tr>
                <td>${d.name}</td>
                <td>${d.gender}</td>
                <td>${d.age}</td>
                <td>${d.clgName}</td>
                <td>${d.ph}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html> 