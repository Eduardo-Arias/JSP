<%-- 
    Document   : doctor
    Created on : 23/09/2016, 03:17:07 AM
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
        <form action="DoctorTramiteTituloController" method="post">
            <fieldset> 
                <legend> Registro de Doctores </legend>
                <div>
                    <label for="idProfesor">ID Doctor: </label>
                    <input type="text" name="idDoctor" placeholder="ID Doctor" values="${doctor.iddoctor}" readonly="readonly">
                </div>
                <div>
                    <label for="nombre">Nombre doctor: </label>
                    <input type="text" name="nombre" placeholder="Nombre del doctor" values="${doctor.nombre}">
                </div>
                <div>
                    <label for="nota">Nota: </label>
                    <input type="text" name="nota" placeholder="nota" values="${doctor.nota}">
                </div>
                <div>
                    <label for="tramite">Tramite Titulacion: </label>
                    <input type="text" name="tramite" placeholder="tramite titulo" values="${doctor.tramitetitulo}">
                </div>
                <div>
                    <label for="activo">Estado: </label>
                    <input type="text" name="activo" placeholder="activo" values="${doctor.activo}">
                </div>
                <div>
                    <input type="submit" values="Guardar">
                </div>
            </fieldset>
        </form>
    </body>
</html>
