<%-- Programación Web:
 * Julio César Mendoza
 * Tema: API de Struts - Validaciones predefinidas en Struts
 *
 * Proyecto: webControlDatosUsuario
 * Clase:   Registro.jsp (Vista)
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri= "http://struts.apache.org/tags-logic" prefix="logic"%>
<%@ taglib uri= "http://struts.apache.org/tags-bean"  prefix="bean"%>
<%@ taglib uri= "http://struts.apache.org/tags-html" prefix="html"%>

<!DOCTYPE html>
<html:html>
    <head> <title>Página de registro</title> </head>
    <body>
        <html:javascript formName="RegistroForm2"/>   
        <html:form action="/registrar" method="post" onsubmit="return validateRegistroForm2">
            <table>
                <tr>
                    <td>Nombre:</td>
                    <td><html:text property="nombre"/> </td>
                    <td>&nbsp;</td>
                </tr>
                <tr>
                    <td>Apellido: </td>
                    <td><html:text property="apellido"/> </td>
                    <td>&nbsp;</td>
                </tr>
                <tr>
                    <td>Usuario: </td>
                    <td><html:text property="usuario"/> </td>
                </tr>
                <tr>
                    <td>Password: </td>
                    <td><html:text property="password"/> </td>

                </tr>
                <tr>
                    <td>Email: </td>
                    <td><html:text property="email"/> </td>

                </tr>
                <tr>
                    <td colspan="3">
                        <br/>
                        <html:submit property="submit" value="Registrar"/>
                        &nbsp;&nbsp;
                        <html:reset value="Limpiar"/>
                    </td>
                </tr>
            </table>
        </html:form>
    </body>
</html:html>