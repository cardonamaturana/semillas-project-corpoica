/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

*/

package Controlador;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author jromero
 */
public class Conexion {
    private Connection con;
    String bd = "cattleya";
    String url = "jdbc:mysql://localhost:3306/"+bd+"?allowPublicKeyRetrieval=true";
    String user = "root";
    String pass="";
  
    public Conexion() 
    {
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url,user,pass);
        } 
        catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex.toString());
        }
    }

    public Connection getCon() 
    {
        return con;
    }
}