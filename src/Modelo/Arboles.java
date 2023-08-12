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
public class Arboles {

    @Override
    public String toString() {
        return "Arboles{" + "Identificacion_Cultivador=" + Identificacion_Cultivador + ", Cod_Copa=" + Cod_Copa + ", Cod_Patron=" + Cod_Patron + ", cod_control=" + cod_control + ", Cod_Arbol=" + Cod_Arbol + ", Departamento=" + Departamento + ", Municipio=" + Municipio + ", Vereda=" + Vereda + ", Finca=" + Finca + ", Latitud=" + Latitud + ", longitud=" + longitud + ", Altitud=" + Altitud + ", Observaciones=" + Observaciones + '}';
    }

    public long getIdentificacion_Cultivador() {
        return Identificacion_Cultivador;
    }

    public void setIdentificacion_Cultivador(long Identificacion_Cultivador) {
        this.Identificacion_Cultivador = Identificacion_Cultivador;
    }

    public int getCod_Copa() {
        return Cod_Copa;
    }

    public void setCod_Copa(int Cod_Copa) {
        this.Cod_Copa = Cod_Copa;
    }

    public int getCod_Patron() {
        return Cod_Patron;
    }

    public void setCod_Patron(int Cod_Patron) {
        this.Cod_Patron = Cod_Patron;
    }

    public int getCod_control() {
        return cod_control;
    }

    public void setCod_control(int cod_control) {
        this.cod_control = cod_control;
    }

    public String getCod_Arbol() {
        return Cod_Arbol;
    }

    public void setCod_Arbol(String Cod_Arbol) {
        this.Cod_Arbol = Cod_Arbol;
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

    public String getLatitud() {
        return Latitud;
    }

    public void setLatitud(String Latitud) {
        this.Latitud = Latitud;
    }

    public String getLongitud() {
        return longitud;
    }

    public void setLongitud(String longitud) {
        this.longitud = longitud;
    }

    public String getAltitud() {
        return Altitud;
    }

    public void setAltitud(String Altitud) {
        this.Altitud = Altitud;
    }

    public String getObservaciones() {
        return Observaciones;
    }

    public void setObservaciones(String Observaciones) {
        this.Observaciones = Observaciones;
    }

    public Arboles(long Identificacion_Cultivador, int Cod_Copa, int Cod_Patron, int cod_control, String Cod_Arbol, String Departamento, String Municipio, String Vereda, String Finca, String Latitud, String longitud, String Altitud, String Observaciones) {
        this.Identificacion_Cultivador = Identificacion_Cultivador;
        this.Cod_Copa = Cod_Copa;
        this.Cod_Patron = Cod_Patron;
        this.cod_control = cod_control;
        this.Cod_Arbol = Cod_Arbol;
        this.Departamento = Departamento;
        this.Municipio = Municipio;
        this.Vereda = Vereda;
        this.Finca = Finca;
        this.Latitud = Latitud;
        this.longitud = longitud;
        this.Altitud = Altitud;
        this.Observaciones = Observaciones;
    }

    
    public Arboles() {
    }
    long Identificacion_Cultivador;
    int Cod_Copa,Cod_Patron,cod_control;
    
    String Cod_Arbol,
            Departamento,
            Municipio,
            Vereda,
            Finca,
            Latitud,
            longitud,
            Altitud,
            Observaciones;
}
