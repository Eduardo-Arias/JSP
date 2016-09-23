<%-- 
    Document   : listar_doctores
    Created on : 23/09/2016, 03:11:05 AM
    Author     : eduardo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <table>
            <thead>
                <tr>  ID Doctor</tr>
                <tr>-  Nombre</tr>
                <tr>-  Notas</tr>
                <tr>-  Tramite Titulo</tr>
                <tr>-  Activo</tr>
            </thead>
            <tbody>
                <c:forEach items="${doctores}" var="doctor">
                    <tr>
                        <td>${doctor.idDoctor}</td>
                        <td>${doctor.nombre}</td>
                        <td>${doctor.nota}</td>
                        <td>${doctor.tramitetitulo}</td>
                        <td>${doctor.activo}</td>
                        <td> 
                            <a href="DoctorTramiteTitulacionController?action=cambiar&iddoctor=${doctor.idDoctor}">Cambiar</a> 
                        </td>
                        <td> 
                            <a href="DoctorTramiteTitulacionController?action=borrar&iddoctor=${doctor.idDoctor}">Borrar</a> 
                        </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
        <p>
            <a href="ProfesorController?action=agregar">AgregarProfesor</a>
        </p><h1>Hello World!</h1>
    </body>
</html>
