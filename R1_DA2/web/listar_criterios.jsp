<%-- 
    Document   : listar_criterios
    Created on : 28/09/2016, 04:54:28 PM
    Author     : eduardo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <table>
            <thead>
                <tr>
                    <th>Id</th>
                    <th>Descricion</th>
                    <th>Activo</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${criterios}" var="criterio">
                    <tr>
                        <td>${criterio.idCriterioEvaluacion}</td>
                        <td>${criterio.descripcion}</td>
                        <td>${criterio.activo}</td>
                        <td>
                            <a href="CriterioEvaluacionController?action=cambiar&idCriterio=${criterio.idCriterioEvaluacion}">Cambiar</a>
                        </td>
                        <td>
                            <a href="CriterioEvaluacionController?action=borrar&idCriterio=${criterio.idCriterioEvaluacion}">Borrar</a>
                        </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
        <p>
            <a href="CriterioEvaluacionController?action=agregar">Agregar Criterio</a>
             <a href="index.jsp">Regresar</a>
        </p>
    </body>
</html>
