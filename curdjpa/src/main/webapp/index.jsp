<html>
<body>
    <h2>Curd Registration</h2>
   <form action="save" method="post">
       Name: <input type="text" name="name"/><br><br>
       Gender: <input type="text" name="gender"/><br><br>
       Age: <input type="number" name="age"/><br><br>
       College: <input type="text" name="clgName"/><br><br>
       Phone: <input type="text" name="ph" pattern="\d{10}" title="Please enter 10 digits" required/><br><br>
       <button type="submit">Submit</button>
   </form>
    <br>
    <a href="viewAll">View All Records</a>
</body>
</html>