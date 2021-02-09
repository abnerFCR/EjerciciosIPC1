/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase3;

/**
 *
 * @author fernando
 */
public class Triangulo extends Figura{
    
    private int base;
    private int altura;
    
    public Triangulo(){
        this.base = 0;
        this.altura = 0;
    }
    public Triangulo(int base, int altura){
        this.base = base;
        this.altura = altura;
    }
    
    @Override
    public double area(){
        super.area = 0.5*this.base * this.altura;
        return super.area;
    }
}
