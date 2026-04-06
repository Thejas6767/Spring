<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Sign Up</title>
    <style>
        .container { width: 350px; margin: 30px auto; padding: 20px; border: 1px solid #ccc; border-radius: 10px; }
        input, select, textarea { width: 100%; margin-bottom: 10px; padding: 8px; box-sizing: border-box; }
        .error { color: red; font-size: 13px; margin-bottom: 10px; display: none; }
    </style>
</head>
<body>
    <%@ include file="navbar.jsp" %>
    <div class="container">
        <h2>Register</h2>
        <form action="registerUser" method="post" onsubmit="return validate()">
            <input type="text" name="name" id="name" placeholder="Name" required>
            <input type="email" name="email" id="email" placeholder="Email" required>
            <select name="gender" required>
                <option value="">Select Gender</option>
                <option value="Male">Male</option>
                <option value="Female">Female</option>
            </select>
            <input type="number" name="age" id="age" placeholder="Age" required>
            <textarea name="address" placeholder="Address" required></textarea>
            <input type="password" name="password" id="pass" placeholder="Password" required>
            <input type="password" id="confirmPass" placeholder="Confirm Password" required>

            <div id="msg" class="error"></div>
            <button type="submit" style="width:100%; background:#27ae60; color:white; border:none; padding:10px;">Sign Up</button>
        </form>
    </div>

    <script>
        function validate() {
            const pass = document.getElementById("pass").value;
            const cpass = document.getElementById("confirmPass").value;
            const age = document.getElementById("age").value;
            const msg = document.getElementById("msg");

            if (pass !== cpass) {
                msg.style.display = "block";
                msg.innerHTML = "Passwords do not match!";
                return false;
            }
            if (age < 1 || age > 120) {
                msg.style.display = "block";
                msg.innerHTML = "Please enter a valid age.";
                return false;
            }
            return true;
        }
    </script>
</body>
</html>