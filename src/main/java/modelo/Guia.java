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
public class Guia extends Persona {
    
    //Atributos
    
    private String idiomas;
    
    //Constructores

    public Guia(long doc, String nom, String ape, int dia, int mes, int anio, String nacion, long tel, String idioma) {
        super(doc, nom, ape, dia, mes, anio, nacion, tel);
        setIdiomas(idioma);
    }
    
    
    //Getters y Setters

    public String getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(String idioma){
        this.idiomas = idioma;
    }
    
    //Métodos
    
   
}
