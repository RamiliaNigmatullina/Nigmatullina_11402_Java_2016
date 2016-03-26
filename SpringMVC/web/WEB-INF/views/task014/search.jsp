<%--
  Created by IntelliJ IDEA.
  User: ramilanigmatullina
  Date: 25.03.16
  Time: 15:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Search (task014)</title>
</head>
<body>
    <form action="${websiteAddress}" method="get">
    <label for="search" class="text" style="margin: 5px 0px">Search ${nameOfSearchSite}:</label><br>
        <input type="text" name="${name}" id="search"/><br>
        <input type="submit" value="Search" style="margin: 5px 0px"/>
    </form>
</body>
</html>
