<%-- 
    Document   : index
    Created on : 29/11/2016, 07:52:05 PM
    Author     : eduardo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <title>SEA Sistema de entrega de actas</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

    <!-- Optional theme -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

    <!-- Latest compiled and minified JavaScript -->
    
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
    
    <script src="static/js/bootstrap.js" type="text/javascript"></script>
    <script src="static/js/jquery-3.1.1.min.js" type="text/javascript"></script>
    <link href="static/css/bootstrap-theme.min.css" rel="stylesheet" type="text/css"/>
    <link href="static/css/bootstrap.css" rel="stylesheet" type="text/css"/>
    <link href="static/css/myStyle.css" rel="stylesheet" type="text/css"/>
    
    <link href="https://fonts.googleapis.com/css?family=Enriqueta|Handlee|Merriweather+Sans|Pacifico|Sanchez" rel="stylesheet">
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
                <a class="navbar-brand" href="index.jsp" id="index">SEA</a>
            </div>

             <!-- Collect the nav links, forms, and other content for toggling -->
                <div class="collapse navbar-collapse" id="myNavBar">
                    <ul class="nav navbar-nav">

                        <li class="dropdown">
                            <a href="" id="menu" data-toggle="dropdown"> Empleado <b class="caret"></b></a>
                            <ul class="dropdown-menu">
                                <li><a id="submenu" href="">Agregar</a></li>
                                <li><a id="submenu" href="">Modificar</a></li>
                                <li><a id="submenu" href="">Eliminar</a></li>
                                <li><a id="submenu" href="">Listar</a></li>
                                <li><a id="submenu" href="">Repotes</a></li>
                            </ul>
                        </li><!--end .Empleado -->

                        <li class="dropdown">
                            <a href="" id="menu" data-toggle="dropdown">Grupo <span class="caret"></span></a>
                            <ul class="dropdown-menu">
                                <li><a id="submenu" href="GrupoController?action=agregar">Agregar</a></li>
                                <li><a id="submenu" href="GrupoController?action=cambiar">Modificar</a></li>
                                <li><a id="submenu" href="GrupoController?action=borrar">Eliminar</a></li>
                                <li><a id="submenu" href="GrupoController?action=listar">Listar</a></li>
                            </ul>
                        </li><!--end .grupo -->
                        <li class="dropdown">
                            <a href="" id="menu" class="dropdown-toggle" data-toggle="dropdown" role="button" 
                               aria-haspopup="true" aria-expanded="true">Materia <span class="caret"></span></a>
                            <ul class="dropdown-menu">
                                <li><a id="submenu" href="">Agregar</a></li>
                                <li><a id="submenu" href="">Modificar</a></li>
                                <li><a id="submenu" href="">Eliminar</a></li>
                                <li><a id="submenu" href="">Listar</a></li>
                                <li><a id="submenu" href="">Repotes</a></li>
                            </ul>
                        </li><!--end .materia -->
                        <li class="dropdown">
                            <a href="" id="menu" class="dropdown-toggle" data-toggle="dropdown" role="button" 
                               aria-haspopup="true" aria-expanded="true">Unidad Tematica <span class="caret"></span></a>
                            <ul class="dropdown-menu">
                                <li><a id="submenu" href="">Agregar</a></li>
                                <li><a id="submenu" href="">Modificar</a></li>
                                <li><a id="submenu" href="">Eliminar</a></li>
                                <li><a id="submenu" href="">Listar</a></li>
                                <li><a id="submenu" href="">Repotes</a></li>
                            </ul>
                        </li><!--end .unidad Tematica -->
                        <li class="dropdown">
                            <a href="#" id="menu" class="dropdown-toggle" data-toggle="dropdown" role="button" 
                               aria-haspopup="true" aria-expanded="true">Programa Educativo<span class="caret"></span></a>
                            <ul class="dropdown-menu">
                                <li><a id="submenu" href="">Agregar</a></li>
                                <li><a id="submenu" href="">Modificar</a></li>
                                <li><a id="submenu" href="">Eliminar</a></li>
                                <li><a id="submenu" href="">Listar</a></li>
                                <li><a id="submenu" href="">Repotes</a></li>
                            </ul>
                        </li><!--end .Programa Educativo -->
                        <li class="dropdown">
                            <a href="#" id="menu" class="dropdown-toggle" data-toggle="dropdown" role="button" 
                               aria-haspopup="true" aria-expanded="true">Carrera<span class="caret"></span></a>
                            <ul class="dropdown-menu">
                                <li><a id="submenu" href="">Agregar</a></li>
                                <li><a id="submenu" href="">Modificar</a></li>
                                <li><a id="submenu" href="">Eliminar</a></li>
                                <li><a id="submenu" href="">Listar</a></li>
                                <li><a id="submenu" href="">Repotes</a></li>
                            </ul>
                        </li><!--end .Carrera -->
                        <li class="dropdown">
                            <a href="#" id="menu" class="dropdown-toggle" data-toggle="dropdown" role="button"
                               aria-haspopup="true" aria-expanded="true">Periodo Escolar<span class="caret"></span></a>
                            <ul class="dropdown-menu">
                                <li><a id="submenu" href="">Agregar</a></li>
                                <li><a id="submenu" href="">Modificar</a></li>
                                <li><a id="submenu" href="">Eliminar</a></li>
                                <li><a id="submenu" href="">Listar</a></li>
                                <li><a id="submenu" href="">Repotes</a></li>
                            </ul>
                        </li><!--end .Carrera -->
                    </ul>

                    <ul class="nav navbar-nav navbar-right">
                        <li class="dropdown">
                            <a href="#" id="menu" class="dropdown-toggle" data-toggle="dropdown" role="button" 
                               aria-haspopup="true" aria-expanded="false">
                                <span class="glyphicon glyphicon-user"></span> 
                                Usuario<span class="caret"></span></a>
                            <ul class="dropdown-menu">
                                <li><a id="submenu" href="#"><span class="glyphicon glyphicon-education"></span> Mi Perfil</a></li>
                                <li><a id="submenu" href="#"><span class="glyphicon glyphicon-log-out"></span> Salir </a></li>
                            </ul>
                        </li>
                    </ul>
                </div><!-- /.navbar-collapse -->
            </div><!-- /.container-fluid -->
        </nav>
    
    <script src="static/js/bootstrap.js" type="text/javascript"></script>
    <script src="static/js/jquery-3.1.1.min.js" type="text/javascript"></script>
    

</body>
</html>
