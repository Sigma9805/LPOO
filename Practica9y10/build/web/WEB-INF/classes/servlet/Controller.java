
package servlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Administration implements User{
    
    private String user;
    private String pass;
    private String correo;
    private String userId;    
    boolean login;  
    boolean regist;
    Connection conectar = null;
    
    public Administration(){
    }
    
    public Administration(String user, String pass){
        this.user = user;
        this.pass = pass;
        
    }
   
    public Administration(String user, String pass, String correo, String userId){
        this.user = user;
        this.pass = pass;
        this.correo = correo;
        this.userId = userId;
    
    }
    
    @Override
     public void addUsers(){
     
          try {
            Class.forName("com.mysql.jdbc.Driver");
            conectar = DriverManager.getConnection("jdbc:mysql://localhost/practica9y10", "root", "");
            Statement stmt = conectar.createStatement();  
            
                          
         
           PreparedStatement prepared =conectar.prepareStatement("INSERT INTO user VALUES('"+ user +"','"+pass +"', '"+correo +"')");
           prepared.executeUpdate();

           regist = true;
            
           } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
            regist = false;
            
            } finally {
       
                      }
     
     
          try {
            Class.forName("com.mysql.jdbc.Driver");
            conectar = DriverManager.getConnection("jdbc:mysql://localhost/practica9y10", "root", "");
            Statement stmt = conectar.createStatement();  
                 
         
           PreparedStatement prepared =conectar.prepareStatement("INSERT INTO admin VALUES('"+ userAdmin +"','"+userId +"')");
           prepared.executeUpdate();

           regist = true;
            
           } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
            regist = false;
            
            } finally {
       
                      }
     
     }
    @Override
    public boolean checkUsersList(){
  
       try{
        Class.forName("com.mysql.jdbc.Driver");
        conectar = DriverManager.getConnection("jdbc:mysql://localhost/practica9y10", "root", "");
        Statement stmt = conectar.createStatement();  
         
        
        String sql = "SELECT user, pass FROM user";
        
        ResultSet rs = stmt.executeQuery(sql);
        
        while(rs.next()){
         
         String userv = rs.getString("user");
         String passv = rs.getString("pass");
         
         if (user.equals(userv)){
              if(pass.equals(passv)){
                    login = true;         
              }
              } else {
              login = false;
                 }
        } 
       
          } catch(SQLException e){
            System.out.println(e.getMessage());
            login = false;
        
            } catch (ClassNotFoundException ex) {
            Logger.getLogger(Administration.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       return login;
    }
}
