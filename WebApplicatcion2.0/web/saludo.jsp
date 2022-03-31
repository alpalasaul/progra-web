<%-- 
 * Programación web
 * Tema: Struts 2 - Archivos de configuración
 * Julio César Mendoza T
 *
 * Proyecto: webAplicacionStruts2
 * Archivo: saludo.jsp

--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Resultado de Ejemplo</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <h1><s:property value="mensaje" /> </h1>
        <h3>Fecha actual: <b><s:property value="fechaHora" /></b</h3>
    </body>
</html>
