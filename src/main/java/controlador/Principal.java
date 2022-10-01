/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.Cliente;
import vista.MenuPrincipal;

/**
 *
 * @author neodev
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    
    private static Cliente cliente;
    
    public static void main(String[] args) {
        // TODO code application logic here
        
      MenuPrincipal menu = new MenuPrincipal();
      menu.setVisible(true);
      menu.setLocationRelativeTo(null);
      
    }
    
    public static void crearCliente(long documento, String nombres, String apellidos,
            int dia, int mes, int anio, String nacionalidad, long telefono, String rut, 
            String calle, int npuerta, String barrio){
        
        cliente = new Cliente(documento, nombres,apellidos, dia, mes, anio, nacionalidad,
                telefono, rut, calle, npuerta, barrio);
    }
    
    public static Cliente returnCliente(){
        return cliente;
    }
    
}
