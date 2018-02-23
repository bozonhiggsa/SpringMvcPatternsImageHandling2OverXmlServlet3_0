<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Upload one image please</title>
</head>
<body>
<h1>Please upload an image</h1>
<form:form method="POST" action="/uploadOneImageForDisplay" enctype="multipart/form-data">
<table>
    <tr>
        <td>Select an image to upload</td>
        <td><input type="file" name="file" /></td>
    </tr>
    <tr>
        <td><input type="submit" value="Submit" /></td>
    </tr>
</table>
</form:form>
</body>
</html>