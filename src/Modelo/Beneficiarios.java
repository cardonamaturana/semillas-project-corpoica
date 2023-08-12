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
public class Beneficiarios {

    @Override
    public String toString() {
        return "Beneficiarios{" + "Identificacion_Cultivador=" + Identificacion_Cultivador + ", Telefono=" + Telefono + ", observaciones=" + observaciones + ", Direccion=" + Direccion + ", Departamento=" + Departamento + ", Municipio=" + Municipio + ", Finca=" + Finca + ", Vereda=" + Vereda + ", Nombre=" + Nombre + ", Nit_Empresa=" + Nit_Empresa + '}';
    }

    public long getIdentificacion_Cultivador() {
        return Identificacion_Cultivador;
    }

    public void setIdentificacion_Cultivador(long Identificacion_Cultivador) {
        this.Identificacion_Cultivador = Identificacion_Cultivador;
    }

    public long getTelefono() {
        return Telefono;
    }

    public void setTelefono(long Telefono) {
        this.Telefono = Telefono;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
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

    public String getFinca() {
        return Finca;
    }

    public void setFinca(String Finca) {
        this.Finca = Finca;
    }

    public String getVereda() {
        return Vereda;
    }

    public void setVereda(String Vereda) {
        this.Vereda = Vereda;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getNit_Empresa() {
        return Nit_Empresa;
    }

    public void setNit_Empresa(String Nit_Empresa) {
        this.Nit_Empresa = Nit_Empresa;
    }

    public Beneficiarios(long Identificacion_Cultivador, long Telefono, String observaciones, String Direccion, String Departamento, String Municipio, String Finca, String Vereda, String Nombre, String Nit_Empresa) {
        this.Identificacion_Cultivador = Identificacion_Cultivador;
        this.Telefono = Telefono;
        this.observaciones = observaciones;
        this.Direccion = Direccion;
        this.Departamento = Departamento;
        this.Municipio = Municipio;
        this.Finca = Finca;
        this.Vereda = Vereda;
        this.Nombre = Nombre;
        this.Nit_Empresa = Nit_Empresa;
    }

    

  public Beneficiarios() {
    }
    long Identificacion_Cultivador,Telefono;
    String observaciones,Direccion,Departamento,Municipio,Finca,Vereda,Nombre,Nit_Empresa;
}
