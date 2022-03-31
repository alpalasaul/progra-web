/* Programación Web:
 * Julio César Mendoza
 * Tema: API de Struts - Clase ActionErrors y ActionMessage
 *
 * Proyecto: webControlDatosRegistro
 * Paquete:  servlets_form
 * Clase:    RegistroForm.java
 *
 * La clase ActionErrors encapsula los mensajes de error generados en el interior del método validate()
 * de un ActionForm. Cada error está descrito a su vez mediante un objeto ActionMessage, el cual 
 * encapsula la clave del mensaje de error asociado. Los mensajes de error con sus claves
 * correspondientes se registran en el archivo ApplicationResource.properties
*/
package servlets_form;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.*;

public class RegistroForm extends ActionForm {
    private String nombre;
    private String apellido;
    private String usuario;
    private String password;
    private String passwordrep;
    private String email;
    
    public String getNombre(){  return nombre; }
    public String getApellido(){  return apellido; }
    public String getUsuario(){  return usuario; }
    public String getPassword(){  return password; }
    public String getPasswordrep(){  return passwordrep; }
    public String getEmail(){  return email; }
    
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setApellido(String apellido) { this.apellido = apellido; }
    public void setUsuario(String usuario) { this.usuario = usuario; }
    public void setPassword(String password) { this.password = password; }
    public void setPasswordrep(String passwordrep) { this.passwordrep = passwordrep; }
    public void setEmail(String email) { this.email= email; }
    
    public ActionErrors validate(ActionMapping mapping, HttpServletRequest req) {
       ActionErrors errors = new ActionErrors();
       
       //comprueba si se ha suministrado un valor para el campo usuario
       if (usuario==null || usuario.equals("")) { errors.add("usuario",new ActionMessage("error.usuario")); }
    
       //comprueba si se ha suministrado un valor para el campo password
       if (password==null || password.equals("")) { errors.add("password",new ActionMessage("error.password")); }    
       
       //comprueba si el password introducido en segundo lugar coincide con el primero
       if (!password.equals(passwordrep)) { errors.add("passwordrep",new ActionMessage("error.password.rep")); }
    
       //comprueba si se ha suministrado un valor para el campo email es válida
       if (email.indexOf("@")== -1) { errors.add("email",new ActionMessage("error.email")); }  
       
       return errors;
    } }