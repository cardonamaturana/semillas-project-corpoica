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
public class Ultimos {

    @Override
    public String toString() {
        return "ultimos{" + "u_cod_copa=" + u_cod_copa + ", u_cod_patron=" + u_cod_patron + '}';
    }

    public int getU_cod_copa() {
        return u_cod_copa;
    }

    public void setU_cod_copa(int u_cod_copa) {
        this.u_cod_copa = u_cod_copa;
    }

    public int getU_cod_patron() {
        return u_cod_patron;
    }

    public void setU_cod_patron(int u_cod_patron) {
        this.u_cod_patron = u_cod_patron;
    }

    public Ultimos(int u_cod_copa, int u_cod_patron) {
        this.u_cod_copa = u_cod_copa;
        this.u_cod_patron = u_cod_patron;
    }

    public Ultimos() {
    }
    int u_cod_copa,u_cod_patron;
    
    
}
