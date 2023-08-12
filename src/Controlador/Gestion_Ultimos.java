/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Ultimos;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author jromero
 */
public class Gestion_Ultimos {
    public boolean ACTUALIZAR_ULTIMA_COPA(Ultimos u,int u_cod_copa){
        try {
            PreparedStatement ps;
            Connection Con = new Conexion().getCon();
            ps= Con.prepareStatement("update ultimos set u_cod_copa=? where U_cod_copa=? ");
            JOptionPane.showMessageDialog(null,"cod antiguo de copa  "+ u_cod_copa+ " actual a registrar "+ u.getU_cod_copa());
            ps.setInt(1, u.getU_cod_copa());
            ps.setInt(2, u_cod_copa);
            ps.executeUpdate();
            return true;
            
        } catch (SQLException ex) {
            Logger.getLogger(Gestion_Ultimos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
     public boolean ACTUALIZAR_ULTIMO_PATRON(Ultimos u,int u_cod_patron){
        try {
            PreparedStatement ps;
            Connection Con = new Conexion().getCon();
            ps= Con.prepareStatement("update ultimos set u_cod_patron=? where U_cod_patron=? ");
            JOptionPane.showMessageDialog(null,"cod antiguo de copa  "+ u_cod_patron+ " actual a registrar "+ u.getU_cod_patron());
            ps.setInt(1, u.getU_cod_patron());
            ps.setInt(2, u_cod_patron);
            ps.executeUpdate();
            return true;
            
        } catch (SQLException ex) {
            Logger.getLogger(Gestion_Ultimos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
}
