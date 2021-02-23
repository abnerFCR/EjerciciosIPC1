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
public class Terrestre extends Animal{
    
    private int numeroPatas;
    
    public Terrestre(String nombre, int edad, int numeroPatas){
        super(nombre, edad);
        this.numeroPatas = numeroPatas;
    }
    
    @Override
    public void moverse(){
        System.out.println("Estoy caminando");
    }
}
