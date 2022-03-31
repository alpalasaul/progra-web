/* Programacion web
*  Tema: API Struts - Class DispatchAction
*  Julio César Mendoza T.

*  Proyecto: EjemploDispatcher
*  Paquete: modelo
*  Clase: OperacionesAction.java
*  
*  La clase DispatchAction es una subclase de Action que permite definir en la misma clase diferentes métodos
*  para tratar un grupo de peticiones similares, evitando tener que crear una clase para la gestión de cada 
*  acción. En el presente ejemplo, en vez de implementar cuatro subclases de Action para su tratamiento,
*  crearemos una única subclase de DispatchAction con cuatro métodos que asociaremos a cada una de estas
*  peticiones. Será a través de un parametro enviado a la petición como el método execute() podrá determinar 
*  cuál de los métodos definidos en la clase para la gestión de las acciones ha de ser ejecutado. El nombre 
*  de este parámetro será elegido por el programador y su valor en cada petición tendrá que coincidir 
*  exactamente con el nombre del método que se quiera ejecutar
 */
package controlador_action;

import javax.servlet.http.*;
import org.apache.struts.action.*;
import org.apache.struts.actions.*;
import servlets_form.*;
import modelo.*;
import excepciones.*;

public class OperacionesAction extends DispatchAction {

    public ActionForward sumar_numeros(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        Numeros n = (Numeros) form;
        OperacionesBasicas2 op = new OperacionesBasicas2();

        request.setAttribute("resultado", op.suma(n));
        return mapping.findForward("Basica");
    }

    public ActionForward restar_numeros(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        Numeros n = (Numeros) form;
        OperacionesBasicas2 op = new OperacionesBasicas2();
        request.setAttribute("resultado", op.resta(n));
        return mapping.findForward("Basica");
    }

    public ActionForward multiplicar_numeros(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)
            throws DivisionCeroExcepcion {
        Numeros n = (Numeros) form;
        OperacionesBasicas2 op = new OperacionesBasicas2();
        request.setAttribute("resultado", op.multiplicacion(n));
        return mapping.findForward("Basica");
    }

    public ActionForward dividir_numeros(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)
            throws DivisionCeroExcepcion {

        // Si existen un error se dirige a DivisionCeroExcepcion
        Numeros n = (Numeros) form;
        OperacionesBasicas2 op = new OperacionesBasicas2();

        try {
            int valor = op.division(n);
            request.setAttribute("resultado", valor);
        } catch (Exception e) {
            throw new DivisionCeroExcepcion();
        }

        return mapping.findForward("Basica");

    }
}
