/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Patrones;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jromero
 */
public class Gestion_Patron {
     public String numeros (String codigo){
   

       
                    if (codigo.length()==1) {
                       codigo= "0000".concat(codigo);
                     }else if (codigo.length()==2) {
                        codigo= "000".concat(codigo);
                    }else if (codigo.length()==3) {
                        codigo= "00".concat(codigo);
                    }else if (codigo.length()==4) {
                        codigo= "0".concat(codigo);
                    }else if (codigo.length()==5) {
                        codigo="".concat(codigo);
                    }
return codigo;
}
    
    public boolean GUARDAR( Patrones p ){
        
             Connection con = new Conexion().getCon();
             PreparedStatement ps;
             
             
            
                 
                 try
                 {
                     ps = con.prepareStatement("INSERT INTO patrones (identificacion_colector,cod_donante,estado_enlazado,fecha_colecta,nombre_c_cultivo,Nombre_c_accesion,ESTADO_ACCESION,fuente_coleccion,latitud,longitud,altitud,genero,especie,d_a_p,altura,observaciones,COD_PATRON) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
                     
                     ps.setLong(1, p.getIdentificacion_colector());
                     ps.setString(2, p.getCod_Donante());
                     ps.setInt(3,p.getEstado_Enlazado());
                     ps.setObject(4,p.getFecha_Colecta());
                     ps.setString(5,p.getNombre_C_Cultivo());
                     ps.setString(6,p.getNombre_Comun_Accesion());
                     ps.setString(7,p.getEstado_Accesion());
                     ps.setString(8,p.getFuente_Coleccion());
                     ps.setString(9,p.getLatitud());
                     ps.setString(10,p.getLongitud());
                     ps.setString(11,p.getAltitud());
                     ps.setString(12,p.getGenero());
                     ps.setString(13,p.getEspecie());
                     ps.setString(14,p.getD_A_P());
                     ps.setString(15,p.getAltura());
                     ps.setString(16,p.getObservaciones());
                     ps.setInt(17,p.getCod_Patron());
                     ps.executeUpdate();
                     return true;
                 }
                 catch (SQLException ex)
                 {
                     JOptionPane.showMessageDialog(null," ERROR  "+ex);
                 }
           
             
        
         return false;
    }
     
       public JComboBox LISTARJCOMBOBOX(String tabla,String columna) 
{ 
JComboBox combo =new JComboBox(); 
Connection con = new Conexion().getCon();
try 
{ 
ResultSet rs=null; 
combo.addItem("seleccionar...");
rs = con.createStatement().executeQuery("Select +"+tabla+".nombre From "+tabla+" "+columna+" order by "+tabla+".nombre asc"); 
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
      
       
          public boolean ACTUALIZAR( Patrones p ){
              
         try {
             Connection con = new Conexion().getCon();
             PreparedStatement ps;
             ResultSet rs;
             rs= con.createStatement().executeQuery("select *from PATRONES where cod_PATRON= "+p.getCod_Patron()+";");
             if (rs.next()) {
                 
                 
                 try {
                     ps = con.prepareStatement("UPDATE Patrones set identificacion_colector=?,cod_donante=?,estado_enlazado=?,fecha_colecta=?,nombre_c_cultivo=?,Nombre_c_accesion=?,ESTADO_ACCESION=?,fuente_coleccion=?,latitud=?,longitud=?,altitud=?,genero=?,especie=?,d_a_p=?,altura=?,observaciones=? WHERE Cod_patron = ?");
                     ps.setLong(1, p.getIdentificacion_colector());
                     ps.setString(2, p.getCod_Donante());
                     ps.setInt(3,p.getEstado_Enlazado());
                     ps.setObject(4,p.getFecha_Colecta());
                     ps.setString(5,p.getNombre_C_Cultivo());
                     ps.setString(6,p.getNombre_Comun_Accesion());
                     ps.setString(7,p.getEstado_Accesion());
                     ps.setString(8,p.getFuente_Coleccion());
                     ps.setString(9,p.getLatitud());
                     ps.setString(10,p.getLongitud());
                     ps.setString(11,p.getAltitud());
                     ps.setString(12,p.getGenero());
                     ps.setString(13,p.getEspecie());
                     ps.setString(14,p.getD_A_P());
                     ps.setString(15,p.getAltura());
                     ps.setString(16,p.getObservaciones());
                     ps.setInt(17,p.getCod_Patron());
                     ps.executeUpdate();
                     con.close();
                     return true;
                 } catch (SQLException ex) {
                     JOptionPane.showMessageDialog(null, "ERROR" + ex.toString());
                 }
                 return false;
             }else{
                 JOptionPane.showMessageDialog(null,"ESTE PATRON NO ESTA REGISTRADO!");
                 return false;
             }
             
         } catch (SQLException ex) {
             Logger.getLogger(Gestion_Patron.class.getName()).log(Level.SEVERE, null, ex);
         }
         return false;
    }
          
           
      
          
           public boolean ELIMINAR(String cod_patron) {
        try {
            Connection con = new Conexion().getCon();
            ResultSet rs;
            rs= con.createStatement().executeQuery("select * from PATRONES where cod_PATRON= "+cod_patron+";");
            if (rs.next()) {
              con.createStatement().executeUpdate("DELETE FROM patrones WHERE cod_patron= "+cod_patron +";");  
            
            return  true;
            }else {
                JOptionPane.showMessageDialog(null,"ESTE PATRON NO EXISTE ");
                return false;
            }
            
            
         } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR:" + ex.toString());
         }
         return false;
    }
         
            public DefaultTableModel LISTARTABLA() 
    {
        DefaultTableModel modelo;
        String titulos[] = {"Codigo","Donante","Departamento","Vereda","Fecha Colecta","Genero","Especie","D_A_P","Altura","Observaciones","Estado"};
        modelo = new DefaultTableModel(null,titulos);
        ResultSet rs;
        Connection con = new Conexion().getCon();
        try 
        {
            rs=con.createStatement().executeQuery("select patrones.cod_patron,donante_patrones.nombre,donante_patrones.departamento,donante_patrones.vereda,patrones.fecha_colecta,patrones.genero,patrones.especie,patrones.D_A_P,patrones.altura,patrones.observaciones,patrones.estado_enlazado from patrones inner join donante_patrones on patrones.cod_donante=donante_patrones.cod_donante group by patrones.cod_patron ;");
            String codigo;
            while (rs.next()) {
                Object fila[] = new Object[11];
                for (int i = 0; i < fila.length; i++) {
                     codigo=String.valueOf(rs.getInt(1));
                    if (codigo.length()==1) {
                        fila[0]= "0000"+rs.getString(1) ;}if (codigo.length()==2) {
                        fila[0]= "000"+rs.getString(1) ;
                    }if (codigo.length()==3) {
                        fila[0]= "00"+rs.getString(1) ;
                    }if (codigo.length()==4) {
                        fila[0]= "0"+rs.getString(1) ;
                    }if (codigo.length()==5) {
                        fila[0]= rs.getString(1) ;
                    }
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
     
     
   
           
           public DefaultTableModel FILTRO (String columna, String texto) {
        DefaultTableModel modelo;
            String titulos[] = {"Codigo","Donante","Departamento","Vereda","Fecha Colecta","Genero","Especie","D_A_P","Altura","Observaciones","Estado"};
        modelo = new DefaultTableModel(null,titulos);
        ResultSet rs;
        Connection con = new Conexion().getCon();
        try 
        {
           rs=con.createStatement().executeQuery("select patrones.cod_patron,donante_patrones.nombre,donante_patrones.departamento,donante_patrones.vereda,patrones.fecha_colecta,patrones.genero,patrones.especie,patrones.D_A_P,patrones.altura,patrones.observaciones,patrones.estado_enlazado  from patrones inner join donante_patrones on patrones.cod_donante=donante_patrones.cod_donante WHERE donante_patrones."+columna+" LIKE "+"'%"+texto+"%'"+" group by patrones.cod_patron;");
                while (rs.next()) {
                Object fila[] = new Object[11];
                for (int i = 0; i < fila.length; i++) {
                    String codigo = String.valueOf(rs.getInt(1));
                    if (codigo.length()==1) {
                        fila[0]= "0000"+rs.getString(1) ;}if (codigo.length()==2) {
                        fila[0]= "000"+rs.getString(1) ;
                    }if (codigo.length()==3) {
                        fila[0]= "00"+rs.getString(1) ;
                    }if (codigo.length()==4) {
                        fila[0]= "0"+rs.getString(1) ;
                    }if (codigo.length()==5) {
                        fila[0]= rs.getString(1) ;
                    }
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
           
               public boolean ACTUALIZARESTADO( Patrones p ){
              
        Connection con = new Conexion().getCon();
        PreparedStatement ps;
    
         try {
             ps = con.prepareStatement("UPDATE patrones set estado_enlazado=? WHERE Cod_patron = ?");
               
             ps.setInt(1,p.getEstado_Enlazado());
             ps.setInt(2,p.getCod_Patron());
             ps.executeUpdate();
             con.close();
            return true;
         } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR" + ex.toString());
         }
         return false;
    }
         
}
