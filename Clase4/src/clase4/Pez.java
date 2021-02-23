/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase4;

/**
 *
 * @author fernando
 */
public class Pez extends Acuatico {
    
    
    
    public Pez(String nombre, int edad, int numeroEscamas){
        super(nombre, edad, numeroEscamas);
    }
    
    public void saludar(){
        System.out.println("Soy un pez");
    }
}
