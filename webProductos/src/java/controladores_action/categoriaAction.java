/*
 * Tema: Análisis del API de Struts - Interacción con MySQL DB
 * Julio César Mendoza
 * 
 * Proyecto: webProductos
 * Paquete: controladores_action
 * Archivo: categoriaAction.java
 *
 * En el paquete controladores_action se colocan las clases que procesan las peticiones 
 * que llegan al controlador.
 * 
 * Por ejemplo: La clase categoriaAction mediante el metodo execute procesa la ejecución
 * hacia el archivo "gestionProductos.java" (paquete modelo) y luego redirecciona su
 * respuesta al archivo "categoria.jsp" (archivo de vista).
 */
package controladores_action;

import javax.servlet.http.*;
import org.apache.struts.action.*;
import controladores_form.*;
import modelo.*;

public class categoriaAction extends Action {

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {

        String driver = this.getServlet().getServletContext().getInitParameter("driver");
        String cadena_conexion = this.getServlet().getServletContext().getInitParameter("cadena_conexion");

        categoriaForm cb = (categoriaForm) form;
        gestionProductos gp = new gestionProductos(driver, cadena_conexion);

        // consulta todas los codigo de las categorias en la clase "gestionProductos" (paquete modelo) 
        //para luego depositarlas en el archivo "categoriaForm (propiedad codigocategoria) "
        cb.setCodigocategoria(gp.consulta_categoria());

        // redirecciona la respuesta al archivo categoria.jsp
        return mapping.findForward("categoriajsp");

    }
}
