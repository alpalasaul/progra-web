<%-- 
 * Tema: Análisis del API de Struts - Interacción con MySQL DB
 * Julio César Mendoza
 * 
 * Proyecto: webProductos
 * Archivo: ingreso.jsp (archivo de vista)
--%>

<%@page contentType="text/html" %>
<%@page pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>

<!DOCTYPE html>
<html:html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Formulario de bienvenida</title>
    </head>
    <body>
    <center>
        <html:form action="/ingresar" method="POST">

            <p><html:text property="bandera" value = "Bievenido al Sistema <- desde JSP" size = "35"></html:text>  </p>
            <html:submit property="submit" value="Ingresar al sistema"> </html:submit>

        </html:form>
    </center>
</body>
</html:html>
