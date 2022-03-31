/* Programación web
 * Tema: Struts 2 - Archivos de configuración
 * Julio César Mendoza T
 *
 * Proyecto: webUsuarios2
 * Paquete: misclases
 * Archivo: Validacion.java
 */
package misclases;

import org.apache.struts2.interceptor.*;
import org.apache.struts2.util.*;
import javax.servlet.http.*;
import javax.servlet.*;

public class Validacion implements ServletRequestAware, ServletContextAware {

    String pwd;
    String user;
    ServletContext context;

    // métodos de acceso a las propiedades usr y pwd
    public String getUser() {
        return user;
    }

    public String getPwd() {
        return pwd;
    }

    // métodos de las interfaces asociadas al interceptor
    @Override
    public void setServletRequest(HttpServletRequest request) {
        pwd = request.getParameter("password");
        user = request.getParameter("username");
    }

    @Override
    public void setServletContext(ServletContext context) {
        this.context = context;
    }

    public String execute() throws Exception {
        String driver = context.getInitParameter("driver");
        String cadenacon = context.getInitParameter("cadenacon");
        GestionClientes gc = new GestionClientes(driver, cadenacon);

        if (gc.validar(user, pwd)) {
            return "ok";
        } else {
            return "error";
        }
    }
}
