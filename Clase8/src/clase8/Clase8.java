/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase8;

/**
 *
 * @author fernando
 */
public class Clase8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        
        Reloj nuevoHilo = new Reloj();
        
        nuevoHilo.start();
        
        Reloj nuevoHilo2 = new Reloj();
        
        nuevoHilo2.start();
        
        Reloj nuevoHilo3= new Reloj();
        
        nuevoHilo3.start();
        
        
    }
    
}
