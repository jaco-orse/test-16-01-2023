<%@ page contentType="text/html" pageEncoding="UTF-8" %>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<!DOCTYPE html>
<html>
<head>
    <jsp:include page="header.jsp" />
    <title>BlogPersonale - Progetti</title>
</head>
<body>
<jsp:include page="navBar.jsp" />
<h1>I miei progetti:</h1>
<table>
    <thead>
    <tr>
        <th>Nome</th>
        <th>Descrizione</th>
        <th>Link</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${progetti}" var="progetto">
        <tr>
            <td>${progetto.getName()}</td>
            <td>${progetto.getDescription()}</td>
            <td>${progetto.getLink()}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>

<jsp:include page="footer.jsp" />
</body>
</html>