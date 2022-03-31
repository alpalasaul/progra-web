/*
 * Programación web
 * Tema: Modelo Vista Controlador utilizando Framework Struts (Introducción)
          
 * Julio César Mendoza T.
 * 
 * Proyecto: webOperaciones
 * Paquete: modelo
 * Clase: OperacionesBasicas.java
 *
 * En el paquete modelo se colocan todas la clase que encapsula la lógica del 
 * negocio de la aplicación, incluyendo el acceso a los datos y su manipulación
 */
package modelo;

import controladores_form.*;

public class OperacionesBasicas {

    public OperacionesBasicas() {
    }

    public int suma(ValidacionForm vf) {
// 1. Recupera los valores capturados por el controlador "ValidacionForm" y
// procesados por el controlador "OperacionAction"

        return (Integer.parseInt(vf.getNumero1()) + Integer.parseInt(vf.getNumero2()));
    }
}
