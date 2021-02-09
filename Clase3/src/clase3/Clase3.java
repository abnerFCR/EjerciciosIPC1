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
public class Clase3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Declaracion de un rectangulo
        Figura nuevo = new Rectangulo(20,10);  
        
        System.out.println(nuevo.area());
        
        //Declaracion de un objeto de triangulo
        Triangulo tri = new Triangulo(20,10);
        
        System.out.println(tri.area());
        System.out.println(tri.area);
        
        //Declaracion de una figura. 
        Figura fig = new Figura();
        
        //System.out.println(fig.area());
        
        System.out.println(obtenerSuma("Texto1","Texto2"));
    }
    
    //Sobrecarga de metodos
    public static int obtenerSuma(int a, int b){
        return a+b;
    }
    public static int obtenerSuma(String saludo, int a, int b){
        System.out.println("hola"+saludo);
        return a+b;
    }
    public static int obtenerSuma(String a, String b){
        System.out.println("Esta es una concatenacion");
        System.out.println(a+b);
        return 0;
    }
}
