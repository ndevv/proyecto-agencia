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
public class Destino {
    
    //Atributos
    
    private int numeroid;
    private String nombre;
    private String pais;
    
    //Constructores

    public Destino(int id, String nom, String pais) {
        setNumeroId(id);
        setNombre(nom);
        setPais(pais);
    }
    
    //Getters y Setters

    public int getNumeroid() {
        return numeroid;
    }

    public void setNumeroId(int id) {
        this.numeroid = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nom) {
        this.nombre = nom;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
    
    //Métodos
    
    
    
    
}
