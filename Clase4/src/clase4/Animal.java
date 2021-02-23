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
public class Animal {
    
    String nombre;
    int edad;
    
    public Animal(String nombre, int edad){
        this.nombre= nombre;
        this.edad = edad;
    }
    
    public void moverse(){
        System.out.println("Me estoy Moviendo");
    }
    
}
