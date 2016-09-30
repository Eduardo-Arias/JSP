<%-- 
    Document   : criterio
    Created on : 28/09/2016, 04:53:26 PM
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
        <form action="CriterioEvaluacionController" method="post">
            <fieldset>
                <legend>Registro de profesores </legend>
                <div>
                    <label for="idCriterio">Id criterio evalucion:</label>
                    <input type="text" name="idCriterio"
                           value="${criterioevaluacion.idCriterioEvaluacion}"
                           placeholder="Id de criterio evaluacion"
                           readonly="readonly"/> 
                </div>
                <div>
                    <label for="descripcion">descripcion:</label>
                    <input type="text" name="descripcion"
                           value="${CriterioEvaluacion.descripcion}"
                           placeholder="descripcion"
                           /> 
                </div>
                <div>
                    <label for="activo">Activo:</label>
                    <input type="text" name="activo"
                           value="${criterioevaluacion.activo}"
                           placeholder="true o false"
                           /> 
                </div>
          
                    <input type="submit" value="Guardar"/>
                </div>
        </form>
    </body>
</html>
