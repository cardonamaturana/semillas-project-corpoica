
package Controlador;

import Modelo.Usuarios;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class Gestion_Usuarios {
     public JComboBox LISTARJCOMBOBOXUSUARIOS(String tabla,String where) 
{ 
JComboBox combo =new JComboBox(); 
Connection con = new Conexion().getCon();
try 
{ 
ResultSet rs=null; 
combo.addItem("seleccionar...");
rs = con.createStatement().executeQuery("Select nombre_de_usuario From "+tabla+" "+where+" order by cod_usuario asc ;"); 
if(rs==null) return combo; 
rs.first(); 
do 
{ 
combo.addItem(rs.getString(1)); 
//combo.getItemCount(rs.getInt("codigo")); 
} while(rs.next()); 
} catch(Exception err){err.printStackTrace();} 
return combo; 
} 
      
             public boolean ACTUALIZAR_CONTRASEÑA( Usuarios u,String nombre_de_usuario){
              
        Connection con = new Conexion().getCon();
        PreparedStatement ps;
    
         try {
             ps = con.prepareStatement("UPDATE usuarios SET contrasena=? WHERE Nombre_de_usuario = ?");
             ps.setString(2,u.getNombre_De_Usuario());
             ps.setString(1, u.getContraseña());
             ps.executeUpdate();
             con.close();
            return true;
         } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error" + ex.toString());
         }
         return false;
    }
             
             
              public boolean GUARDAR( Usuarios u ){
        Connection con = new Conexion().getCon();
        PreparedStatement ps;
        try 
        {
            ps = con.prepareStatement("INSERT INTO usuarios (Nombre_De_Usuario,Estado_Sesion,Fecha_Ultima_Sesion,Hora_ultima_sesion,nombre_personal,nivel,contrasena) VALUES (?,?,?,?,?,?,?)");
            ps.setString(1,u.getNombre_De_Usuario());
            ps.setInt(2, u.getEstado_Sesion());
            ps.setObject(3, u.getFecha_Ultima_Sesion());
            ps.setObject(4,u.getHora_Ultima_Sesion());
            ps.setString(5,u.getNombre_Personal());
            ps.setString(6,u.getNivel() );
            ps.setString(7, u.getContraseña());
            
            ps.executeUpdate();
            con.close();
            return true;
        } 
        catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null, "Error: Revise que no haya un dato repetido o que tampoco falte alguno" + e.toString());
        }
        return false;
    }
              
              
              public boolean ACTUALIZAR_TODO( Usuarios u){
              
        Connection con = new Conexion().getCon();
        PreparedStatement ps;
    System.out.println(u.toString());
         try {
             ps = con.prepareStatement("UPDATE usuarios SET estado_sesion=?,fecha_ultima_sesion=?,hora_ultima_sesion=? WHERE Nombre_De_Usuario =? ;");
             ps.setInt(1, u.getEstado_Sesion());
             ps.setObject(2, u.getFecha_Ultima_Sesion());
             ps.setObject(3, u.getHora_Ultima_Sesion());
             ps.setString(4, u.getNombre_De_Usuario());
             ps.executeUpdate();
             con.close();
             System.out.println("usuario actualizado");
            return true;
         } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error" + ex.toString());
            return false;
         }
     
    }
              
              
               public boolean CERRAR_SESION( Usuarios u){
              
        Connection con = new Conexion().getCon();
        PreparedStatement ps;
    
         try {
             ps = con.prepareStatement("UPDATE usuarios SET ESTADO_SESION=? WHERE Nombre_de_usuario = ?");
             ps.setInt(1,u.getEstado_Sesion());
             ps.setString(2, u.getNombre_De_Usuario());
             ps.executeUpdate();
             con.close();
            return true;
         } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "" + ex.toString());
         }
         return false;
         }
}
