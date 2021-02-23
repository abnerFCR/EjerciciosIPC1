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
public class Acuatico extends Animal{
    
    private int numeroEscamas;
    
    public Acuatico(String nombre, int edad, int numeroEscamas){
        super(nombre, edad);
        this.numeroEscamas = numeroEscamas;
    }
    
    @Override
    public void moverse(){
        System.out.println("Estoy nadando");
    }
    
    public void nadar(){
        System.out.println("Sigo nadando");
    }
}
