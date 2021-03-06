<%-- 
 * Tema: Análisis del API de Struts - Interacción con MySQL DB
 * Julio César Mendoza
 * 
 * Proyecto: webProductos
 * Archivo: producto.jsp (archivo de vista)
--%>

<%@page contentType="text/html" %>
<%@page pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>

<%@ page import="java.util.*, controladores_form.* " %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Consulta solicitada ....</title>
    </head>
    <body>

        <% ArrayList<productosBean> productos = (ArrayList) request.getAttribute("productos"); %>


        <h1> Listado de productos </h1>

        <table border="1" width="60%">
            <th> Categoria_Id </th>
            <th> Categoria    </th>
            <th> Producto_Id  </th>
            <th> Producto     </th>
            <th> Precio       </th>
            <th> Stock        </th>

            <% for (int i = 0; i < productos.size(); i++) {
                    productosBean prod = productos.get(i);%>

            <tr>   
                <td><%= prod.getId_categoria()%></td>
                <td><%= prod.getNombre_categoria()%></td>
                <td><%= prod.getId_producto()%></td>
                <td><%= prod.getNombre_producto()%></td>
                <td><%= prod.getPrecio_producto()%></td>
                <td><%= prod.getStock_producto()%></td>

            </tr>
            <% }%>

        </table>
    </p>
</p>

</body>
</html>
