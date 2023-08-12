
package Controlador;

import Modelo.Beneficiarios;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import javax.swing.JComboBox;


public class Gestion_Beneficiarios {
     public DefaultTableModel LISTARTABLA() 
    {
        DefaultTableModel modelo;
        String titulos[] = {"Empresa","Identificacion","Nombre","Departamento","Municipio","Vereda","Finca","Direccion","Telefono","Observaciones"};
        modelo = new DefaultTableModel(null,titulos);
        ResultSet rs;
        Connection con = new Conexion().getCon();
        try 
        {
            rs=con.createStatement().executeQuery("select empresa.nombre,Beneficiarios.identificacion_cultivador,Beneficiarios.nombre,Beneficiarios.Departamento,Beneficiarios.Municipio,beneficiarios.vereda,beneficiarios.finca,Beneficiarios.Direccion,Beneficiarios.Telefono,beneficiarios.observaciones from Beneficiarios inner join empresa on empresa.nit_empresa= Beneficiarios.nit_empresa group by Beneficiarios.identificacion_cultivador ;");
            while (rs.next()) {
                
                Object fila[] = new Object[10];
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
     
     
     
       public boolean GUARDAR( Beneficiarios b ){
        Connection con = new Conexion().getCon();
        PreparedStatement ps;
        try 
        {
            ps = con.prepareStatement("INSERT INTO Beneficiarios (identificacion_Cultivador,nit_empresa,direccion,telefono,departamento,municipio,finca,vereda,nombre,observaciones) VALUES (?,?,?,?,?,?,?,?,?,?)");
            ps.setLong  (1,b.getIdentificacion_Cultivador());
            ps.setString(2,b.getNit_Empresa());
            ps.setString(3,b.getDireccion());
            ps.setLong  (4,b.getTelefono());
            ps.setString(5,b.getDepartamento());
            ps.setString(6,b.getMunicipio());
            ps.setString(7,b.getFinca());
            ps.setString(8,b.getVereda());
            ps.setString(9,b.getNombre());
            ps.setString(10,b.getObservaciones());
            ps.executeUpdate();
            con.close();
            return true;
        } 
        catch (SQLException ex) 
        {
            JOptionPane.showMessageDialog(null, "este numero de identificacion ya esta registrado en la base de datos" );
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
       
       
       
       
       
          public boolean ACTUALIZAR( Beneficiarios b ){
                            
        Connection con = new Conexion().getCon();
        PreparedStatement ps;
    
         try {
             ps = con.prepareStatement("UPDATE Beneficiarios SET nit_empresa=?,direccion=?,telefono=?,departamento=?,municipio=?,finca=?,vereda=?,nombre=?,observaciones =? WHERE identificacion_Cultivador = ?");
             ps.setLong(10,b.getIdentificacion_Cultivador());
             ps.setString(1,b.getNit_Empresa());
             ps.setString(2,b.getDireccion());
             ps.setLong(3,b.getTelefono());
             ps.setString(4,b.getDepartamento());
             ps.setString(5,b.getMunicipio());
             ps.setString(6,b.getFinca());
             ps.setString(7,b.getVereda());
             ps.setString(8,b.getNombre());
             ps.setString(9,b.getObservaciones());
             ps.executeUpdate();
             con.close();
            return true;
         } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error" + ex.toString());
            return false;
         }
     
    }
          
          
          
           public boolean ELIMINAR(long identificacion_cultivador) {
        try {
            Connection con = new Conexion().getCon();
            con.createStatement().executeUpdate("DELETE FROM Beneficiarios WHERE identificacion_Cultivador= "+identificacion_cultivador +";");  
            return true;
            
         } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR:" + ex.toString());
        return false;
         }
         
    }
           
           
           public DefaultTableModel FILTRO (String columna, String texto) {
        DefaultTableModel modelo;
         String titulos[] = {"Empresa","Identificacion","Nombre","Departamento","Municipio","Vereda","Finca","Direccion","Telefono","Observaciones"};
        modelo = new DefaultTableModel(null,titulos);
        ResultSet rs;
        Connection con = new Conexion().getCon();
        try 
        {
           rs=con.createStatement().executeQuery(" select empresa.nombre,Beneficiarios.identificacion_cultivador,Beneficiarios.nombre,Beneficiarios.Departamento,Beneficiarios.Municipio,beneficiarios.vereda,beneficiarios.finca,Beneficiarios.Direccion,Beneficiarios.Telefono,beneficiarios.observaciones from Beneficiarios inner join empresa on empresa.nit_empresa= Beneficiarios.nit_empresa WHERE Beneficiarios."+columna+" LIKE "+"'%"+texto+"%'"+" group by Beneficiarios.identificacion_cultivador ;");
                while (rs.next()) {
                Object fila[] = new Object[10];
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
