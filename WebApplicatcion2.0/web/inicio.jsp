<%-- 
 * Programación web
 * Tema: Struts 2 - Archivos de configuración
 * Julio César Mendoza T
 *
 * Proyecto: webAplicacionStruts2
 * Archivo: inicio.jsp
 
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <form action="paquete1/saludo.action" method="post">
            <input type="submit" value="Para entrar a Struts 2.. pulse aqui" />
        </form>
    </body>
</html>
