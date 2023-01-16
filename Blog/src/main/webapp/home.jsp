<%@ page contentType="text/html" pageEncoding="UTF-8" %>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<!DOCTYPE html>
<html>
    <head>
        <jsp:include page="header.jsp" />
        <title>BlogPersonale</title>
    </head>
<body>
<jsp:include page="navBar.jsp" />
<div class="p-2 text-center">
    <img src="images/image.png" alt="image" height="100" width="100">
    <h1> Blog Personale </h1>
</div>
<div class="p-2 text-center">
    <p>Ciao, mi chiamo Jacopo Orsenigo!</p>
    <p>Le mie skills rientrano nelle seguenti categorie :</p>
    <p> |
    <c:forEach items="${categorie}" var="cat">
        ${cat.getName()} |
    </c:forEach>
    </p>
</div>

<jsp:include page="footer.jsp" />
</body>
</html>