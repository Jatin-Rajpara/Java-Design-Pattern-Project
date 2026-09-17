<html>
<head>
    <title>Feedback - Step 2</title>
</head>
<body>

<h2>Feedback Form - Step 2</h2>

<%
    String name = request.getParameter("name");
%>

<form action="feedback" method="post">

    <input type="hidden" name="name" value="<%= name %>">

    Enter Feedback:
    <br>
    <textarea name="feedback" rows="5" cols="30"></textarea>

    <br><br>

    <input type="submit" value="Submit">

</form>

</body>
</html>