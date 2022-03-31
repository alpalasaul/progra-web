/*
 * Programación web
 * Tema: Modelo Vista Controlador utilizando Framework Struts (Introducción)
         Interacción  con base de datos MySQL

 * Julio César Mendoza T.
 * 
 * Proyecto: webClientes
 * Paquete: controladores_form
 * Clase: RegistroForm.java
 *
 * En el paquete controladores_form se colocan las clases que capturan los datos del usuario. 
 * Por ejemplo: La clase RegistroForm captura y encapsula los datos provenientes del formulario 
 * de ingreso "registro.jsp" (archivo vista)
 */

package controladores_form;
import org.apache.struts.action.*;

public class RegistroForm extends ActionForm {
    //datos miembro
    private String nombre;
    private String apellidos;
    private String usuario;
    private String password;
    private String email;
    
    // métodos de acceso
    
    public String getNombre(){
        return nombre;
     }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
            
    public String getApellidos(){
        return apellidos;
    }

    public void setApellidos(String apellidos){
        this.apellidos=apellidos;
    }
    
    public String getUsuario(){
        return usuario;
     }

    public void setUsuario(String usuario){
        this.usuario = usuario;
    }
    
     public String getPassword(){
        return password;
     }

    public void setPassword(String password){
        this.password = password;
    }
    
    public String getEmail(){
        return email;
     }
    
    public void setEmail(String email){
        this.email = email ;
    }
}
