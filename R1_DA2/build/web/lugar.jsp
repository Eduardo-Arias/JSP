<%-- 
    Document   : lugar
    Created on : 29/09/2016, 02:49:26 PM
    Author     : eduardo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Agregar Lugares</title>
    </head>
    <body>
        <form action="LugarController" method="post">
            <fieldset>
                <legend>Registro de lugares </legend>
                <div>
                    <label for="idLugar">Id Lugar:</label>
                    <input type="text" name="idLugar"
                           value="${lugar.idLugar}"
                           placeholder="Id del lugar"
                           readonly="readonly"/> 
                </div>
                <div>
                    <label for="nombre">Nombre:</label>
                    <input type="text" name="nombre"
                           value="${lugar.nombre}"
                           placeholder="Nombre del lugar"
                           /> 
                </div>
                <div>
                    <label for="tipo">Tipo de lugar:</label>
                    <input type="text" name="tipo"
                           value="${lugar.tipo}"
                           placeholder="Tipo del lugar"
                           /> 
                </div>
                <div>
                    <label for="ubicacion">Ubicacion del lugar:</label>
                    <input type="text" name="ubicacion"
                           value="${lugar.ubicacion}"
                           placeholder="Ubicacion del lugar"
                           /> 
                </div>
                <div>
                    <label for="provincia">Provincia de lugar:</label>
                    <input type="text" name="provincia"
                           value="${lugar.provincia}"
                           placeholder="Provincia del Lugar"
                           /> 
                </div>
          
                    <input type="submit" value="Guardar"/>
                </div>
        </form>
    </body>
</html>
