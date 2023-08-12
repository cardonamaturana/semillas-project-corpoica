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
public class Patrones {

  
  
   
    public Patrones() {
    }

    @Override
    public String toString() {
        return "Patrones{" + "Identificacion_colector=" + Identificacion_colector + ", Estado_Enlazado=" + Estado_Enlazado + ", Cod_Patron=" + Cod_Patron + ", Nombre_C_Cultivo=" + Nombre_C_Cultivo + ", Nombre_Comun_Accesion=" + Nombre_Comun_Accesion + ", Estado_Accesion=" + Estado_Accesion + ", Fuente_Coleccion=" + Fuente_Coleccion + ", Latitud=" + Latitud + ", Longitud=" + Longitud + ", Altitud=" + Altitud + ", Genero=" + Genero + ", Especie=" + Especie + ", D_A_P=" + D_A_P + ", Altura=" + Altura + ", Observaciones=" + Observaciones + ", cod_Donante=" + cod_Donante + ", Fecha_Colecta=" + Fecha_Colecta + '}';
    }

    public long getIdentificacion_colector() {
        return Identificacion_colector;
    }

    public void setIdentificacion_colector(long Identificacion_colector) {
        this.Identificacion_colector = Identificacion_colector;
    }

    public int getEstado_Enlazado() {
        return Estado_Enlazado;
    }

    public void setEstado_Enlazado(int Estado_Enlazado) {
        this.Estado_Enlazado = Estado_Enlazado;
    }

    public int getCod_Patron() {
        return Cod_Patron;
    }

    public void setCod_Patron(int Cod_Patron) {
        this.Cod_Patron = Cod_Patron;
    }

    public String getNombre_C_Cultivo() {
        return Nombre_C_Cultivo;
    }

    public void setNombre_C_Cultivo(String Nombre_C_Cultivo) {
        this.Nombre_C_Cultivo = Nombre_C_Cultivo;
    }

    public String getNombre_Comun_Accesion() {
        return Nombre_Comun_Accesion;
    }

    public void setNombre_Comun_Accesion(String Nombre_Comun_Accesion) {
        this.Nombre_Comun_Accesion = Nombre_Comun_Accesion;
    }

    public String getEstado_Accesion() {
        return Estado_Accesion;
    }

    public void setEstado_Accesion(String Estado_Accesion) {
        this.Estado_Accesion = Estado_Accesion;
    }

    public String getFuente_Coleccion() {
        return Fuente_Coleccion;
    }

    public void setFuente_Coleccion(String Fuente_Coleccion) {
        this.Fuente_Coleccion = Fuente_Coleccion;
    }

    public String getLatitud() {
        return Latitud;
    }

    public void setLatitud(String Latitud) {
        this.Latitud = Latitud;
    }

    public String getLongitud() {
        return Longitud;
    }

    public void setLongitud(String Longitud) {
        this.Longitud = Longitud;
    }

    public String getAltitud() {
        return Altitud;
    }

    public void setAltitud(String Altitud) {
        this.Altitud = Altitud;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public String getEspecie() {
        return Especie;
    }

    public void setEspecie(String Especie) {
        this.Especie = Especie;
    }

    public String getD_A_P() {
        return D_A_P;
    }

    public void setD_A_P(String D_A_P) {
        this.D_A_P = D_A_P;
    }

    public String getAltura() {
        return Altura;
    }

    public void setAltura(String Altura) {
        this.Altura = Altura;
    }

    public String getObservaciones() {
        return Observaciones;
    }

    public void setObservaciones(String Observaciones) {
        this.Observaciones = Observaciones;
    }

    public String getCod_Donante() {
        return cod_Donante;
    }

    public void setCod_Donante(String cod_Donante) {
        this.cod_Donante = cod_Donante;
    }

    public Object getFecha_Colecta() {
        return Fecha_Colecta;
    }

    public void setFecha_Colecta(Object Fecha_Colecta) {
        this.Fecha_Colecta = Fecha_Colecta;
    }

    public Patrones(long Identificacion_colector, int Estado_Enlazado, int Cod_Patron, String Nombre_C_Cultivo, String Nombre_Comun_Accesion, String Estado_Accesion, String Fuente_Coleccion, String Latitud, String Longitud, String Altitud, String Genero, String Especie, String D_A_P, String Altura, String Observaciones, String cod_Donante, Object Fecha_Colecta) {
        this.Identificacion_colector = Identificacion_colector;
        this.Estado_Enlazado = Estado_Enlazado;
        this.Cod_Patron = Cod_Patron;
        this.Nombre_C_Cultivo = Nombre_C_Cultivo;
        this.Nombre_Comun_Accesion = Nombre_Comun_Accesion;
        this.Estado_Accesion = Estado_Accesion;
        this.Fuente_Coleccion = Fuente_Coleccion;
        this.Latitud = Latitud;
        this.Longitud = Longitud;
        this.Altitud = Altitud;
        this.Genero = Genero;
        this.Especie = Especie;
        this.D_A_P = D_A_P;
        this.Altura = Altura;
        this.Observaciones = Observaciones;
        this.cod_Donante = cod_Donante;
        this.Fecha_Colecta = Fecha_Colecta;
    }

   

    long Identificacion_colector;
    int Estado_Enlazado,Cod_Patron;
    String Nombre_C_Cultivo,Nombre_Comun_Accesion,Estado_Accesion,Fuente_Coleccion,Latitud,Longitud,Altitud,Genero,Especie,D_A_P,Altura,Observaciones,cod_Donante;
    Object Fecha_Colecta;
    
    
}
