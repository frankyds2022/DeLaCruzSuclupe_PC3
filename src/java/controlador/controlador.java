
package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.area;
import modelo.rol;
import modeloDAO.areaDao;
import modeloDAO.rolDao;


public class controlador extends HttpServlet {

String listar="vistas/listar.jsp";
    String add="vistas/add.jsp";
    String editar="vistas/editar.jsp";
    rol r=new rol();
    rolDao dao=new rolDao();
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet controlador</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet controlador at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
  String acceso="";
  String action=request.getParameter("accion");
        if (action.equalsIgnoreCase("listar")) {
            acceso=listar;
            
 }else if(action.equalsIgnoreCase("add")){
         

            acceso=add;
        }
        else if(action.equalsIgnoreCase("agregar")){
            String id_rol=request.getParameter("id_rol");
            String nombre=request.getParameter("nombre");
            
             String id_area=request.getParameter("Area");
            r.setId_rol(id_rol);
            r.setNombre(nombre);
            r.setid_area(id_area);
            dao.add(r);
            acceso=listar;
        }
        
        
   RequestDispatcher vista=request.getRequestDispatcher(acceso);
   vista.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
