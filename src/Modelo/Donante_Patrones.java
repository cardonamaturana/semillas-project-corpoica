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
public class Donante_Patrones {

    @Override
    public String toString() {
        return "Donante_Patrones{" + "Telefono=" + Telefono + ", Nombre=" + Nombre + ", Direccion=" + Direccion + ", Departamento=" + Departamento + ", Municipio=" + Municipio + ", Observaciones=" + Observaciones + ", Nit_Empresa=" + Nit_Empresa + ", Vereda=" + Vereda + ", Finca=" + Finca + ", Cod_Donante=" + Cod_Donante + '}';
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

    public String getDepartamento() {
        return Departamento;
    }

    public void setDepartamento(String Departamento) {
        this.Departamento = Departamento;
    }

    public String getMunicipio() {
        return Municipio;
    }

    public void setMunicipio(String Municipio) {
        this.Municipio = Municipio;
    }

    public String getObservaciones() {
        return Observaciones;
    }

    public void setObservaciones(String Observaciones) {
        this.Observaciones = Observaciones;
    }

    public String getNit_Empresa() {
        return Nit_Empresa;
    }

    public void setNit_Empresa(String Nit_Empresa) {
        this.Nit_Empresa = Nit_Empresa;
    }

    public String getVereda() {
        return Vereda;
    }

    public void setVereda(String Vereda) {
        this.Vereda = Vereda;
    }

    public String getFinca() {
        return Finca;
    }

    public void setFinca(String Finca) {
        this.Finca = Finca;
    }

    public String getCod_Donante() {
        return Cod_Donante;
    }

    public void setCod_Donante(String Cod_Donante) {
        this.Cod_Donante = Cod_Donante;
    }

    public Donante_Patrones(long Telefono, String Nombre, String Direccion, String Departamento, String Municipio, String Observaciones, String Nit_Empresa, String Vereda, String Finca, String Cod_Donante) {
        this.Telefono = Telefono;
        this.Nombre = Nombre;
        this.Direccion = Direccion;
        this.Departamento = Departamento;
        this.Municipio = Municipio;
        this.Observaciones = Observaciones;
        this.Nit_Empresa = Nit_Empresa;
        this.Vereda = Vereda;
        this.Finca = Finca;
        this.Cod_Donante = Cod_Donante;
    }

   

    public Donante_Patrones() {
    }
    long Telefono;
    String Nombre,Direccion,Departamento,Municipio,Observaciones,Nit_Empresa,Vereda,Finca,Cod_Donante;
}
