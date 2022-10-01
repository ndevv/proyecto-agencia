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
public class Pasajero extends Persona {
    
    //Atributos
    
    private boolean mayoria;
    
    
    //Constructores

    public Pasajero(long doc, String nom, String ape, int dia, int mes, int anio, String nacion, long tel, boolean edad) {
        super(doc, nom, ape, dia, mes, anio, nacion, tel);
        setMayoria(edad);
    }
    
    //Setters y Getters


    public boolean isMayoria() {
        return mayoria;
    }

    public void setMayoria(boolean edad) {
        this.mayoria = edad;
    }
    
    //Métodos
    
    
    
    
    
}
