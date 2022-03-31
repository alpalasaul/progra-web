/* Programación Web:
 * Julio César Mendoza
 * Tema: API de Struts - Validaciones predefinidas en Struts
 *
 * Proyecto: webControlDatosUsuario
 * Paquete:  servlets_form
 * Clase:    RegistroForm2.java
 *
 */
package servlets_form;

import org.apache.struts.action.*;

public class RegistroForm2 extends ActionForm {

    private String nombre;
    private String apellido;
    private String usuario;
    private String password;
    private String email;

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
