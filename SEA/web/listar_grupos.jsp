<%-- 
    Document   : listar_grupos
    Created on : 29/11/2016, 10:14:47 PM
    Author     : eduardo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Grupos</title>
        <!-- Latest compiled and minified CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

        <!-- Optional theme -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

        <!-- Latest compiled and minified JavaScript -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
        <link href="static/css/myStyle.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <nav class="navbar navbar-inverse">
            <div class="container-fluid">
                <!-- Brand and toggle get grouped for better mobile display -->
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" 
                            data-toggle="collapse" 
                            data-target="#myNavBar">
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="index.jsp">SEA</a>
                </div>

                 <!-- Collect the nav links, forms, and other content for toggling -->
                <div class="collapse navbar-collapse" id="myNavBar">
                    <ul class="nav navbar-nav">

                        <li class="dropdown">
                            <a href="" data-toggle="dropdown"> Empleado <b class="caret"></b></a>
                            <ul class="dropdown-menu">
                                <li><a href="">Agregar</a></li>
                                <li><a href="">Modificar</a></li>
                                <li><a href="">Eliminar</a></li>
                                <li><a href="">Listar</a></li>
                                <li><a href="">Repotes</a></li>
                            </ul>
                        </li><!--end .Empleado -->

                        <li class="dropdown">
                            <a href="" class="dropdown-toggle" data-toggle="dropdown" role="button" 
                               aria-haspopup="true" aria-expanded="true">Grupo <span class="caret"></span></a>
                            <ul class="dropdown-menu">
                                <li><a href="GrupoController?action=agregar">Agregar</a></li>
                                <li><a href="GrupoController?action=cambiar">Modificar</a></li>
                                <li><a href="GrupoController?action=borrar">Eliminar</a></li>
                                <li><a href="GrupoController?action=listar">Listar</a></li>
                                <li><a href="#">Repotes</a></li>
                            </ul>
                        </li><!--end .grupo -->
                        <li class="dropdown">
                            <a href="" class="dropdown-toggle" data-toggle="dropdown" role="button" 
                               aria-haspopup="true" aria-expanded="true">Materia <span class="caret"></span></a>
                            <ul class="dropdown-menu">
                                <li><a href="#">Agregar</a></li>
                                <li><a href="#">Modificar</a></li>
                                <li><a href="#">Eliminar</a></li>
                                <li><a href="#">Listar</a></li>
                                <li><a href="#">Repotes</a></li>
                            </ul>
                        </li><!--end .materia -->
                        <li class="dropdown">
                            <a href="" class="dropdown-toggle" data-toggle="dropdown" role="button" 
                               aria-haspopup="true" aria-expanded="true">Unidad Tematica <span class="caret"></span></a>
                            <ul class="dropdown-menu">
                                <li><a href="#">Agregar</a></li>
                                <li><a href="#">Modificar</a></li>
                                <li><a href="#">Eliminar</a></li>
                                <li><a href="#">Listar</a></li>
                                <li><a href="#">Repotes</a></li>
                            </ul>
                        </li><!--end .unidad Tematica -->
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" 
                               aria-haspopup="true" aria-expanded="true">Programa Educativo<span class="caret"></span></a>
                            <ul class="dropdown-menu">
                                <li><a href="#">Agregar</a></li>
                                <li><a href="#">Modificar</a></li>
                                <li><a href="#">Eliminar</a></li>
                                <li><a href="#">Listar</a></li>
                                <li><a href="#">Repotes</a></li>
                            </ul>
                        </li><!--end .Programa Educativo -->
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" 
                               aria-haspopup="true" aria-expanded="true">Carrera<span class="caret"></span></a>
                            <ul class="dropdown-menu">
                                <li><a href="#">Agregar</a></li>
                                <li><a href="#">Modificar</a></li>
                                <li><a href="#">Eliminar</a></li>
                                <li><a href="#">Listar</a></li>
                                <li><a href="#">Repotes</a></li>
                            </ul>
                        </li><!--end .Carrera -->
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button"
                               aria-haspopup="true" aria-expanded="true">Periodo Escolar<span class="caret"></span></a>
                            <ul class="dropdown-menu">
                                <li><a href="#">Agregar</a></li>
                                <li><a href="#">Modificar</a></li>
                                <li><a href="#">Eliminar</a></li>
                                <li><a href="#">Listar</a></li>
                                <li><a href="#">Repotes</a></li>
                            </ul>
                        </li><!--end .Carrera -->
                    </ul>

                    <ul class="nav navbar-nav navbar-right">
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" 
                               aria-haspopup="true" aria-expanded="false">Usuario<span class="caret"></span></a>
                            <ul class="dropdown-menu">
                                <li><a href="#">Mi Perfil</a></li>
                                <li><a href="#">Salir</a></li>
                            </ul>
                        </li>
                    </ul>
                </div><!-- /.navbar-collapse -->
            </div><!-- /.container-fluid -->
        </nav>

        <script src="static/js/bootstrap.js" type="text/javascript"></script>
        <script src="static/js/jquery-3.1.1.min.js" type="text/javascript"></script>
        <div class="panel panel-primary" id="panelPrimary">
            <div class="panel-heading">Lista de Grupos</div>
            <div class="panel-body">
                <table class=" table table-hover" id="tabla-grupo">
                    <thead>
                        <tr>
                            <th>Clave del Grupo </th>
                            <th>  </th>
                            <th>Estado del Grupo </th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach items="${grupos}" var="grupo">
                            <tr>
                                <td>${grupo.cveGrupo}</td>
                                <th>  </th>
                                <td>${grupo.estado}</td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>

        <script src="static/js/bootstrap.min.js" type="text/javascript"></script>
        <script src="static/js/jquery-3.1.1.min.js" type="text/javascript"></script>
    </body>
</html>
