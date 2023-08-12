/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Empresa;


import javax.swing.table.DefaultTableModel;
import java.sql.*;

import javax.swing.JOptionPane;
import javax.swing.JTable;

        
/**
 *
 * @author jromero
 */
public class Gestion_Empresa {
     public DefaultTableModel  LISTAR()
    {
        
        DefaultTableModel modelo;
        String titulos[] = {"Nit_Empresa","Nombre","Direccion","Telefono"};
        modelo = new DefaultTableModel(null,titulos);
         
             
          
        
                
        ResultSet rs;
        Connection con = new Conexion().getCon();
        try 
        {
            rs=con.createStatement().executeQuery("select Nit_Empresa,Nombre,Direccion,Telefono from empresa");
            while (rs.next()) {
                Object fila[] = new Object[4];
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
     
      
            public boolean GUARDAR( Empresa e ){
        Connection con = new Conexion().getCon();
        PreparedStatement ps;
        try 
        {
            ps = con.prepareStatement("INSERT INTO empresa (nit_empresa,nombre,direccion,telefono) VALUES (?,?,?,?)");
            ps.setString(1,e.getNit_Empresa());
            ps.setString(2, e.getNombre());
            ps.setString(3, e.getDireccion());
            ps.setLong(4, e.getTelefono());
            ps.executeUpdate();
            con.close();
            return true;
        } 
        catch (SQLException ex) 
        {
            JOptionPane.showMessageDialog(null, "Error: Revise que no haya un dato repetido o que tampoco falte alguno" + ex.toString());
            return false;
                    
        }
        
    }
            public boolean ACTUALIZAR( Empresa e ){
              
        Connection con = new Conexion().getCon();
        PreparedStatement ps;
    
         try {
             ps = con.prepareStatement("UPDATE Empresa SET nombre=?,direccion=?,telefono=? WHERE Nit_Empresa = ?");
             ps.setString(4, e.getNit_Empresa());
             ps.setString(1, e.getNombre());
             ps.setString(2, e.getDireccion());             
             ps.setLong(3, e.getTelefono());              
             ps.executeUpdate();
             con.close();
            return true;
         } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error" + ex.toString());
         }
         return false;
    }
            
                public boolean ELIMINAR(String Nit_empresa) {
        try {
            Connection con = new Conexion().getCon();
            con.createStatement().executeUpdate("DELETE FROM empresa WHERE nit_Empresa=" + "'"+Nit_empresa+"'");  
            return true;
         } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR:Hay cultivadores y colectores asosiados a esta empresa;\n elimine primero los colectores y cultivadores\ny luego elimine la empresa " + ex.toString());
            return false;
         }
         
    }
                
                
                 public DefaultTableModel FILTRO (String cadena, String campo) {
        DefaultTableModel modelo;
       String titulos[] = {"Nit_Empresa","Nombre","Direccion","Telefono"};
        modelo = new DefaultTableModel(null,titulos);
        ResultSet rs;
        Connection con = new Conexion().getCon();
        try 
        {
           rs=con.createStatement().executeQuery("select Nit_Empresa,Nombre,Direccion,Telefono from empresa WHERE EMPRESA."+campo+" LIKE '%"+cadena+"%' ");
           
            while (rs.next()) {
                Object fila[] = new Object[4];
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
