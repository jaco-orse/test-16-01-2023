<%@ page contentType="text/html" pageEncoding="UTF-8" %>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<!DOCTYPE html>
<html>
<head>
    <jsp:include page="header.jsp" />
    <title>BlogPersonale - SKILLS</title>
</head>
<body>
<jsp:include page="navBar.jsp" />
<h1>Le mie skill:</h1>
<table>
    <thead>
        <tr>
            <th>Nome</th>
            <th>Descrizione</th>
            <th>Categoria</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach items="${skills}" var="skill">
            <tr>
                <td>${skill.getName()}</td>
                <td>${skill.getDescription()}</td>
                <td>${skill.getCategoria().getName()}</td>
            </tr>
        </c:forEach>
    </tbody>
</table>

<jsp:include page="footer.jsp" />
</body>
</html>