
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class UserRegister extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String user = request.getParameter("user");
        String password = request.getParameter("password");
        String email = request.getParameter("email");
        String type = request.getParameter("type");
        String adminequals = "admin";
        String normalequals = "normal";
        String guestequals = "guest";
        
        Factory user = Factory.getInstance();
               
        if("admin".equals(type)){
        String userAdmin = request.getParameter("user");
        String userId = request.getParameter("userid");
        User admin = user.creatUser(type);
        admin = new Administration(user, password, email, type, userAdmin, userId);
        admin.addUsers();
        PrintWriter out = response.getWriter();
         
         out.println("<!DOCTYPE html>");
         out.println("<html>");
         out.println("<head>");
         out.println("<meta charset=\"UTF-8\">");
         out.println("<tittle>");
         out.println("Signed up!");
         out.println("</tittle>");
         out.println("</head>");
         out.println("<body>");
         out.println("<h1>");
         out.println("Registro completado");
         out.println("</h1>");
         out.println("<a href = loginAdmin.html>");
         out.println("Sign in");
         out.println("</a>");
         out.println("</body>");
         out.println("</html>");
        }
        
        if("normal".equals(type)){
        
        String userNormal = request.getParameter("user");
        String name = request.getParameter("name");
        String type = request.getParameter("type");
        String address = request.getParameter("address");
        User normal = user.creatUser(type);
        normal = new Normal(user, password, email, type, userNormal, name, type, address);
        normal.addUsers();
        PrintWriter out = response.getWriter();
         
         out.println("<!DOCTYPE html>");
         out.println("<html>");
         out.println("<head>");
         out.println("<meta charset=\"UTF-8\">");
         out.println("<tittle>");
         out.println("Signed up!");
         out.println("</tittle>");
         out.println("</head>");
         out.println("<body>");
         out.println("<h1>");
         out.println("Usuario registrado");
         out.println("</h1>");
         out.println("<a href = login.html>");
         out.println("Sign in");
         out.println("</a>");
         out.println("</body>");
         out.println("</html>");      
        
        }
        
        if ("guest".equals(type)){
        
        String userGuest = request.getParameter("user");
        String name = request.getParameter("name");
        String date = request.getParameter("date");
        User guest = user.creatUser(type);
        guest = new Guest(user, password, email, type, userGuest, name, date);
        guest.addUsers();
        PrintWriter out = response.getWriter();
         
         out.println("<!DOCTYPE html>");
         out.println("<html>");
         out.println("<head>");
         out.println("<meta charset=\"UTF-8\">");
         out.println("<tittle>");
         out.println("Signed up!");
         out.println("</tittle>");
         out.println("</head>");
         out.println("<body>");
         out.println("<h1>");
         out.println("Registro completado");
         out.println("</h1>");
         out.println("<a href = loginGuest.html>");
         out.println("Sign in");
         out.println("</a>");
         out.println("</body>");
         out.println("</html>");   
        
        }
    }

    
    

}
