/*
 * Programación web
 * Tema: Modelo Vista Controlador utilizando Framework Struts (Introducción)
         Interacción  con base de datos MySQL

 * Julio César Mendoza T.
 * 
 * Proyecto: webClientes
 * Paquete: controladores_form
 * Clase: ValidacionForm.java
 *
 * En el paquete controladores_form se colocan las clases que capturan los
 * datos del usuario. Por ejemplo: La clase ValidacionForm captura y encapsula
 * los datos provenientes del formulario de ingreso "login.jsp" (archivo vista) 
 */


package controladores_form;
import org.apache.struts.action.*;

/**
 *
 * @author User
 */
public class ValidacionForm extends ActionForm {
   // datos miembro
    private String usuario;
    private String password;
    
    //métodos de acceso
    public String getUsuario(){
      return usuario;    
    }
    
    public void setUsuario(String nombre){
        this.usuario = nombre;
    }
    
    public String getPassword(){
        return password;
    }
    
    public void setPassword(String password){
        this.password = password;
    }
}
