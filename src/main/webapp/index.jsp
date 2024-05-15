
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Registro dia del Internet</title>
</head>
<body>
    <!DOCTYPE html>
<html>
<head>
    <title>Cuadro de Texto con Números</title>
    <style>
        .container {
            display: flex;
            align-items: center;
            height: 25vh; /* Ajusta la altura según sea necesario */
        }
        .textbox {
            width: 350px; /* Ancho del cuadro de texto */
            height: 85px; /* Altura del cuadro de texto */
            padding: 10px;
            border: 1px solid #ccc;
            border-radius: 5px;
            font-size: 16px;
            font-family: Arial, sans-serif;
        }
         .container1 {
                         display: flex;
                         
            justify-content: center;
            align-items: center;
        }
    </style>
</head>
<body>
    <div class="container">
        <textarea class="textbox" readonly>
PRIMER PARCIAL TEM-742
Nombre: RUDDY FRANKLIN VARGAS CHOQUE
Carnet: 13939450 LP.
        </textarea>
    </div>
</body>
    
    <h1>Registro dia del Internet</h1>
    <p><a href="inicio?action=add">Nuevo</a></p>
    
    <table   border="1">
        <tr>
            <th>ID</th>
            <th>Nombre</th>
            <th>Apellido</th>
            <th>Seminario</th>
            <th>Fecha</th>
        </tr>
        <c:forEach var="aviso" items="${avisos}">
            <tr>
                <td>${aviso.id}</td>
                <td>${aviso.nombre}</td>
                <td>${aviso.apellido}</td>
                <td>${aviso.seminario}</td>
                <td>${aviso.fecha}</td>
                <td>
                    <a href="inicio?action=edit&id=${aviso.id}">Editar</a> |
                    <a href="inicio?action=delete&id=${aviso.id}">Eliminar</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
