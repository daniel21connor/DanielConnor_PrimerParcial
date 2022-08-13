
package Servlets;


import Clases.MaestroModell;
import Clases.RegistroMaestro;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "MaestroControl", urlPatterns = {"/New"})
public class MaestroControl extends HttpServlet {

  MaestroModell libros;
RegistroMaestro registroLibros;
  MaestroModell [] LibrossRegistrados;
    
    
    
    
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter respuesta = response.getWriter()) {
           libros=new MaestroModell(
                request.getParameter("codigo"),
                request.getParameter("nombre"),
                  request.getParameter("apellido"),
                    request.getParameter("libro"),
                    request.getParameter("code"),
                    request.getParameter("clase")
              
            );               
            
            if(registroLibros==null){
                 registroLibros=new RegistroMaestro();
            }
           
             registroLibros.guardarLibros( libros);//almacenarlo en el array
            LibrossRegistrados=  registroLibros.getLibros();
           respuesta.println("<!DOCTYPE html>");
            respuesta.println("<html>");
            respuesta.println("<head>");
            respuesta.println("<title>Servlet NewServlet</title>");   
            respuesta.println("<link rel='stylesheet' href='https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css' integrity='sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N' crossorigin='anonymous'>");
            respuesta.println("<script src='https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js' integrity='sha384-Fy6S3B9q64WdZWQUiU+q4/2Lc9npb8tCaSX9FK7E8HnRr0Jz8D6OP9dO5Vg3Q9ct' crossorigin='anonymous'></script>");
            respuesta.println("</head>");
            respuesta.println("<body>");           
            respuesta.println("<div class='container'>");
             respuesta.println("<br><h1>            Registro De Libros   </h1><br>");  
            respuesta.println("<form name='nombreForm'>");
            respuesta.println("<div class='container-lg d-flex'> <a href='index.html' class=\"btn btn-outline-info ml-auto\">Registrar Nuevo MAESTRO</a></div><br>");
                respuesta.println("<div class='container-lg d-flex'> <a href='newhtml.html' class=\"btn btn-outline-info ml-auto\">Registrar LIBRO</a></div><br>");
            respuesta.println("<table class=\"table table-hover table-striped\">");   
            respuesta.println("<thead><tr> <th scope=\"col\">CODIGO DEL Maestro</th>\n"+ "<th scope=\"col\">NOMBRE DEL MAESTRO</th>\n"+
                    "<th scope=\"col\">APELLIDO DEL MAETRO</th>\n"+
                                "<th scope=\"col\">  NOMBRE DEL LIBRO</th>\n" + "<th scope=\"col\">CODIGO DEL LIBRO</th>\n" +
                                "<th scope=\"col\">CLASE</th> \n" +
                             " </tr></thead>");  
            respuesta.println("<tbody>");
            for (int i = 0; i < LibrossRegistrados.length; i++){
                    if(LibrossRegistrados[i].getCodigo().isEmpty()){
                       respuesta.println("<tr><td>" + LibrossRegistrados[i].getCodigo()+ "</td>");
                       respuesta.println("<td>" + LibrossRegistrados[i].getNombre() + "</td>");
                       respuesta.println("<td>" +LibrossRegistrados[i].getApellido()+ "</td>");
                       respuesta.println("<td>" + LibrossRegistrados[i].getNombreDelLibro()+ "</td>");
                          respuesta.println("<td>" + LibrossRegistrados[i].getCodigoDelLibro()+ "</td>");
                          respuesta.println("<td>" + LibrossRegistrados[i].getClase()+ "</td>");
                           respuesta.println("<td>");    
                           
                    }
                }
            respuesta.println("</tbody></table>");
            respuesta.println("</div>");
            respuesta.println("</form>");
            respuesta.println("</body>");
            respuesta.println("</html>");
        }
    }
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
