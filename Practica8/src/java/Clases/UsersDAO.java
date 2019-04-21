/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.io.PrintWriter;
import java.sql.*;

/**
 *
 * @author Salvador
 */
public class UsersDAO {
    private static Object response;
    public static String registrarUsuario(UsersVO usuario) throws SQLException{
        String resultado = null, last = null;
        ConexionDB con = new ConexionDB();
        Connection cn = con.getConnection();
        PreparedStatement pst = null;
        String sql = "INSERT INTO practica9.users values (null, ?,?,?,?)";
        
        try{
            pst = cn.prepareStatement(sql);
            pst.setString(1, usuario.getUser());
            pst.setString(2, usuario.getPass());
            pst.setString(3, usuario.getFecha());
            pst.setString(4, usuario.getTelefono());
            pst = cn.prepareStatement("SELECT MAX(id) AS id FROM practica8.users");
            ResultSet rs = pst.executeQuery();
            
            if(rs.next()){
                last = rs.getString(1);
            }
            
            resultado = "Usuario registrado, ID:" + last;
                
        }catch(SQLException e){
            resultado = "Error" + e.getMessage();
        }finally{
            try{
                if(cn != null){
                    cn.close();
                }
            }catch(Exception e){
                resultado = "Error: " + e;
            }
            
        }
        return resultado;
    }
    
    public static UsersVO buscarUsuario(String usuario, String password) throws SQLException{
        UsersVO us = new UsersVO();
        ConexionDB con = new ConexionDB();
        Connection cn = con.getConnection();
        PreparedStatement pst = null;
        String sql = "INSERT * FROM users WHERE usuario = ? && pw = ?";
        
        try{
            pst = cn.prepareStatement(sql);
            pst.setString(1, us.getUser());
            pst.setString(2, us.getPass());
            ResultSet rs = pst.executeQuery();
            
            if(rs.next()){
                us.setId(Integer.parseInt(rs.getString(1)));
                us.setUser(rs.getString(2));
                us.setPass(rs.getString(3));
                us.setFecha(rs.getString(4));
                us.setTelefono(rs.getString(5));
                
            }
            
            us.setResultado("Busqueda exitosa");
                
        }catch(SQLException e){
            us.setResultado("Error" + e.getMessage());
        }finally{
            try{
                if(cn != null){
                    cn.close();
                }
            }catch(Exception e){
                us.setResultado("Error: " + e);
            }
            
        }
        return us;
        
    }
}
