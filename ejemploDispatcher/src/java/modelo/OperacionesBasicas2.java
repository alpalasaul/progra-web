/* Programacion web
*  Tema: API Struts - Class DispatchAction
*  Julio César Mendoza T.

*  Proyecto: EjemploDispatcher
*  Paquete: modelo
*  Clase: OperacionesBasicas.java
*  En esta clase se encapsula la lógica del negocio representada por las cuatro
   operaciones básicas
 */
package modelo;

import servlets_form.*;

public class OperacionesBasicas2 {

    public int suma(Numeros n) {
        return (n.getNumero1() + n.getNumero2());
    }

    public int resta(Numeros n) {
        return (n.getNumero1() - n.getNumero2());
    }

    public int multiplicacion(Numeros n) {
        return (n.getNumero1() * n.getNumero2());
    }

    public int division(Numeros n) {
        return (n.getNumero1() / n.getNumero2());
    }

}
