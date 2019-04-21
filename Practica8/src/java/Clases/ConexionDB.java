/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;
import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author Salvador
 */
public class ConexionDB {
    Connection conectar = null;
    
    public ConexionDB(){
        try{
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            conectar = DriverManager.getConnection("jdbc:derby//localhost:1527/practica8");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public Connection getConnection(){
        return conectar;
    }
    
    public void desconectar(){
        conectar = null;
    }
    
}
