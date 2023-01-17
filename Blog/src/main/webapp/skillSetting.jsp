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
        <th>Actions</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${skills}" var="skill">
        <tr>
            <td>${skill.getName()}</td>
            <td>${skill.getDescription()}</td>
            <td>${skill.getCategoria().getName()}</td>
            <td><a href="/skills/delete?id=${skill.getId()}">Elimina</a></td>
            <!-- <td><a href="/skills/update?id=${skill.getId()}">Modifica</a></td> -->
        </tr>
    </c:forEach>
    </tbody>
</table>
<div class="p-2">
    <fieldset>
        <legend>new skill form</legend>
        <form action="/admin/skills/insert" method="post">
            <div>
                <label for="name">Name :</label>
                <input type="text" name="name" id="name" required>
            </div>
            <div>
                <label for="description">Description :</label>
                <input type="text" name="description" id="description" required>
            </div>
            <div>
                <label for="categorie">Categorie</label>
                <select name="categoria" id="categorie">
                    <c:forEach items="${categorie}" var="cat">
                        <option value="${cat.getId()}">${cat.getName()}</option>
                    </c:forEach>
                </select>
            </div>
            <div>
                <input type="submit" value="invia">
            </div>
        </form>
    </fieldset>
</div>
<div class="p-2">
    <fieldset>
        <legend>update skill form</legend>
        <form action="/admin/skills/update" method="post">
            <div>
                <label for="id">Skill :</label>
                <select name="id" id="id">
                    <c:forEach items="${skills}" var="skill">
                        <option value="${skill.getId()}">${skill.getName()}</option>
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
                <label for="categorie2">Categorie</label>
                <select name="categoria" id="categorie2">
                    <c:forEach items="${categorie}" var="cat">
                        <option value="${cat.getId()}">${cat.getName()}</option>
                    </c:forEach>
                </select>
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