<%-- 
    Document   : nuevoCliente
    Created on : 05/03/2021, 08:43:31 PM
    Author     : fclou
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Nuevo Cliente</title>

        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css" integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l" crossorigin="anonymous">
        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-Piv4xVNRyMGpqkS2by6br4gNJ7DXjqk09RmUpJ8jgGtD7zP9yug3goQfGII0yAns" crossorigin="anonymous"></script>


    </head>
    <body>
        <h1>Nuevo Cliente</h1>
        <div class="container">
            <form action="guardarCliente" method="POST">
                <div class="form-group">
                    <label for="nombre">Nombre</label>
                    <input type="text" class="form-control" id="nombre" name="nombre" placeholder="Ingrese el Nombre">
                </div>
                <div class="form-group">
                    <label for="edad">Edad</label>
                    <input type="text" class="form-control" id="edad" name="edad" placeholder="Ingrese la Edad">
                </div>
                <div class="form-group">
                    <label for="dni">DNI</label>
                    <input type="text" class="form-control" id="dni" name="dni" placeholder="Ingrese el DNI">
                </div>
                <div class="form-group">
                    <label for="correo">Correo</label>
                    <input type="text" class="form-control" id="correo" name="correo" placeholder="Ingrese el Correo">
                </div>
                <div class="form-group">                
                    <input type="submit" class="btn btn-primary" value="Guardar">
                </div>            
            </form>
        </div>

    </body>
</html>
