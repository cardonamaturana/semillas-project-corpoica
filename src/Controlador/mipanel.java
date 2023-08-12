/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;

/**
 * http://jc-mouse.blogspot.com/
 * @author Mouse
 */
public class mipanel extends javax.swing.JPanel {

    public mipanel(int ALTO,int ANCHO){    
        this.setSize(ANCHO,ALTO);
    }
        
    
    public void paint(Graphics g){
        Dimension tamanio = getSize();
        ImageIcon imagenFondo = new ImageIcon(getClass().getResource("/Utilidades/quehacecorpoica.jpg"));        
        g.drawImage(imagenFondo.getImage(),0,0,tamanio.width, tamanio.height, null);        
        setOpaque(false);
        super.paintComponent(g);
}
    
    
    
    
    
    
}