<html>
<head>
    <title>Welcome</title>
</head>
<body>

<%
    if (session.getAttribute("username") != null) {
%>

        <h2>Welcome, <%= session.getAttribute("username") %>!</h2>

<%
    } else {
%>

        <h2>Please login first.</h2>

<%
    }
%>

</body>
</html>