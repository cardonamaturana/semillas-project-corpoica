/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Copas;
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
public class Gestion_Copa {
    
       public boolean GUARDAR( Copas c ){
        Connection con = new Conexion().getCon();
        PreparedStatement ps;
        try 
        {
            JOptionPane.showMessageDialog(null,"metodo guardar");
            ps = con.prepareStatement("INSERT INTO Copas (identificacion_colector,cod_donante,estado_enlazado,fecha_colecta,nombre_c_cultivo,Nombre_c_accesion,ESTADO_ACCESION,fuente_coleccion,latitud,longitud,altitud,genero,especie,d_a_p,altura,observaciones,cod_copa) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
                
              ps.setLong(1, c.getIdentificacion_colector());
            ps.setString(2, c.getCod_Donante());
                ps.setInt(3,c.getEstado_Enlazado());
             ps.setObject(4,c.getFecha_Colecta());
             ps.setString(5,c.getNombre_C_Cultivo());
             ps.setString(6,c.getNombre_Comun_Accesion());
             ps.setString(7,c.getEstado_Accesion());
             ps.setString(8,c.getFuente_Coleccion());
            ps.setString(9,c.getLatitud());
            ps.setString(10,c.getLongitud());
            ps.setString(11,c.getAltitud());
            ps.setString(12,c.getGenero());
            ps.setString(13,c.getEspecie());
            ps.setString(14,c.getD_A_P());
            ps.setString(15,c.getAltura());
            ps.setString(16,c.getObservaciones());
            ps.setInt(17,c.getCod_Copa());
            ps.executeUpdate();
            return true;
        } 
        catch (SQLException ex) 
        {
            JOptionPane.showMessageDialog(null," ERROR  "+ex);
            return false;
        }
        
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
      
       
          public boolean ACTUALIZAR( Copas c ){
              
           try {
               Connection con = new Conexion().getCon();
               PreparedStatement ps;
               ResultSet rs;
               
               rs= con.createStatement().executeQuery("select *from copas where cod_copa= "+c.getCod_Copa()+";");
               if (rs.next()) {
                   
                   try {
                       ps = con.prepareStatement("UPDATE copas set identificacion_colector=?,cod_donante=?,estado_enlazado=?,fecha_colecta=?,nombre_c_cultivo=?,Nombre_c_accesion=?,ESTADO_ACCESION=?,fuente_coleccion=?,latitud=?,longitud=?,altitud=?,genero=?,especie=?,d_a_p=?,altura=?,observaciones=? WHERE Cod_copa = ?");
                       
                       ps.setLong(1, c.getIdentificacion_colector());
                       ps.setString(2, c.getCod_Donante());
                       ps.setInt(3,c.getEstado_Enlazado());
                       ps.setObject(4,c.getFecha_Colecta());
                       ps.setString(5,c.getNombre_C_Cultivo());
                       ps.setString(6,c.getNombre_Comun_Accesion());
                       ps.setString(7,c.getEstado_Accesion());
                       ps.setString(8,c.getFuente_Coleccion());
                       ps.setString(9,c.getLatitud());
                       ps.setString(10,c.getLongitud());
                       ps.setString(11,c.getAltitud());
                       ps.setString(12,c.getGenero());
                       ps.setString(13,c.getEspecie());
                       ps.setString(14,c.getD_A_P());
                       ps.setString(15,c.getAltura());
                       ps.setString(16,c.getObservaciones());
                       ps.setInt(17,c.getCod_Copa());
                       ps.executeUpdate();
                       con.close();
                       return true;
                   } catch (SQLException ex) {
                       JOptionPane.showMessageDialog(null, "ERROR" + ex.toString());
                   }
               }else {
                   JOptionPane.showMessageDialog(null, "ESTA COPA NO ESTA REGISTRADA");
                   return false;
               }
               
               return false;
           } catch (SQLException ex) {
               Logger.getLogger(Gestion_Copa.class.getName()).log(Level.SEVERE, null, ex);
           }
           return false;
    }
          
           
      
          
           public boolean ELIMINAR(String cod_copa) {
        try {
            Connection con = new Conexion().getCon();
            ResultSet rs;
            
            
            rs= con.createStatement().executeQuery("select * from copas where cod_copa= "+cod_copa+";");
            if (rs.next()) {
                con.createStatement().executeUpdate("DELETE FROM copas WHERE cod_copa= "+cod_copa +";"); 
                return  true;
            }else {
                JOptionPane.showMessageDialog(null,"ESTA COPA NO EXISTE ");
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
            rs=con.createStatement().executeQuery("select copas.cod_copa,donante_copas.nombre,donante_copas.departamento,donante_copas.vereda,copas.fecha_colecta,copas.genero,copas.especie,copas.D_A_P,copas.altura,copas.observaciones,copas.estado_enlazado from copas inner join donante_copas on copas.cod_donante=donante_copas.cod_donante  ;");
            String codigo;
            while (rs.next()) {
                Object fila[] = new Object[11];
                for (int i = 0; i < fila.length; i++) {
                    codigo=numeros(rs.getString(1));
                    fila[0]=codigo;
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
           rs=con.createStatement().executeQuery("select copas.cod_copa,donante_copas.nombre,donante_copas.departamento,donante_copas.vereda,copas.fecha_colecta,copas.genero,copas.especie,copas.D_A_P,copas.altura,copas.observaciones,copas.estado_enlazado  from copas inner join donante_copas on copas.cod_donante=donante_copas.cod_donante WHERE donante_copas."+columna+" LIKE "+"'%"+texto+"%'"+" group by copas.cod_copa;");
                while (rs.next()) {
                Object fila[] = new Object[11];
                for (int i = 0; i < fila.length; i++) {
                    String codigo;
                     codigo=numeros(rs.getString(1));
                     fila[0]= codigo;
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
           
            public boolean ACTUALIZARESTADO( Copas c ){
              
        Connection con = new Conexion().getCon();
        PreparedStatement ps;
    
         try {
             ps = con.prepareStatement("UPDATE copas set estado_enlazado=? WHERE Cod_copa = ?");
               
             ps.setInt(1,c.getEstado_Enlazado());
             ps.setInt(2,c.getCod_Copa());
             ps.executeUpdate();
             con.close();
            return true;
         } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR" + ex.toString());
         }
         return false;
    }
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
      
}
