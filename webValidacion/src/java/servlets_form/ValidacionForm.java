/*
* Programacion Web
* Tema: API de Struts - Validación en el cliente
* Julio César Mendoza T.
*
* Paquete: servlets_form
* Clase: ValidacionForm.java
* La clase ValidacionForm que encapsula las credenciales del usuario deberá heredar de ValidatorForm 
* en vez de ActionForm, mantenimiento por lo demás los mismos datos miembro y métodos set/get que antes
 */
package servlets_form;

import org.apache.struts.validator.*;

public class ValidacionForm extends ValidatorForm {

    private String usuario;
    private String password;

    public String getUsuario() {
        return usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
