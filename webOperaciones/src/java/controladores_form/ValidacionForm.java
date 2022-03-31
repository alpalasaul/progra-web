/*
 * Programación web
 * Tema: Modelo Vista Controlador utilizando Framework Struts (Introducción)

 * Julio César Mendoza T.
 * 
 * Proyecto: webOperaciones
 * Paquete: controladores_form
 * Clase: ValidacionForm .java
 *
 * En el paquete controladores_form se colocan las clases que capturan los
 * datos del usuario. Por ejemplo: La clase ValidacionForm captura y encapsula
 * los datos provenientes del formulario de ingreso (webIngreso.jsp) 
 */
package controladores_form;

import org.apache.struts.action.*;

public class ValidacionForm extends ActionForm {

    private String numero1;
    private String numero2;

    public String getNumero1() {
        return numero1;
    }

    public void setNumero1(String numero1) {
        this.numero1 = numero1;
    }

    public String getNumero2() {
        return numero2;
    }

    public void setNumero2(String numero2) {
        this.numero2 = numero2;
    }
}
