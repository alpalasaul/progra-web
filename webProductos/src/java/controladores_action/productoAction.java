/*
 * Tema: Análisis del API de Struts - Interacción con MySQL DB
 * Julio César Mendoza
 * 
 * Proyecto: webProductos
 * Paquete: controladores_action
 * Archivo: productoAction.java
 *
 * En el paquete controladores_action se colocan las clases que procesan las peticiones 
 * que llegan al controlador.
 * 
 * Por ejemplo: La clase productoAction mediante el metodo execute procesa la ejecución
 * hacia el archivo "gestionProductos.java" (paquete modelo) y luego redirecciona su
 * respuesta al archivo "productos.jsp" (archivo de vista).
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
public class productoAction extends Action {

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {

        String driver = this.getServlet().getServletContext().getInitParameter("driver");
        String cadena_conexion = this.getServlet().getServletContext().getInitParameter("cadena_conexion");

        seleccionForm pb = (seleccionForm) form;
        gestionProductos gp = new gestionProductos(driver, cadena_conexion);

        // Obtiene el código de la categoria seleccionada en "seleccionForm"
        //Consulta todos los productos por la código de categoria seleccionado, en la clase "gestionProductos"
        // y luego copia todos los resultados en el atributo "productos"
        request.setAttribute("productos", gp.consulta_producto(pb.getCodigo_cat()));

        // redirecciona la respuesta al archivo "producto.jsp"
        return mapping.findForward("productojsp");
    }
}
