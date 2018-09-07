<%@ page import="com.date.GeekDatesInfo" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>DQL Query Results:</h1>
    <table>
        <tr>
            <th>Name:</th>
            <th>Age:</th>
        </tr>

        <%
            List<GeekDatesInfo> matchedProfiles = (List<GeekDatesInfo>) request.getAttribute("userProfiles");
            for (GeekDatesInfo profile : matchedProfiles) {
                response.getOutputStream().println("<tr>");
                response.getOutputStream().println("<td>" + profile.getName() + "</td>");
                response.getOutputStream().println("<td>" + profile.getAge() + "</td>");
                response.getOutputStream().println("</tr>");

            }
        %>
    </table>
    </br>
    </br>
    <button onclick="window.location.href='/'">Return</button>

</body>
</html>
