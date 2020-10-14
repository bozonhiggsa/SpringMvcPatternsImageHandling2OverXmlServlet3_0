<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Submitted Model with File</title>
</head>
<body>
<h2>Submitted Model with File</h2>
<table>
    <tr>
        <td>Name:</td>
        <td>${formDataWithFile.name}</td>
    </tr>
    <tr>
        <td>Login:</td>
        <td>${formDataWithFile.login}</td>
    </tr>
    <tr>
        <td>OriginalFileName:</td>
        <td>${formDataWithFile.file.originalFilename}</td>
    </tr>
    <tr>
        <td>Type:</td>
        <td>${formDataWithFile.file.contentType}</td>
    </tr>
</table>
</body>
</html>
