<%-- 
    Document   : listarClientes
    Created on : 05/03/2021, 08:43:38 PM
    Author     : fclou
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista de Clientes</title>
        
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css" integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l" crossorigin="anonymous">
        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-Piv4xVNRyMGpqkS2by6br4gNJ7DXjqk09RmUpJ8jgGtD7zP9yug3goQfGII0yAns" crossorigin="anonymous"></script>

    </head>
    <body>
        <h1>Lista de Clientes</h1>
        
        <div class="container">
            <table class="table table-hover">
                <thead>
                    <tr>
                        <th>Código</th>
                        <th>Nombre</th>
                        <th>Edad</th>
                        <th>DNI</th>
                        <th>Correo</th>
                    </tr>
                </thead>
                <jsp:useBean id="clientedao" class="dao.ClienteDAO"></jsp:useBean>
                
                <c:forEach items="${clientedao.listar()}" var="cliente">
                    <tr>
                        <td>${cliente.codigo}</td>
                        <td>${cliente.nombre}</td>
                        <td>${cliente.edad}</td>
                        <td>${cliente.dni}</td>
                        <td>${cliente.correo}</td>
                        
                        <td><a href="eliminarCliente?codigo=${cliente.codigo}">Eliminar</a></td>
                    </tr>
                </c:forEach>
                
            </table>
        </div>
        
    </body>
</html>
