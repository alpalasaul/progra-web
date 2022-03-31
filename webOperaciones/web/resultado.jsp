<%-- 
* Programación Web
* Tema: Modelo Vista Controlador utilizando Framework Struts (Introducción)

* Julio César Mendoza T.
* 
* Proyecto: webOperaciones
* Archivo de vista : resultado.jsp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@ page import = "modelo.*" %>

<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Página de resultados</title>
    </head>
    <body>

        <% int i = (Integer) request.getAttribute("respuesta");%>
        La suma es : <%= i%>  

    </body>
</html>
