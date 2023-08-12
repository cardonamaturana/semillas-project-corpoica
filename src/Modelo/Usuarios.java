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
public class Usuarios {

    @Override
    public String toString() {
        return "Usuarios{" + "Cod_Usuario=" + Cod_Usuario + ", Estado_Sesion=" + Estado_Sesion + ", Nombre_De_Usuario=" + Nombre_De_Usuario + ", Nombre_Personal=" + Nombre_Personal + ", Nivel=" + Nivel + ", Contrase\u00f1a=" + Contraseña + ", Fecha_Ultima_Sesion=" + Fecha_Ultima_Sesion + ", Hora_Ultima_Sesion=" + Hora_Ultima_Sesion + '}';
    }

    public int getCod_Usuario() {
        return Cod_Usuario;
    }

    public void setCod_Usuario(int Cod_Usuario) {
        this.Cod_Usuario = Cod_Usuario;
    }

    public int getEstado_Sesion() {
        return Estado_Sesion;
    }

    public void setEstado_Sesion(int Estado_Sesion) {
        this.Estado_Sesion = Estado_Sesion;
    }

    public String getNombre_De_Usuario() {
        return Nombre_De_Usuario;
    }

    public void setNombre_De_Usuario(String Nombre_De_Usuario) {
        this.Nombre_De_Usuario = Nombre_De_Usuario;
    }

    public String getNombre_Personal() {
        return Nombre_Personal;
    }

    public void setNombre_Personal(String Nombre_Personal) {
        this.Nombre_Personal = Nombre_Personal;
    }

    public String getNivel() {
        return Nivel;
    }

    public void setNivel(String Nivel) {
        this.Nivel = Nivel;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

    public Object getFecha_Ultima_Sesion() {
        return Fecha_Ultima_Sesion;
    }

    public void setFecha_Ultima_Sesion(Object Fecha_Ultima_Sesion) {
        this.Fecha_Ultima_Sesion = Fecha_Ultima_Sesion;
    }

    public Object getHora_Ultima_Sesion() {
        return Hora_Ultima_Sesion;
    }

    public void setHora_Ultima_Sesion(Object Hora_Ultima_Sesion) {
        this.Hora_Ultima_Sesion = Hora_Ultima_Sesion;
    }

    public Usuarios(int Cod_Usuario, int Estado_Sesion, String Nombre_De_Usuario, String Nombre_Personal, String Nivel, String Contraseña, Object Fecha_Ultima_Sesion, Object Hora_Ultima_Sesion) {
        this.Cod_Usuario = Cod_Usuario;
        this.Estado_Sesion = Estado_Sesion;
        this.Nombre_De_Usuario = Nombre_De_Usuario;
        this.Nombre_Personal = Nombre_Personal;
        this.Nivel = Nivel;
        this.Contraseña = Contraseña;
        this.Fecha_Ultima_Sesion = Fecha_Ultima_Sesion;
        this.Hora_Ultima_Sesion = Hora_Ultima_Sesion;
    }

    

    public Usuarios() {
    }
    int Cod_Usuario,Estado_Sesion;
    String Nombre_De_Usuario,Nombre_Personal,Nivel,Contraseña;
    Object Fecha_Ultima_Sesion,Hora_Ultima_Sesion;
    
  
}
