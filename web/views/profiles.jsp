<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="gdt" uri="/geek-dates" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%=request.getAttribute("Name")%>

    <h1>DQL Query Results:</h1>
    <gdt:Table>
        <gdt:Greeting userName="Sa'ad - Anood"/>
        <tr>
            <th>Name:</th>
            <th>Age:</th>
        </tr>

        <gdt:MathcedProfiles/>
    </gdt:Table>
    </br>
    </br>
    <button onclick="window.location.href='/'">Return</button>

</body>
</html>
