/*
 * Tema: Análisis del API de Struts - Interacción con MySQL DB
 * Julio César Mendoza
 * 
 * Proyecto: webProductos
 * Paquete: controladores_form
 * Archivo: categoriaForm.java
 *
 * En el paquete controladores_form se colocan las clases que capturan los datos de usuario
 * Por ejemplo: La clase categoriaForm captura todas los codigos de las categorias provenientes 
*  de categoria.jsp
 */

package controladores_form;
import java.util.*;
import org.apache.struts.action.*;

public class categoriaForm extends ActionForm {
    
   
    private String bandera = "Bienvenidos al Sistema de Consultas";
    
     // almacena el codigo de las categorias
    private ArrayList<String> codigocategoria;
    
    private List<String> testCode = Arrays.asList("me", "la","suda");

    public List<String> getTestCode() {
        return testCode;
    }

    public void setTestCode(List<String> testCode) {
        this.testCode = testCode;
    }    
       
    public ArrayList<String> getCodigocategoria(){
        return codigocategoria;
    }
   
    public void setCodigocategoria(ArrayList<String> codigocategoria){
        this.codigocategoria = codigocategoria;
    }

    public String getBandera(){
          return bandera;
    }
   
    public void setBandera(String bandera){
        this.bandera = bandera;
    }
}
