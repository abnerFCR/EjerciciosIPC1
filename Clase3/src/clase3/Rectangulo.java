/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase3;

import java.util.Scanner;

/**
 *
 * @author fernando
 */

//abstraccion 
//herencia
public class Rectangulo extends Figura{
  
    Scanner nn = new Scanner(System.in);
    //encapsulamiento
    private int base;
    private int altura;
    
    public Rectangulo(){
        this.base = 0;
        this.altura = 0;
    }
    
    public Rectangulo(int base, int altura){
        this.base = base;
        this.altura = altura;
    }
    
    //setter y getters encapsulamiento
    public int getAltura(){
        return this.altura;
    }
    public void setAltura(int altura){
        this.altura = altura;
    }
    
    //polimorfismo
    @Override
    public double area(){
        super.area  = base * altura;
        return base*altura;
    }  
}
