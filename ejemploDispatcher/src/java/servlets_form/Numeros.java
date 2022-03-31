/* Programación Web
*  Tema: API de Struts - La clase DispatchAction 
*  Julio César Mendoza T.
*
*  Proyecto: EjemploDispatcher
*  Paquete: servlets_form
*  Clase: Numeros.java
*  Esta clase es un servlet que captura los datos de entrada de usuario
 */
package servlets_form;

import org.apache.struts.action.*;

public class Numeros extends ActionForm {

    private int numero1;
    private int numero2;
    private String operacion;

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }

    public int getNumero1() {
        return numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public String getOperacion() {
        return operacion;
    }
}
