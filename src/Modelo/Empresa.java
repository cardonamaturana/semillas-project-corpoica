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
public class Empresa {

    @Override
    public String toString() {
        return "Empresa{" + "Nit_Empresa=" + Nit_Empresa + ", Telefono=" + Telefono + ", Direccion=" + Direccion + ", Nombre=" + Nombre + '}';
    }

    public String getNit_Empresa() {
        return Nit_Empresa;
    }

    public void setNit_Empresa(String Nit_Empresa) {
        this.Nit_Empresa = Nit_Empresa;
    }

    public long getTelefono() {
        return Telefono;
    }

    public void setTelefono(long Telefono) {
        this.Telefono = Telefono;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public Empresa(String Nit_Empresa, long Telefono, String Direccion, String Nombre) {
        this.Nit_Empresa = Nit_Empresa;
        this.Telefono = Telefono;
        this.Direccion = Direccion;
        this.Nombre = Nombre;
    }

   

 
    public Empresa() {
    }
    String Nit_Empresa;
    long Telefono;
    String Direccion,Nombre;
}
