<%-- 
    Document   : listar_lugares
    Created on : 29/09/2016, 02:50:06 PM
    Author     : eduardo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lugares</title>
    </head>
    <body>
        <table>
            <thead>
                <tr>
                    <th>Id</th>
                    <th>Nombre</th>
                    <th>Tipo</th>
                    <th>Ubicacion</th>
                    <th>Provincia</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${lugares}" var="lugar">
                    <tr>
                        <td>${lugar.idLugar}</td>
                        <td>${lugar.nombre}</td>
                        <td>${lugar.tipo}</td>
                        <td>${lugar.ubicacion}</td>
                        <td>${lugar.provincia}</td>
                        <td>
                            <a href="LugarController?action=cambiar&idLugar=${lugar.idLugar}">Cambiar</a>
                        </td>
                        <td>
                            <a href="LugarController?action=borrar&idLugar=${lugar.idLugar}">Borrar</a>
                        </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
        <p>
            <a href="LugarController?action=agregar">Agregar Criterio</a>
             <a href="index.jsp">Regresar</a>
        </p>
    </body>
</html>
