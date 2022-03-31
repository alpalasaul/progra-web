<%-- Programación web
 * Tema: Struts 2 - Archivos de configuración
 * Julio César Mendoza T
 *
 * Proyecto: webUsuarios2
 * Archivo: login.jsp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Formulario de autenticacion</h1>
        <form action="paquete1/login.action" method="post">
            <table>
                <tr>
                    <td> Usuario </td> 
                    <td> <input type="text" name="username"/></td>
                </tr>
                <tr>
                    <td> Password </td> 
                    <td> <input type="text" name="password"/></td>
                </tr>
                <tr>
                    <td align="center" colspan="2"><input type="submit" value="Entrar"/></td>
                <tr> 
            </table>  
        </form> 
    </body>  
</html>
