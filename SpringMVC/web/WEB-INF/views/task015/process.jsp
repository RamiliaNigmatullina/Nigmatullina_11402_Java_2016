<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="th" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: ramilanigmatullina
  Date: 26.03.16
  Time: 9:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Process (Task015)</title>
</head>
<body>
<form action="#" th:action="@{/greeting}" th:object="${greeting}" method="post">
    <p>Id: <input type="text" th:field="*{id}" /></p>
    <p>Message: <input type="text" th:th:field="*{content}" /></p>
    <p><input type="submit" value="Submit" /> <input type="reset" value="Reset" /></p>
</form>

    <form method='post' action='@{/process}'>
        <label for='text_field'>Text: </label><br>
        <textarea name='text_field' id='text_field' rows='10' cols='50'></textarea><br>
        <label for='operation'>Select any operation: </label><br>
        <select style='margin: 5px 0px' name='operation' id='operation'>
            <option value='characters'>The number of characters</option>
            <option value='words'>The number of words</option>
            <option value='sentences'>The number of sentences</option>
            <option value='paragraphs'>The number of paragraphs</option>
        </select><br>
        <input type='submit' value='Process'/>
    </form>
</body>
</html>
