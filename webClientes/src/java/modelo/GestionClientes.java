/*
 * Programación web
 * Tema: Modelo Vista Controlador utilizando Framework Struts (Introducción)
          
 * Julio César Mendoza T.
 * 
 * Proyecto: webClientes
 * Paquete: modelo
 * Clase: GestionClientes.java
 *
 * En el paquete modelo se colocan todas la clase que encapsula la lógica del 
 * negocio de la aplicación, incluyendo el acceso a los datos y su manipulación.
 * Por ejemplo la clase GestionClientes tienes dos procedimientos: validar() y registrar ()
 */
package modelo;

import java.sql.*;
import controladores_form.*;

public class GestionClientes {

    Datos dt;

    public GestionClientes(String driver, String cadenacon) {
        dt = new Datos(driver, cadenacon);
    }

    public boolean validar(ValidacionForm vf) {
        boolean estado = false;

        try {
            Connection cn = dt.getConexion();

            //instruccion SQL para obtener los datos del usuario indicado
            String query = "select * from cliente ";
            query += "where password= '" + vf.getPassword();
            query += "' and usuario='" + vf.getUsuario() + "'";

            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(query);
            estado = rs.next();
            dt.cierraConexion(cn);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            return estado;
        }
    }

    public void registrar(RegistroForm rf) {
        // genera la instruccion SQL de insercion 

        String query = "insert into cliente ";
        query += "values('" + rf.getNombre() + "','" + rf.getApellidos() + "','" + rf.getUsuario() + "','" + rf.getPassword() + "','" + rf.getEmail() + "')";

        System.out.print(query);

        try {
            int i;
            Connection cn = dt.getConexion();
            Statement st = cn.createStatement();
            i = st.executeUpdate(query);
            st.close();
            dt.cierraConexion(cn);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
