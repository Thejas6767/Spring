<style>
    .navbar {
        display: flex;
        justify-content: space-between;
        align-items: center;
        background-color: #2c3e50;
        padding: 10px 30px;
        color: white;
        font-family: sans-serif;
    }
    .logo { font-size: 24px; font-weight: bold; color: #ecf0f1; text-decoration: none; }
    .nav-right a {
        color: white;
        text-decoration: none;
        margin-left: 20px;
        padding: 8px 15px;
        border-radius: 5px;
        transition: 0.3s;
    }
    .signup-btn { background-color: #3498db; }
    .signup-btn:hover { background-color: #2980b9; }
</style>

<div class="navbar">
    <a href="index.jsp" class="logo">MY_APP</a>
    <div class="nav-right">
        <a href="login">SignIn</a>
        <a href="signup" class="signup-btn">SignUp</a>
    </div>
</div>