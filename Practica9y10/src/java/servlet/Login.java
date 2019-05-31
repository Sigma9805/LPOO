
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class AdminLogin extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String user = request.getParameter("user");
        String pass = request.getParameter("pass");
        String type = request.getParameter("type");
        
       Administration admin = new Administration(user, pass);
      
       
       if(admin.checkUsersList()){
       
           PrintWriter out = response.getWriter();
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title></title>");
                out.println("</head>");
                out.println("<body>");
                out.println("<h1>");
                out.println("Bienvenido " + type);
                out.println("</h1>");
                out.println("</body>");
                out.println("</html>");
                
       
       
       }
       
       else{
                PrintWriter out = response.getWriter();
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title></title>");
                out.println("</head>");
                out.println("<body>");
                out.println("<h1>");
                out.println("Contraseña incorrecta");
                out.println("</h1>");
                out.println("<a href = loginAdmin.html>");
                out.println("Try again");
                out.println("</a>");
                out.println("</body>");
                out.println("</html>");
       
       }
    }

    
    

}
