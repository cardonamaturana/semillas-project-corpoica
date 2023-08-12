
package Controlador;


import Modelo.Colectores;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import javax.swing.JComboBox;


public class Gestion_Colectores {
     public DefaultTableModel LISTARTABLA() 
    {
        DefaultTableModel modelo;
        String titulos[] = {"Identificacion","Nombre","Empresa","Direccion","Telefono","Observaciones"};
        modelo = new DefaultTableModel(null,titulos);
        ResultSet rs;
        Connection con = new Conexion().getCon();
        try 
        {
            rs=con.createStatement().executeQuery("select colectores.identificacion_colector,colectores.nombre,empresa.nombre,colectores.Direccion,colectores.Telefono,colectores.observaciones from colectores inner join empresa on empresa.nit_empresa= colectores.nit_empresa group by colectores.identificacion_colector ;");
            while (rs.next()) {
                Object fila[] = new Object[6];
                for (int i = 0; i < fila.length; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                modelo.addRow(fila);
            }
            con.close();
        } 
        catch (SQLException ex) 
        {
            JOptionPane.showMessageDialog(null, "Error:" + ex.toString());
        }
        return modelo;
    }
     
     
     
       public boolean GUARDAR( Colectores c ){
        Connection con = new Conexion().getCon();
        PreparedStatement ps;
        try 
        {
            ps = con.prepareStatement("INSERT INTO colectores (nit_empresa,nombre,direccion,telefono,identificacion_colector,observaciones) VALUES (?,?,?,?,?,?)");
            ps.setString(1,c.getNit_Empresa());
            ps.setString(2,c.getNombre());
            ps.setString(3,c.getDireccion());
            ps.setLong(4,c.getTelefono());
            ps.setLong(5,c.getIdentificacion_Colector());
            
            ps.setString(6,c.getObservaciones());
            
            ps.executeUpdate();
            con.close();
            return true;
        } 
        catch (SQLException ex) 
        {
            JOptionPane.showMessageDialog(null, "este numero de identificacion ya esta registrado en la base de datos" +ex);
        }
        return false;
    }
       
      public JComboBox LISTARJCOMBOBOX(String campo,String celda) 
{ 
JComboBox combo =new JComboBox(); 
Connection con = new Conexion().getCon();
try 
{ 
ResultSet rs=null; 
combo.addItem("seleccionar...");
rs = con.createStatement().executeQuery("Select nombre From "+campo+" "+celda+" order by nombre asc"); 
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
       
       
       
       
       
          public boolean ACTUALIZAR( Colectores c ){
              
        Connection con = new Conexion().getCon();
        PreparedStatement ps;
    
         try {
             ps = con.prepareStatement("UPDATE colectores SET Nit_Empresa=?,Nombre=?,telefono=?,direccion=?,Observaciones=? WHERE identificacion_colector = ?");
             ps.setLong(6,c.getIdentificacion_Colector());
             ps.setString(1,c.getNit_Empresa());
             ps.setString(2,c.getNombre());
             ps.setLong(3,c.getTelefono());
             ps.setString(4,c.getDireccion());
         
             ps.setString(5,c.getObservaciones());
             
             ps.executeUpdate();
             con.close();
            return true;
         } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error" + ex.toString());
         }
         return false;
    }
          
          
          
           public boolean ELIMINAR(long identificacion_colector) {
        try {
            Connection con = new Conexion().getCon();
            con.createStatement().executeUpdate("DELETE FROM colectores WHERE identificacion_colector= "+identificacion_colector +";");  
            return true;
         } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR:" + ex.toString());
         }
         return false;
    }
           
           
           public DefaultTableModel FILTRO (String columna, String texto) {
        DefaultTableModel modelo;
       String titulos[] = {"Identificacion","Nombre","Empresa","Direccion","Telefono","observaciones"};
        modelo = new DefaultTableModel(null,titulos);
        ResultSet rs;
        Connection con = new Conexion().getCon();
        try 
        {
           rs=con.createStatement().executeQuery("select colectores.identificacion_colector,colectores.nombre,empresa.nombre,colectores.Direccion,colectores.Telefono,colectores.observaciones  from empresa inner join colectores on empresa.nit_empresa=colectores.nit_empresa WHERE colectores."+columna+" LIKE "+"'%"+texto+"%'"+" group by colectores.identificacion_colector ;");
                while (rs.next()) {
                Object fila[] = new Object[6];
                for (int i = 0; i < fila.length; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                modelo.addRow(fila);
            }
            con.close();
        } 
        catch (SQLException ex) 
        {
            JOptionPane.showMessageDialog(null, "Error:" + ex.toString());
        }
        return modelo;
}        
}
