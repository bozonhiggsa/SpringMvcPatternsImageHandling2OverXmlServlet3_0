<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Upload one file please</title>
</head>
<body>
<h1>Please upload a file</h1>
<form:form method="POST" action="/uploadOneFile" enctype="multipart/form-data">
<table>
    <tr>
        <td>Name</td>
        <td><input type="text" name="name" /></td>
    </tr>
    <tr>
        <td>Select a file to upload</td>
        <td><input type="file" name="file" /></td>
    </tr>
    <tr>
        <td><input type="submit" value="Submit" /></td>
    </tr>
</table>
</form:form>
</body>
</html>