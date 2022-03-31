<%-- 
* Programación Web
* Tema: Modelo Vista Controlador utilizando Framework Struts (Introducción)
        Interacción con una base de datos MYSQL

* Julio César Mendoza T.
* 
* Proyecto: webClientes
* Archivo de vista : login.jsp

--%>

<%@page contentType="text/html" %>
<%@page pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>

<!DOCTYPE html>
<html:html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Formulario de autenticacion</title>
    </head>
    <body style="font-family: sans-serif">
    <center>
        <h1>Formulario de autenticación</h1>
        <html:form action="/validar" method="POST">
            <table>
                <tr>
                    <td> Usuario: </td>
                    <td> <html:text property="usuario"></html:text>  </td>
                        </td>
                    </tr>

                    <tr>
                        <td> Password: </td>
                        <td> <html:text property="password"></html:text>  </td>
                    </tr>

                    <tr>
                        <td></td>
                        <td colspan="2">
                            <br/>
                        <html:submit property="submit" value="Validar"> </html:submit>
                        <html:reset value = "Limpiar"/> 
                    </td>

                </tr>

            </table>

        </html:form>
        <br/>
        <html:link forward="pararegistro"> Registrese</html:link>
        </center>
    </body>
</html:html>
