/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Donante_Copas;
import java.sql.*;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author jromero
 */
public class Gestion_Donantes {
     public DefaultTableModel LISTARTABLA() 
    {
         
        DefaultTableModel modelo=new DefaultTableModel();
        
        String titulos[] = {"Codigo","Empresa","Nombre","Telefono","Direccion","Departamento","Municipio","Observaciones"};
        modelo = new DefaultTableModel(null,titulos);
    
        ResultSet rs;
        Connection con = new Conexion().getCon();
        try 
        {
            rs=con.createStatement().executeQuery("select donante_Copas.cod_donante, empresa.nombre,donante_copas.nombre,donante_copas.telefono,donante_copas.direccion,donante_copas.departamento,donante_copas.municipio,donante_copas.observaciones from donante_copas inner join empresa on donante_copas.nit_empresa=empresa.nit_empresa group by donante_copas.cod_donante ;");
            while (rs.next()) {
                
                
                Object fila[] = new Object[8];
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
     
     
     
       public boolean GUARDAR( Donante_Copas dc ){
        Connection con = new Conexion().getCon();
        PreparedStatement ps;
        try 
        {
            ps = con.prepareStatement("INSERT INTO Donante_Copas (cod_donante,nombre,nit_empresa,telefono,direccion,departamento,municipio,vereda,finca,observaciones) VALUES (?,?,?,?,?,?,?,?,?,?)");
            ps.setString(1, dc.getCod_Donante());
            ps.setString(2,dc.getNombre());
            ps.setString(3,dc.getNit_Empresa());
            ps.setLong(4,dc.getTelefono());
            ps.setString(5,dc.getDireccion());
            ps.setString(6,dc.getDepartamento());
            ps.setString(7,dc.getMunicipio());
            ps.setString(8,dc.getVereda());
            ps.setString(9,dc.getFinca());
            ps.setString(10,dc.getObservaciones());
            ps.executeUpdate();
            ps = con.prepareStatement("INSERT INTO Donante_Patrones (cod_donante,nombre,nit_empresa,telefono,direccion,departamento,municipio,vereda,finca,observaciones) VALUES (?,?,?,?,?,?,?,?,?,?)");
            ps.setString(1, dc.getCod_Donante());
            ps.setString(2,dc.getNombre());
            ps.setString(3,dc.getNit_Empresa());
            ps.setLong(4,dc.getTelefono());
            ps.setString(5,dc.getDireccion());
            ps.setString(6,dc.getDepartamento());
            ps.setString(7,dc.getMunicipio());
            ps.setString(8,dc.getVereda());
            ps.setString(9,dc.getFinca());
            ps.setString(10,dc.getObservaciones());
            ps.executeUpdate();
            con.close();
            return true;
        } 
        catch (SQLException ex) 
        {
            JOptionPane.showMessageDialog(null," ERROR  "+ex);
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
rs = con.createStatement().executeQuery("Select +"+campo+".nombre From "+campo+" "+celda+" order by "+campo+".nombre asc"); 
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
       
       
       
       
       
          public boolean ACTUALIZAR( Donante_Copas dc ){
              
        Connection con = new Conexion().getCon();
        PreparedStatement ps;
    
         try {
             ps = con.prepareStatement("UPDATE donante_copas SET nombre=?,nit_empresa=?,telefono=?,direccion=?,departamento=?,municipio =?,vereda=?,finca=?,observaciones =? WHERE Cod_donante = ?");
             ps.setString(10,dc.getCod_Donante());
             ps.setString(1,dc.getNombre());
             ps.setString(2,dc.getNit_Empresa());
             ps.setLong(3,dc.getTelefono());
             ps.setString(4,dc.getDireccion());
             ps.setString(5,dc.getDepartamento());
             ps.setString(6,dc.getMunicipio());
             ps.setString(7,dc.getVereda());
             ps.setString(8,dc.getFinca());
             ps.setString(9,dc.getObservaciones());
             ps.executeUpdate();
             ps = con.prepareStatement("UPDATE donante_patrones SET nombre=?,nit_empresa=?,telefono=?,direccion=?,departamento=?,municipio =?,vereda=?,finca=?,observaciones =? WHERE Cod_donante = ?");
             ps.setString(10,dc.getCod_Donante());
             ps.setString(1,dc.getNombre());
             ps.setString(2,dc.getNit_Empresa());
             ps.setLong(3,dc.getTelefono());
             ps.setString(4,dc.getDireccion());
             ps.setString(5,dc.getDepartamento());
             ps.setString(6,dc.getMunicipio());
             ps.setString(7,dc.getVereda());
             ps.setString(8,dc.getFinca());
             ps.setString(9,dc.getObservaciones());
             ps.executeUpdate();
             con.close();
            return true;
         } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR" + ex.toString());
         }
         return false;
    }
          
          
          
           public boolean ELIMINAR(String cod_donante) {
        try {
            Connection con = new Conexion().getCon();
            con.createStatement().executeUpdate("DELETE FROM donante_copas WHERE cod_donante= "+cod_donante +";");  
            
            
            con.createStatement().executeUpdate("DELETE FROM donante_PATRONES WHERE cod_donante= "+cod_donante +";");  
            return true;
         } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR:" + ex.toString());
         }
         return false;
    }
           
           
           public DefaultTableModel FILTRO (String columna, String texto) {
        DefaultTableModel modelo;
         String titulos[] = {"Codigo","Empresa","Nombre","Telefono","Direccion","Departamento","Municipio","Observaciones"};
        modelo = new DefaultTableModel(null,titulos);
        ResultSet rs;
        Connection con = new Conexion().getCon();
        try 
        {
           rs=con.createStatement().executeQuery("select donante_Copas.nombre, empresa.nombre,donante_copas.nombre,donante_copas.telefono,donante_copas.direccion,donante_copas.departamento,donante_copas.municipio,donante_copas.observaciones  from donante_copas inner join empresa on donante_copas.nit_empresa=empresa.nit_empresa  WHERE donante_copas."+columna+" LIKE "+"'%"+texto+"%'"+" ;");
                while (rs.next()) {
                Object fila[] = new Object[8];
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
