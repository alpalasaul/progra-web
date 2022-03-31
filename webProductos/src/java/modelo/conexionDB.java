/*
 * Tema: Análisis del API de Struts - Interacción con MySQL DB
 * Julio César Mendoza
 * 
 * Proyecto: webProductos
 * Paquete: modelo
 * Archivo: conexionDB.java
 *
 * En el paquete modelo se colocan las clases que pertenecen a la lógica del negocio
 * 
 * Por ejemplo: La clase conexionDB, obtiene y cierra una conexion con la DB
 */
package modelo;

import java.sql.*;

public class conexionDB {

    private String driver;
    private String cadenacon;

    public conexionDB() {
    }

    public conexionDB(String driver, String cadena_conexion) {
// almacena los datos para la conexión con la base de datos

        this.driver = driver;
        this.cadenacon = cadena_conexion;
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
