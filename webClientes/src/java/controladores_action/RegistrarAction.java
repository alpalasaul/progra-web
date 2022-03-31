/*
 * Programación web
 * Tema: Modelo Vista Controlador utilizando Framework Struts - 
         Interacción con base de datos MYSQL
          
 * Julio César Mendoza T.
 * 
 * Proyecto: webClientes
 * Paquete: controladores_action
 * Clase: RegistrarAction.java
 *
 *  En el paquete controladores_action se colocan las clases que procesa las
 *  peticiones que llegan al controlador. 

* Por ejemplo: La clase RegistrarAction mediante el método execute 
* procesa la ejecución  hacia el archivo "GestionClientes. java" (paquete modelo) y
* luego redirecciona la respuesta al archivo "login.jsp"  (archivo de vista)".  
* 
 */
package controladores_action;

import javax.servlet.http.*;
import org.apache.struts.action.*;
import modelo.*;
import controladores_form.*;
import java.io.*;

/**
 *
 * @author User
 */
public class RegistrarAction extends Action {

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        String driver = this.getServlet().getServletContext().getInitParameter("driver");
        String cadenacon = this.getServlet().getServletContext().getInitParameter("cadenacon");

        GestionClientes gc = new GestionClientes(driver, cadenacon);
        RegistroForm rf = (RegistroForm) form;

        gc.registrar(rf);

        return mapping.findForward("login");

    }
}
