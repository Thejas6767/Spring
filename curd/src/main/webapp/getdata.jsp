<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    Name: <input type="text" name="name"/><br><br>
       Gender: <input type="text" name="gender"/><br><br>
       Age: <input type="number" name="age"/><br><br>
       College: <input type="text" name="clgName"/><br><br>
       Email: <input type="text" name="email"/><br><br>
       Phone: <input type="text" name="ph" pattern="\d{10}" title="Please enter 10 digits" required/><br><br>
       <button type="submit">Submit</button>

        <div style ="colour:green;">${success}</div>

           <div style ="colour:red;">${errmsg}</div>

   </form>
</body>
</html>