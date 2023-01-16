<%@ page contentType="text/html" pageEncoding="UTF-8" %>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<!DOCTYPE html>
<html>
<head>
    <jsp:include page="header.jsp" />
    <title>BlogPersonale - PROGETTI</title>
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
        <th>Actions</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${progetti}" var="progetto">
        <tr>
            <td>${progetto.getName()}</td>
            <td>${progetto.getDescription()}</td>
            <td><a href="${progetto.getLink()}" terget="_black">link</a></td>
            <td><a href="/progetti/delete?id=${progetto.getId()}">Elimina</a></td>
        </tr>
    </c:forEach>
    </tbody>
</table>




<div class="p-2">
    <fieldset>
        <legend>new progetto form</legend>
        <form action="/progetti/insert" method="post">
            <div>
                <label for="name">Name :</label>
                <input type="text" name="name" id="name" required>
            </div>
            <div>
                <label for="description">Description :</label>
                <input type="text" name="description" id="description" required>
            </div>
            <div>
                <label for="link">Link :</label>
                <input type="text" name="link" id="link" required>
            </div>
            <div>
                <input type="submit" value="invia">
            </div>
        </form>
    </fieldset>
</div>
<div class="p-2">
    <fieldset>
        <legend>update progetto form</legend>
        <form action="/progetti/update" method="post">
            <div>
                <label for="id">Skill :</label>
                <select name="id" id="id">
                    <c:forEach items="${progetti}" var="progetto">
                        <option value="${progetto.getId()}">${progetto.getName()}</option>
                    </c:forEach>
                </select>
            </div>
            <div>
                <label for="name2">Name :</label>
                <input type="text" name="name" id="name2" required>
            </div>
            <div>
                <label for="description2">Description :</label>
                <input type="text" name="description" id="description2" required>
            </div>
            <div>
                <label for="link2">Link :</label>
                <input type="text" name="link" id="link2" required>
            </div>
            <div>
                <input type="submit" value="invia">
            </div>
        </form>
    </fieldset>
</div>

<jsp:include page="footer.jsp" />
</body>
</html>