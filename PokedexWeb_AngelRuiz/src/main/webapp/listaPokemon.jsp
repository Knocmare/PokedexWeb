<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>PokedexWeb - Lista de Pokemones</title>
        <link rel="stylesheet" href="estilos/style.css">
    </head>
    <body>
        <div>
            <h1>Pokemones Registrados</h1>
            <table>
                <thead>
                    <tr>
                        <th>Número</th>
                        <th>Nombre</th>
                        <th>Tipo</th>
                        <th>Imagen</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="p" items="${pokemones}">
                        <tr>
                            <td>${p.numero}</td>
                            <td>${p.nombre}</td>
                            <td>${p.tipo}</td>
                            <td><img src="${p.imagenUrl}" alt="{p.nombre}" class="pokemon"></td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
            <a href="index.jsp" class="btnVolver">Volver</a>
        </div>
    </body>
</html>
