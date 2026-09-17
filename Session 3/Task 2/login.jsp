<%@ page import="jakarta.servlet.http.Cookie" %>

<%
    String username = "";

    Cookie[] cookies = request.getCookies();

    if (cookies != null) {

        for (Cookie c : cookies) {

            if (c.getName().equals("username")) {
                username = c.getValue();
            }
        }
    }
%>

<html>
<head>
    <title>Login</title>
</head>
<body>

<h2>Login</h2>

<form action="login" method="post">

    Username:
    <input type="text" name="username" value="<%= username %>">

    <br><br>

    <input type="checkbox" name="remember">
    Remember Me

    <br><br>

    <input type="submit" value="Login">

</form>

</body>
</html>