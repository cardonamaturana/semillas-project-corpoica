/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author jromero
 */

    public class FormatoTabla extends DefaultTableCellRenderer{

    private int columna_patron ;
    private String Textocontrol ;

    public FormatoTabla(int Colpatron,String Texto)
    {
        this.columna_patron = Colpatron;
        this.Textocontrol=Texto;
    }

    @Override
    public Component getTableCellRendererComponent ( JTable table, Object value, boolean selected, boolean focused, int row, int column )
    {        
        setBackground(Color.green);//color de fondo
        table.setForeground(Color.black);//color de texto
        //Si la celda corresponde a una fila con estado FALSE, se cambia el color de fondo a rojo
        if( ((String.valueOf( table.getValueAt(row,columna_patron)))).equals(Textocontrol) )
        {
            setBackground(Color.white);
        }
        super.getTableCellRendererComponent(table, value, selected, focused, row, column);
        return this;
 }

}

