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
*   peticion que llegan al controlador. 

* Por ejemplo: La clase ValidarAction mediante el método execute 
* procesa la ejecución  hacia el archivo "GestionClientes. java" (paquete modelo)
* y luego redirecciona al archivo "bienvenida.jsp" o al archivo "error.jsp"
* 
*
 */
package controladores_action;

import javax.servlet.http.*;
import org.apache.struts.action.*;
import controladores_form.*;
import modelo.*;

/**
 *
 * @author User
 */
public class ValidarAction extends Action {

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        //obtenemos los datos de la conexion con la base de datos (driver y cadenaconexion) de los
        //parametros de contexto definidos en el archivo web.xml

        String driver = this.getServlet().getServletContext().getInitParameter("driver");
        String cadenacon = this.getServlet().getServletContext().getInitParameter("cadenacon");
        GestionClientes gc = new GestionClientes(driver, cadenacon);

        ValidacionForm vf = (ValidacionForm) form;

        // invoca al método validar() del modelo para saber si el usuario está o no está registrado
        if (gc.validar(vf)) {
            return mapping.findForward("bienvenida");
        } else {
            return mapping.findForward("error");
        }

    }

}
