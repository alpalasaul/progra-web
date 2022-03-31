/*
 * Programación web
 * Tema: Modelo Vista Controlador utilizando Framework Struts (Introducción)
         Interacción con base de datos MYSQL
          
 * Julio César Mendoza T.
 * 
 * Proyecto: webClientes
 * Paquete: modelo
 * Clase: GestionClientes.java
 *
 * En el paquete modelo se colocan todas la clase que encapsula la lógica del 
 * negocio de la aplicación, incluyendo el acceso a los datos y su manipulación.
 * Por ejemplo la clase Datos permite realizar la apertura y cierre de una
 * conexión a una base de datos
 */
package modelo;

import java.sql.*;

public class Datos {

    private String driver;
    private String cadenacon;

    public Datos() {
    }

    public Datos(String driver, String cadenacon) {
// almacena los datos para la conexión con la base de datos

        this.driver = driver;
        this.cadenacon = cadenacon;
    }

    public Connection getConexion() {
        Connection cn = null;
        try {
            Class.forName(driver).newInstance();
            cn = DriverManager.getConnection(cadenacon, "root", "root");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return cn;
    }

    public void cierraConexion(Connection cn) {
        try {
            if (cn != null && !cn.isClosed()) {
                cn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
