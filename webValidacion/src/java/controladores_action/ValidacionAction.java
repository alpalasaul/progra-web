/*
* Programación Web
* Tema: API de Struts - Validación en el cliente
* Julio César Mendoza T.
*
* Paquete: controladores_action
* Clase: ValidacionAction.java
*
 */
package controladores_action;

import javax.servlet.http.*;
import org.apache.struts.action.*;

public class ValidacionAction extends Action {

    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        // Aqui se tendría que realizar la llamada a los metodos del modelo que permiten el registro de los datos 
        return mapping.findForward("autenticacion");
    }
}
