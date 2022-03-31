<%-- 
* Programación Web
* Tema: Modelo Vista Controlador utilizando Framework Struts (Introducción)

* Julio César Mendoza T.
* 
* Proyecto: webOperaciones
* Archivo de vista : webIngreso.jsp

--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@ page import = "modelo.*" %>

<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <title>Formulario de ingreso de datos </title>
    </head>
    <body>
        <html:form action="/validar" method="POST">
            <p> Numero 1: <html:text property="numero1" value="" ></html:text> </p>
            <p> Numero 2: <html:text property="numero2" value="" ></html:text> </p> 
            <html:submit property="submit" value="Sumar"> </html:submit>
        </html:form>
    </body>
</html>

