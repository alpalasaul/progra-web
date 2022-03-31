/* Programación web
 * Tema: Struts 2 - Archivos de configuración
 * Julio César Mendoza T
 *
 * Proyecto: webAplicacionStruts2
 * Paquete: miejemplo
 * Clase: Saludo.java
 */
package miejemplo;

import java.util.Date;

public class Saludo {

    public static final String texto = "Bienvenido a Struts 2";
    private String mensaje;

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }

    public String getFechaHora() {
        return new Date().toString();
    }

    public String execute() throws Exception {
        setMensaje(texto);
        return "ok";
    }
}
