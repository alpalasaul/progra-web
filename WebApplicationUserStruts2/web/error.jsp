<%-- 
 * Programación web
 * Tema: Struts 2 - Archivos de configuración
 * Julio César Mendoza T
 *
 * Proyecto: webUsuario2
 * Archivo: error.jsp
 
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Error</title>
    </head>
    <body>
    <center>
        <h1>Usuario no válido !!!!</h1>
        la combinación <s:property value="user" />
        <s:property value="pwd"/> no es correcta
    </center>
</body>
</html>
