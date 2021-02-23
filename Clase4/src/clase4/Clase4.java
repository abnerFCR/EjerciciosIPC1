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
public class Clase4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        upcasting();
        casteosImplicitos();
        casteosExplicitos();
    }
    public static void upcasting(){
        
        Animal primero = new Acuatico("primer", 12, 4);
        
        //Este no funciona porque el tipo del objeto es Animal
        //primero.nadar();
        
        Acuatico primeroT = (Acuatico)primero;
        
        //Este funciona por la referencia guardada en animal
        primeroT.nadar();
        
        
        //Pez primeroP = (Pez)primeroT;
        
        //Este lanza error en tiempo de ejecucion porque la referencia en pez es acuatico
        //primeroP.saludar();
        
        
    }
    
    public static void casteosImplicitos(){
        int numeros;
        
        char letra = 'A';
        
        int[] letrasNumerosPractica = new int[26];
        numeros = letra;
        
        System.out.println(numeros);
        
        for(int i=0; i<letrasNumerosPractica.length; i++){
            letrasNumerosPractica[i] = (letra-65);
            letra++;
        }
        
        for(int i=0; i<letrasNumerosPractica.length; i++){
            System.out.println(letrasNumerosPractica[i]);
        }
    }
    public static void casteosExplicitos(){
        int numero = 65;
        
        char letra = (char) numero;
        
        System.out.println(letra);
    }
}
