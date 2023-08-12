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
public class Colectores {

    @Override
    public String toString() {
        return "Colectores{" + "Identificacion_Colector=" + Identificacion_Colector + ", Telefono=" + Telefono + ", Nombre=" + Nombre + ", Direccion=" + Direccion + ", Nit_Empresa=" + Nit_Empresa + ", Observaciones=" + Observaciones + '}';
    }

    public long getIdentificacion_Colector() {
        return Identificacion_Colector;
    }

    public void setIdentificacion_Colector(long Identificacion_Colector) {
        this.Identificacion_Colector = Identificacion_Colector;
    }

    public long getTelefono() {
        return Telefono;
    }

    public void setTelefono(long Telefono) {
        this.Telefono = Telefono;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getNit_Empresa() {
        return Nit_Empresa;
    }

    public void setNit_Empresa(String Nit_Empresa) {
        this.Nit_Empresa = Nit_Empresa;
    }

    public String getObservaciones() {
        return Observaciones;
    }

    public void setObservaciones(String Observaciones) {
        this.Observaciones = Observaciones;
    }

    public Colectores(long Identificacion_Colector, long Telefono, String Nombre, String Direccion, String Nit_Empresa, String Observaciones) {
        this.Identificacion_Colector = Identificacion_Colector;
        this.Telefono = Telefono;
        this.Nombre = Nombre;
        this.Direccion = Direccion;
        this.Nit_Empresa = Nit_Empresa;
        this.Observaciones = Observaciones;
    }


    public Colectores() {
    }
    long Identificacion_Colector,Telefono;
    String Nombre,Direccion,Nit_Empresa,Observaciones;
}
