/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author jromero
 */
public class Demas_Modelos {

    @Override
    public String toString() {
        return "Demas_Modelos{" + "F_Ventana_Principal_Ancho=" + F_Ventana_Principal_Ancho + ", F_Ventana_Principal_Allto=" + F_Ventana_Principal_Allto + '}';
    }

    public int getF_Ventana_Principal_Ancho() {
        return F_Ventana_Principal_Ancho;
    }

    public void setF_Ventana_Principal_Ancho(int F_Ventana_Principal_Ancho) {
        this.F_Ventana_Principal_Ancho = F_Ventana_Principal_Ancho;
    }

    public int getF_Ventana_Principal_Allto() {
        return F_Ventana_Principal_Allto;
    }

    public void setF_Ventana_Principal_Allto(int F_Ventana_Principal_Allto) {
        this.F_Ventana_Principal_Allto = F_Ventana_Principal_Allto;
    }

    public Demas_Modelos() {
    }

    public Demas_Modelos(int F_Ventana_Principal_Ancho, int F_Ventana_Principal_Allto) {
        this.F_Ventana_Principal_Ancho = F_Ventana_Principal_Ancho;
        this.F_Ventana_Principal_Allto = F_Ventana_Principal_Allto;
    }
    int F_Ventana_Principal_Ancho,F_Ventana_Principal_Allto;
    }
