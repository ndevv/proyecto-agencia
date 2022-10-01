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
public class Hotel {
    
    //Atributos
    
    private String nombre;
    private int capacidadhab;
    
    
    //Constructores

    public Hotel(String nom, int cap) {
        setNombre(nom);
        setCapacidadHab(cap);
    }
    
    
    //Getters y Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nom) {
        this.nombre = nombre;
    }

    public int getCapacidadHab() {
        return capacidadhab;
    }

    public void setCapacidadHab(int cap) {
        this.capacidadhab = cap;
    }
    
    
    //Métodos
    
    
}
