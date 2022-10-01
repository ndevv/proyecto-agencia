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
public class Chofer extends Persona {
    
    //Atributos
    
    private String libreta;
    
    //Constructores

    public Chofer(long doc, String nom, String ape, int dia, int mes, int anio, String nacion, long tel, String num) {
        super(doc, nom, ape, dia, mes, anio, nacion, tel);
        setLibreta(num);
    }
    
    //Getters y Setters

    public String getLibreta() {
        return libreta;
    }

    public void setLibreta(String num) {
        this.libreta = num;
    }
    
    //Métodos
    
}
