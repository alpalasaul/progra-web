<%-- 
* Programación Web
* Tema: Modelo Vista Controlador utilizando Framework Struts (Introducción)
        Interacción con una base de datos MYSQL

* Julio César Mendoza T.
* 
* Proyecto: webClientes
* Archivo de vista : bienvenida.jsp

--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1> Bienvenido a mi pagina <i>
        <bean: write name="ValidacionForm" property="usuario"
        </i> </h1>
        </h1>
    </body>
</html>
