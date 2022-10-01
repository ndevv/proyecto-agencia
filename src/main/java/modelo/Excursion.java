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
public class Excursion {
    
    //Atributos
    
    private int numcoche;
    private int diaviaje;
    private int mesviaje;
    private int anioviaje;
    
    //Constructores

    public Excursion(int coche, int dia, int mes, int anio) {
        setNumCoche(coche);
        setDiaViaje(dia);
        setMesViaje(mes);
        setAnioViaje(anio);
    }
    
    //Getters y Setters

    public int getNumcoche() {
        return numcoche;
    }

    public void setNumCoche(int coche) {
        this.numcoche = coche;
    }

    public int getDiaviaje() {
        return diaviaje;
    }

    public void setDiaViaje(int dia) {
        this.diaviaje = dia;
    }

    public int getMesviaje() {
        return mesviaje;
    }

    public void setMesViaje(int mes) {
        this.mesviaje = mes;
    }

    public int getAnioviaje() {
        return anioviaje;
    }

    public void setAnioViaje(int anio) {
        this.anioviaje = anio;
    }
    
    //Métodos
    
    
}
