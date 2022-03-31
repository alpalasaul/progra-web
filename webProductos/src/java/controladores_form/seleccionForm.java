/*
 * Tema: Análisis del API de Struts - Interacción con MySQL DB
 * Julio César Mendoza
 * 
 * Proyecto: webProductos
 * Paquete: controladores_form
 * Archivo: categoriaForm.java
 *
 * En el paquete controladores_form se colocan las clases que capturan los datos de usuario
 * Por ejemplo: La clase seleccionForm captura el codigo de una categoria seleccionada
 */
package controladores_form;

import org.apache.struts.action.*;

public class seleccionForm extends ActionForm {

    private String codigo_cat;

    public String getCodigo_cat() {
        return codigo_cat;
    }

    public void setCodigo_cat(String codigo_cat) {
        this.codigo_cat = codigo_cat;
    }
}
