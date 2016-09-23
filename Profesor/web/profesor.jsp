<%-- 
    Document   : profesor
    Created on : 21/09/2016, 10:34:16 AM
    Author     : Eduardo Arias
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Formulario de Profesores</title>
    </head>
    <body>
        <form action="ProfesorController" method="post">
            <fieldset> 
                <legend> Registro de Profesores </legend>
                <div>
                    <label for="idProfesor">ID Profesro: </label>
                    <input type="text" name="idProfesor" 
                           placeholder="ID Procesor" 
                           values="${profesor.idProfesor}" 
                           readonly="readonly">
                </div>
                <div>
                    <label for="nombre">Nombre profesor: </label>
                    <input type="text" name="nombre" placeholder="Nombre del Procesor" values="${profesor.nombre}">
                </div>
                <div>
                    <label for="experiencia">Experiencia del Profesor: </label>
                    <input type="number" name="experiencia" placeholder="Experiencia en años" values="${profesor.experiencia}">
                </div>
                <div>
                    <label for="carrera">Carrera del profesor: </label>
                    <input type="text" name="carrera" placeholder="Carrera de abscripción" values="${profesor.carrera}">
                </div>
                <div>
                    <input type="submit" values="Guardar">
                </div>
            </fieldset>
        </form>
    </body>
</html>
