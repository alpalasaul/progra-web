<%-- 
* Programación Web
* Tema: Modelo Vista Controlador utilizando Framework Struts (Introducción)
        Interacción con una base de datos MYSQL

* Julio César Mendoza T.
* 
* Proyecto: webClientes
* Archivo de vista : error.jsp

--%>

<%@page contentType="text/html" %>
<%@page pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Combinación incorrecta de usuario y password, intentelo de nuevo...</h1>
        <html:link forward="login">Aquí</html:link>
    </body>
</html>
