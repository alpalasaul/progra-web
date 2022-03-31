<%-- 
* Programacion Web
* Tema: API de Struts - Validación en el cliente
* Julio César Mendoza T.

* Proyecto: webValidacion
* Archivo: autenticacion.jsp (Archivo de vista)

* Con la finalidad de poder realizar la validación desde el navegador, el plug-in validator inyecta una serie
* de instrucciones JavaScript en la página de cliente que serán ejecutadas antes de proceder al envío de  la 
* petición. Pero para que esto suceda será necesario habilitar la validación en cliente añadiendo la siguiente
* acción html en cualquier parte de la página:

* <html:javascript formName="objeto_form"/>

* La acción deberá indicar a través del atributo formName el nombre del objeto ValidatorForm.
* Así mismo, desde el manejador del evento onsubmit del formulario se deberá incluir una llamada a la función
* JavaScript encargada de desencadenar el proceso de vaidación. Dado que esta función se genera de forma
* dinámica, su nombre tendrá el formato validateObjetoForm, siendo ObjetoForm el nombre del objeto ValidatorForm

--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Formulario de autenticación</h1>

        <html:javascript formName="ValidacionForm"/>     

        <html:form action="/validar" method="post" onsubmit="return validateValidacionForm(this);">   
            <table>
                <tr> 
                    <td> Usuario: </td>
                    <td> <html:text property="usuario"/></td>
                </tr>
                <tr>
                    <td> Password : </td>
                    <td> <html:text property="password"/></td>
                </tr>
                <tr>
                    <td> <html:submit property="submit" value="Validar"/>
                        <html:reset value="Limpiar" />    
                    </td>
                </tr>
            </table>
        </html:form>
    </body>
</html>
