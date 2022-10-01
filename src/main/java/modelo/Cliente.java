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
public class Cliente extends Persona {
    
    //Atributos

    private String rut;
    private String calle;
    private int npuerta;
    private String barrio;
    
    //Constructores

    public Cliente(long doc, String nom, String ape, int dia, int mes, int anio, String nacion, long tel, String rut, String calle, int npuerta, String barrio) {
        super(doc, nom, ape, dia, mes, anio, nacion, tel);
        setRut(rut);
        setCalle(calle);
        setNpuerta(npuerta);
        setBarrio(barrio);
    }
    
    //Getters y Setters

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNpuerta() {
        return npuerta;
    }

    public void setNpuerta(int npuerta) {
        this.npuerta = npuerta;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }
    

    //Métodos
    
    //to String

    @Override
    public String toString() {
        return "ALTA CLIENTE: "+"\nDocumento: "+documento+"\nNombres: "+nombres+"\nApellidos: "+apellidos 
                +"\nFecha de nacimiento: "+dia+mes+anio+"\nNacionalidad: "+nacionalidad+ 
                "\nTeléfono: "+telefono+ "\nRut: "+rut+"\nCalle: "+calle+"\nNúmero de puerta: "
                +npuerta+"\nBarrio: "+barrio;
    }
    
    
    
}
