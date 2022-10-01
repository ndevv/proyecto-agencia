/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author neodev
 */
public class Persona {
    
    //Atributos
    
    protected long documento;
    protected String nombres;
    protected String apellidos;
    protected int dia;
    protected int mes;
    protected int anio;
    protected String nacionalidad;
    protected long telefono;
    
    //Constructores
    
    public Persona(long doc, String nom, String ape, int dia, int mes, int anio, String nacion, long tel) {
        setDocumento(doc);
        setNombres(nom);
        setApellidos(ape);
        setDia(dia);
        setMes(mes);
        setAnio(anio);
        setNacionalidad(nacion);
        setTelefono(tel);
    }
    
    //Getters y Setters

    public long getDocumento() {
        return documento;
    }

    public void setDocumento(long doc) {
        //if
        this.documento = doc;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nom) {
        //if
        this.nombres = nom;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String ape) {
        //if
        this.apellidos = ape;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        if (anio < 2022){
        this.anio = anio;
        }
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacion) {
        this.nacionalidad = nacion;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long tel) {
        this.telefono = tel;
    }
    
    //Métodos

    @Override
    public String toString() {
        return "Persona{" + "documento=" + documento + ", nombres=" + nombres 
               + ", apellidos=" + apellidos + ", dia=" + dia + ", mes=" + mes 
               + ", anio=" + anio + ", nacionalidad=" + nacionalidad 
               + ", telefono=" + telefono + '}';
    }
    
    
    
    
}
    