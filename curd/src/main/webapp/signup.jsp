<%@ page isELIgnored="false" %>

<html>
<head>

<title>Signup</title>

<style>

body{
    margin:0;
    font-family: Arial;
    background: linear-gradient(to right, #667eea, #764ba2);
}

/* Container */
.container{
    width:350px;
    margin:80px auto;
    background:white;
    padding:30px;
    border-radius:10px;
    text-align:center;
}

/* Inputs */
input{
    width:90%;
    padding:10px;
    margin:10px;
    border-radius:5px;
    border:1px solid #ccc;
}

/* Button */
button{
    padding:10px 20px;
    background:#667eea;
    border:none;
    color:white;
    border-radius:5px;
    cursor:pointer;
}

button:hover{
    background:#5a67d8;
}




<style>

.gender-small{
    display:flex;        /* ✅ THIS MAKES THEM SIDE-BY-SIDE */
    align-items:center;
    gap:10px;            /* space between buttons */
    margin:10px 0;
}

/* hide radio circle */
.gender-small input{
    display:none;
}

/* button style */
.gender-small label{
    padding:5px 12px;
    border:1px solid #667eea;
    border-radius:15px;
    cursor:pointer;
    font-size:13px;
}

/* selected button */
.gender-small input:checked + label{
    background:#667eea;
    color:white;
}


</style>

</style>

</head>

<body>

<div class="container">

<h2>Signup</h2>

<form action="signup" method="post" onsubmit="return validate()">

<input type="text" name="name" placeholder="Name" required/>

<input type="email" name="email" placeholder="Email" required/>
<p id="selectedGender" style="font-weight:bold; color:#333;">
    Selected Gender: None
</p><div class="gender-small">

    <input type="radio" id="male" name="gender" value="Male" required>
    <label for="male">Male</label>

    <input type="radio" id="female" name="gender" value="Female">
    <label for="female">Female</label>

</div>

<input type="number" name="age" placeholder="Age" required/>

<input type="text" name="address" placeholder="Address" required/>

<input type="password" id="password" name="password"
       placeholder="Password"
       required
       pattern="^(?=(.*\d){2,})(?=.*[!@#$%^&*]).{8,}$"
       title="Password must be at least 8 characters, contain 2 numbers and 1 special character"/>
<small style="color:gray;">
Password must contain:
Minimum 8 characters,
At least 2 numbers,
1 special character.
</small>

<input type="password" id="confirm" placeholder="Confirm Password" required/>

<button type="submit">Signup</button>

</form>

<br>

<a href="login">Already have an account? Login</a>

<div style="color:red;">
${msg}
</div>

</div>

</body>

<script>
function validate(){

let pass = document.getElementById("password").value;
let confirm = document.getElementById("confirm").value;

/* Password match check */
if(pass !== confirm){
    alert("Passwords do not match");
    return false;
}

/* Extra safety check */
let regex = /^(?=(.*\d){2,})(?=.*[!@#$%^&*]).{8,}$/;

if(!regex.test(pass)){
    alert("Password must have 8 chars, 2 numbers & 1 special character");
    return false;
}

return true;
}

const radios = document.querySelectorAll('input[name="gender"]');
const display = document.getElementById("selectedGender");

radios.forEach(radio => {
    radio.addEventListener("change", function() {
        display.innerText = "Selected Gender: " + this.value;
    });
});

</script>

</html>