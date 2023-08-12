/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Arboles;
import Vista.Accesador;
import java.sql.*;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;

import javax.swing.table.DefaultTableModel;
public class Gestion_Arboles {
    
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
                        codigo=codigo;
                    }
return codigo;
}
    
    public void AJUSTARCOLUMNAS(JTable jTable1){
        int valorcolumna0 =70;
        int columna0=0;
       jTable1.getColumnModel().getColumn(columna0).setMaxWidth(valorcolumna0);
        jTable1.getColumnModel().getColumn(columna0).setMinWidth(valorcolumna0);
        jTable1.getTableHeader().getColumnModel().getColumn(columna0).setMaxWidth(valorcolumna0);
        jTable1.getTableHeader().getColumnModel().getColumn(columna0).setMinWidth(valorcolumna0);
        
        int valorcolumnadepartamento =9;
        int columnadepartamento=3;
       // jTable1.getColumnModel().getColumn(columnadepartamento).setMaxWidth(valorcolumnadepartamento);
        jTable1.getColumnModel().getColumn(columnadepartamento).setMinWidth(valorcolumnadepartamento);
       // jTable1.getTableHeader().getColumnModel().getColumn( columnadepartamento).setMaxWidth(valorcolumnadepartamento);
        jTable1.getTableHeader().getColumnModel().getColumn(columnadepartamento).setMinWidth(valorcolumnadepartamento);
        
        
         int valorcolumnamunicipio =90;
        int columnamunicipio=4;
       // jTable1.getColumnModel().getColumn(columnadepartamento).setMaxWidth(valorcolumnadepartamento);
        jTable1.getColumnModel().getColumn(columnamunicipio).setMinWidth(valorcolumnamunicipio);
       // jTable1.getTableHeader().getColumnModel().getColumn( columnadepartamento).setMaxWidth(valorcolumnadepartamento);
        jTable1.getTableHeader().getColumnModel().getColumn(columnamunicipio).setMinWidth(valorcolumnamunicipio);
        
         int valorcolumnavereda =80;
        int columnavereda=5;
       // jTable1.getColumnModel().getColumn(columnadepartamento).setMaxWidth(valorcolumnadepartamento);
        jTable1.getColumnModel().getColumn(columnavereda).setMinWidth(valorcolumnavereda);
       // jTable1.getTableHeader().getColumnModel().getColumn( columnadepartamento).setMaxWidth(valorcolumnadepartamento);
        jTable1.getTableHeader().getColumnModel().getColumn(columnavereda).setMinWidth(valorcolumnavereda);
       
          int valorcolumnacodarbol =110;
          int columnacodarbol=2;
          
      // jTable1.getColumnModel().getColumn(columnacodarbol).setMaxWidth(valorcolumnacodarbol);
        jTable1.getColumnModel().getColumn(columnacodarbol).setMinWidth(valorcolumnacodarbol);
        //jTable1.getTableHeader().getColumnModel().getColumn(columnacodarbol).setMaxWidth(valorcolumnacodarbol);
        jTable1.getTableHeader().getColumnModel().getColumn(columnacodarbol).setMinWidth(valorcolumnacodarbol);
        
         int valorcolumnalatitud =95;
          int columnalatitud=9;
          
     //  jTable1.getColumnModel().getColumn(columna11).setMaxWidth(valorcolumna11);
        jTable1.getColumnModel().getColumn(columnalatitud).setMinWidth(valorcolumnalatitud);
       // jTable1.getTableHeader().getColumnModel().getColumn(columna11).setMaxWidth(valorcolumna11);
        jTable1.getTableHeader().getColumnModel().getColumn(columnalatitud).setMinWidth(valorcolumnalatitud);
      
           int valorcolumnalongitud =95;
          int columnalongitud=10;
          
     //  jTable1.getColumnModel().getColumn(columna11).setMaxWidth(valorcolumna11);
        jTable1.getColumnModel().getColumn(columnalongitud).setMinWidth(valorcolumnalongitud);
       // jTable1.getTableHeader().getColumnModel().getColumn(columna11).setMaxWidth(valorcolumna11);
        jTable1.getTableHeader().getColumnModel().getColumn(columnalongitud).setMinWidth(valorcolumnalongitud);
        
        
         int valorcolumnaaltitud =50;
          int columnaaltitud=11;
          
       jTable1.getColumnModel().getColumn(columnaaltitud).setMaxWidth(valorcolumnaaltitud);
        jTable1.getColumnModel().getColumn(columnaaltitud).setMinWidth(valorcolumnaaltitud);
        jTable1.getTableHeader().getColumnModel().getColumn(columnaaltitud).setMaxWidth(valorcolumnaaltitud);
        jTable1.getTableHeader().getColumnModel().getColumn(columnaaltitud).setMinWidth(valorcolumnaaltitud);
        
        
            int valorcolumnapatron =0;
          int columnapatron=8;
          
       jTable1.getColumnModel().getColumn(columnapatron).setMaxWidth(valorcolumnapatron);
        jTable1.getColumnModel().getColumn(columnapatron).setMinWidth(valorcolumnapatron);
        jTable1.getTableHeader().getColumnModel().getColumn(columnapatron).setMaxWidth(valorcolumnapatron);
        jTable1.getTableHeader().getColumnModel().getColumn(columnapatron).setMinWidth(valorcolumnapatron);
        
            int valorcolumnacopa =0;
          int columnacopa=7;
          
       jTable1.getColumnModel().getColumn(columnacopa).setMaxWidth(valorcolumnacopa);
        jTable1.getColumnModel().getColumn(columnacopa).setMinWidth(valorcolumnacopa);
        jTable1.getTableHeader().getColumnModel().getColumn(columnacopa).setMaxWidth(valorcolumnacopa);
        jTable1.getTableHeader().getColumnModel().getColumn(columnacopa).setMinWidth(valorcolumnacopa);
        
            int valorcolumnabeneficiario =150;
          int columnabeneficiario=1;
          
      // jTable1.getColumnModel().getColumn(columna6).setMaxWidth(valorcolumna6);
        jTable1.getColumnModel().getColumn(columnabeneficiario).setMinWidth(valorcolumnabeneficiario);
       // jTable1.getTableHeader().getColumnModel().getColumn(columna6).setMaxWidth(valorcolumna6);
        jTable1.getTableHeader().getColumnModel().getColumn(columnabeneficiario).setMinWidth(valorcolumnabeneficiario);
        
        
            int valorcolumnaobservaciones =150;
          int columnaobservaciones=12;
          
      jTable1.getColumnModel().getColumn(columnaobservaciones).setMaxWidth(valorcolumnaobservaciones);
        jTable1.getColumnModel().getColumn(columnaobservaciones).setMinWidth(valorcolumnaobservaciones);
        jTable1.getTableHeader().getColumnModel().getColumn(columnaobservaciones).setMaxWidth(valorcolumnaobservaciones);
        jTable1.getTableHeader().getColumnModel().getColumn(columnaobservaciones).setMinWidth(valorcolumnaobservaciones);
        
}
    
    
    
    

    public DefaultTableModel  LISTARTABLA() 
    {
        
        
        DefaultTableModel modelo;
      
        
        String titulos[] = {"N°","Beneficiario","Cod_Arbol","Departamento","Municipio","Vereda","Finca","Copa","Patron","Latitud","Longitud","Altitud","Observaciones"};
        modelo = new DefaultTableModel(null,titulos);
        
        
        
    

        ResultSet rs;
        Connection con = new Conexion().getCon();
        try
        {
            rs=con.createStatement().executeQuery("show databases;");


            while (rs.next()) {

                Object fila[] = new Object[13];
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

     
     
       public boolean GUARDAR( Arboles a ){
        Connection con = new Conexion().getCon();
        PreparedStatement ps;
        try 
        {
            ps = con.prepareStatement("INSERT INTO arboles (cod_control,identificacion_Cultivador,Cod_Arbol,Departamento,Municipio,Cod_copa,cod_patron,latitud,longitud,altitud,vereda,finca,observaciones) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)");
            ps.setInt(1,a.getCod_control());
            ps.setLong(2,a.getIdentificacion_Cultivador());
            ps.setString(3,a.getCod_Arbol());
            ps.setString(4,a.getDepartamento());
            ps.setString(5,a.getMunicipio());
            ps.setInt(6,a.getCod_Copa());
            ps.setInt(7,a.getCod_Patron());
            ps.setString(8,a.getLatitud());
            ps.setString(9,a.getLongitud());
            ps.setString(10,a.getAltitud());
            ps.setString(11,a.getVereda());
            ps.setString(12,a.getFinca());
            ps.setString(13,a.getObservaciones());
            ps.executeUpdate();
            con.close();
            return true;
        } 
        catch (SQLException ex) 
        {
            JOptionPane.showMessageDialog(null, "ERROR "+ex);
        }
        return false;
    }
      
       
 public JComboBox LISTARJCOMBOBOX(String Tabla,String sentenciawhere) 
{ 
JComboBox combo =new JComboBox(); 
Connection con = new Conexion().getCon();
try 
{ 
ResultSet rs; 
combo.addItem("seleccionar...");
rs = con.createStatement().executeQuery("Select nombre From "+Tabla+" "+sentenciawhere+" order by nombre asc"); 
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
       
    
       
       
          public boolean ACTUALIZAR( Arboles a ){
              
        Connection con = new Conexion().getCon();
        PreparedStatement ps;
    
         try {
             ps = con.prepareStatement("UPDATE Arboles SET Identificacion_Cultivador=?,departamento=?,municipio=?,cod_copa=?,cod_patron=?,latitud =?,longitud=?,altitud =?,vereda =?,finca =?,observaciones =?,cod_arbol=? WHERE cod_control = ?");
             ps.setInt(13,a.getCod_control());
             ps.setString(12,a.getCod_Arbol());
             ps.setLong(1,a.getIdentificacion_Cultivador());
             ps.setString(2,a.getDepartamento());
             ps.setString(3,a.getMunicipio());
             ps.setInt(4,a.getCod_Copa() );
             ps.setInt(5,a.getCod_Patron() );
             ps.setString(6,a.getLatitud());
             ps.setString(7,a.getLongitud());
             ps.setString(8,a.getAltitud());
             ps.setString(9,a.getVereda());
             ps.setString(10,a.getFinca());
             ps.setString(11,a.getObservaciones());
             ps.executeUpdate();
             con.close();
            return true;
         } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error" + ex.toString());
         }
         return false;
    }
          
          
          
          
           public boolean ELIMINAR(int Cod_control) {
        try {
            Connection con = new Conexion().getCon();
            con.createStatement().executeUpdate("DELETE FROM arboles WHERE Cod_control= "+Cod_control +";");  
            return true;
         } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR:" + ex.toString());
         }
         return false;
    }
            
           
           public DefaultTableModel FILTRO (String columna, String texto) {
        DefaultTableModel modelo;
        String titulos[] = {"N°","Beneficiario","Cod_Arbol","Departamento","Municipio","Vereda","Finca","Copa","Patron","Latitud","Longitud","Altitud","Observaciones"};
        modelo = new DefaultTableModel(null,titulos);
        ResultSet rs;
        Connection con = new Conexion().getCon();
        try 
        {
           rs=con.createStatement().executeQuery(" select arboles.cod_control,Beneficiarios.nombre,Arboles.Cod_Arbol,arboles.departamento,arboles.municipio,arboles.vereda,arboles.finca,donante_copas.nombre,donante_patrones.nombre,Arboles.latitud,Arboles.longitud,arboles.altitud,arboles.observaciones from arboles inner join copas on copas.cod_copa=arboles.cod_copa inner join patrones on patrones.cod_patron=arboles.cod_patron inner join donante_copas on donante_copas.cod_donante=copas.cod_donante inner join donante_patrones on donante_patrones.cod_donante=patrones.cod_donante inner join beneficiarios on beneficiarios.identificacion_cultivador=arboles.identificacion_cultivador WHERE "+columna+" LIKE "+"'"+texto+"%'"+" group by arboles.cod_control;");
                while (rs.next()) {
                Object fila[] = new Object[13];
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


      
           
           
  public void updateenlacescopa(int cod_copa){
    
         try {
             PreparedStatement ps;
             ResultSet rs;
             Connection Con = new Conexion().getCon();
             rs= Con.createStatement().executeQuery("SELECT COUNT(COD_COPA) FROM ARBOLES  where cod_copa= " +cod_copa+ ";");
             
             if (rs.next()) {
               
                 int  nenlacescopa=rs.getInt(1);
                 ps= Con.prepareStatement("update copas set estado_enlazado=? where cod_copa=?");
                 ps.setInt(1, nenlacescopa);
                 ps.setInt(2,cod_copa);
                 ps.executeUpdate();
                 
             }
         } catch (SQLException ex) {
             Logger.getLogger(Accesador.class.getName()).log(Level.SEVERE, null, ex);
         }
}

public void updateenlacespatron(int cod_patron){
   
         try {
             PreparedStatement ps;
             ResultSet rs;
             Connection Con = new Conexion().getCon();
             rs= Con.createStatement().executeQuery("SELECT COUNT(COD_patron) FROM ARBOLES  where cod_patron= " +cod_patron+ ";");
             
             if (rs.next()) {
              
                 int nenlacespatron;
                 nenlacespatron=rs.getInt(1);
                 ps= Con.prepareStatement("update patrones set estado_enlazado=? where cod_patron=?");
                 ps.setInt(1, nenlacespatron);
                 ps.setInt(2,cod_patron);
                 ps.executeUpdate();
                 
             }
         } catch (SQLException ex) {
             Logger.getLogger(Accesador.class.getName()).log(Level.SEVERE, null, ex);
         }
}





    }
    
    
    
    
