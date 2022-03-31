/*
* Programación web
* Tema: Modelo Vista Controlador utilizando Framework Struts (Introducción)
*
* Julio César Mendoza T.
* 
* Proyecto: webOperaciones
* Paquete: controladores_action
* Clase: OperacionAction.java
*
* En el paquete controladores_action se colocan las clases que procesan las 
* peticiones que llegan al controlador. 

* Por ejemplo: La clase OperacionAction mediante el método execute 
* procesa la ejecución  hacia el archivo "OperacionesBásicas. java" (paquete modelo) y
* redirecciona la respuesta al archivo "resultado.jsp" (archivo de vista)"

 */
package controladores_action;

import javax.servlet.http.*;
import org.apache.struts.action.*;
import modelo.*;
import controladores_form.*;

public class OperacionAction extends Action {

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {

        // 1. Declara una variable op para acceder a los métodos y propiedades de la clase del
        // paquete modelo : "Operaciones Básicas.java"
        OperacionesBasicas op = new OperacionesBasicas();

        //2. Declara una variable vf para acceder a los métodos y propiedades de la clase del 
        // paquete controladores_form : "ValidacionForm.java"
        ValidacionForm vf = (ValidacionForm) form;

        // 3. Invoca al método suma() del paquete modelo y como parametro encapsula a la variable vf
        // 4. El valor resultante de la operacion suma es depositado en el atributo de la petición "respuesta"
        request.setAttribute("respuesta", op.suma(vf));

        // 5. Redirecciona la respuesta al atributo (name):  "resultado"
        // El nombre lógico o atributo (name) esta asociado al archivo de vista : resultado.jsp
        // cuya definicion se encuentra en el archivo struts-config.xml
        return mapping.findForward("resultado");
    }    
}
