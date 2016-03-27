<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
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
<div>
    <form action="#" th:th:action="@{/process}" th:object="${text}" method="post">
        <p>Text: <input type="text" th:field="*{text:}" /></p>
        <p>Operation: <input type="text" th:field="*{operation:}" /></p>
        <p><input type="submit" value="Submit" />
    </form>
    <%--<form:form method="POST">
        <label for='text_field'>Text: </label><br>
        <form:input path="textField" id="text_field"/><br>
        <label for='operation'>Select any operation: </label><br>
        <form:select path="operation" id='operation'>
            <form:option value="characters" label="characters">The number of characters</form:option>
            <form:option value="words" label="words">The number of words</form:option>
            <form:option value="sentences" label="sentences">The number of sentences</form:option>
            <form:option value="paragraphs" label="paragraphs">The number of paragraphs</form:option>
        </form:select>
    </form:form>--%>
</div>
<!--
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
    -->
</body>
</html>