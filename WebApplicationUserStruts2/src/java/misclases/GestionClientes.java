/* Programación web
 * Tema: Struts 2 - Archivos de configuración
 * Julio César Mendoza T
 *
 * Proyecto: webUsuarios2
 * Paquete: misclases
 * Archivo: GestionClientes.java
 */
package misclases;

import java.sql.*;

public class GestionClientes {

    Datos dt;

    public GestionClientes(String driver, String cadenacon) {
        dt = new Datos(driver, cadenacon);
    }

    public boolean validar(String user, String pwd) {
        boolean estado = false;

        try {
            Connection cn = dt.getConexion();

            //instruccion SQL para obtener los datos del usuario indicado
            String query = "select * from cliente ";
            query += "where password= '" + pwd;
            query += "' and usuario= '" + user + "'";

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

}
