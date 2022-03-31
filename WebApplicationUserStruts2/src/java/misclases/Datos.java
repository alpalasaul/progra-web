/* Programación web
 * Tema: Struts 2 - Archivos de configuración
 * Julio César Mendoza T
 *
 * Proyecto: webUsuarios2
 * Paquete: misclases
 * Archivo: Datos.java
 */
package misclases;

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
