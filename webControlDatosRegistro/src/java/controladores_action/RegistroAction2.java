/* Programación Web:
 * Julio César Mendoza
 * Tema: API de Struts - Validaciones predefinidas en Struts
 *
 * Proyecto: webControlDatosUsuario
 * Paquete:  controladores_Action
 * Clase:    RegistroAction2.java
 */
package controladores_action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.*;

public class RegistroAction2 extends Action {

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {

        String mensaje = "Datos validados en la clase RegistroForm, antes de ser enviados al modelo....";
        request.setAttribute("mensaje", mensaje);

        // Aqui se tendría que realizar la llamada a los metodos del modelo que permiten el registro de los datos
        return mapping.findForward("Registro");
    }

}
