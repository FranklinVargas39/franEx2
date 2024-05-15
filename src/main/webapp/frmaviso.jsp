<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>
    <h1><c:if test="${aviso.id == 0}">Nuevo</c:if><c:if test="${aviso.id != 0}"> Registro</c:if> </h1>
    <form action="inicio" method="post">
        <input type="hidden" name="id" value="${aviso.id}" />
        <table>
            <tr>
                <td>Nombre</td>
                <td><input type="text" name="nombre" value="${aviso.nombre}" /></td>
            </tr>
            <tr>
                <td>Apellido</td>
                <td><input type="text" name="apellido" value="${aviso.apellido}" /></td>
            </tr>
            <tr>
                <td>Seminario</td>
                <td><input type="text" name="seminario" value="${aviso.seminario}" /></td>
            </tr>
            <tr>
                 <td>Fecha</td>
                 <td><input type="text" name="fecha" value="${aviso.fecha}" /></td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="Guardar" /></td>
            </tr>
            

        </table>
    </form>
</body>
</html>
