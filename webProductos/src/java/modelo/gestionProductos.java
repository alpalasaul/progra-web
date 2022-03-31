/*
 * Tema: Análisis del API de Struts - Interacción con MySQL DB
 * Julio César Mendoza
 * 
 * Proyecto: webProductos
 * Paquete: modelo
 * Archivo: gestionProductos.java
 *
 * En el paquete modelo se colocan las clases que pertenecen a la lógica del negocio
 * 
 * Por ejemplo: La clase "gestionProductos" realiza las consultas de las categorias
*  y productos de la aplicación
 */
package modelo;

import java.util.*;
import java.sql.*;
import controladores_form.*;

/**
 *
 * @author User
 */
public class gestionProductos {

    modelo.conexionDB con;

    public gestionProductos(String driver, String cadena_conexion) {
        con = new conexionDB(driver, cadena_conexion);
    }

    // Devuelve en una arreglo de tipo string, todos los codigos de las categorias
    public ArrayList<String> consulta_categoria() {

        ArrayList<String> conjunto_categoria = new ArrayList<>();

        try {
            Connection cn = con.getConexion();
            Statement st = cn.createStatement();
            String cadenaSQL = "select categoria_id from categoria";
            ResultSet rs = st.executeQuery(cadenaSQL);

            while (rs.next()) {

                conjunto_categoria.add(rs.getString("categoria_id"));
                //  System.out.println(rs.getString("categoria_id"));
            }

            con.cierraConexion(cn);

        } catch (Exception e) {
            e.printStackTrace();

        }

        return conjunto_categoria;

    }

    // Devuelve en un arreglo de tipo "productoBean" todos los productos de una
    // determinada categoría
    public ArrayList<productosBean> consulta_producto(String categoria_codigo) {

        ArrayList<productosBean> conjunto_productos = new ArrayList<>();

        try {
            Connection cn = con.getConexion();
            Statement st = cn.createStatement();
            String cadenaSQL = "select a.categoria_id, b.categoria_nombre, a.producto_id, a.producto_nombre, a.producto_precio, a.producto_stock from producto a, categoria b where a.categoria_id = '" + categoria_codigo + "' and a.categoria_id = b.categoria_id ";
            ResultSet rs = st.executeQuery(cadenaSQL);

            while (rs.next()) {

                // Para cada producto asociado a una categoria crea un javabean "productosBean"
                // y lo llena con los datos del mismo
                productosBean prod = new productosBean();

                prod.setId_categoria(rs.getString("categoria_id"));
                prod.setNombre_categoria(rs.getString("categoria_nombre"));
                prod.setId_producto(rs.getString("producto_id"));
                prod.setNombre_producto(rs.getString("producto_nombre"));
                prod.setPrecio_producto(rs.getInt("producto_precio"));
                prod.setStock_producto(rs.getInt("producto_stock"));

                conjunto_productos.add(prod);
            }

            con.cierraConexion(cn);

        } catch (Exception e) {
            e.printStackTrace();

        }

        return conjunto_productos;

    }

}
