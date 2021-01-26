/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase1;

import java.util.Scanner;

/**
 *
 * @author fernando
 */
public class Clase1 {

    /**
     * @param args the command line arguments
     */
    //variables para lectura de datos ingresados por el usuario
    static Scanner lectorNumeros;
    static Scanner lectorCadena;
    public static void main(String[] args) {
        // TODO code application logic here
        int opcion = 0;
        do {
            System.out.println("MENU PRINCIPAL");
            System.out.println("1. Par o Impar");      
            System.out.println("2. Obtener una letra especifica de una cadena de caracteres");
            System.out.println("3. Menu secundario");      
            System.out.println("4. Imprimir del 0 - 100 de 10 en 10");
            System.out.println("5. Salir");
            
            //manejo de errores, lectura de datos ingresados por el usuario
            try {
                lectorNumeros = new Scanner(System.in);
                opcion = lectorNumeros.nextInt();
            } catch (Exception e) {
                System.out.println("Por favor ingrese un numero");
            }
            //seleccion de menu.
            switch (opcion) {
                case 1:
                    boolean esPar = par(); //par()
                    if(esPar){
                        System.out.println("Es un numero Par");
                    }else{
                        System.out.println("Es un numero Impar");
                    }
                    break;
                case 2:
                    obtenerLetra();   
                    break;
                case 3:
                    menuSecundario();
                    break;
                case 4:
                    mostrarNumeros();
                    break;
                case 5:
                    System.out.println("Gracias por usar la app");
                    break;
                default:
                    System.out.println("La opcion indicada no es valida");
            }
        } while (opcion != 5);
    }
    
    //metodo para saber si es par o impar
    public static boolean par(){
        //lectura de numero
        System.out.println("Ingrese numero:");
        int numero1 = lectorNumeros.nextInt();
        
        //verificacion par o impar
        if((numero1%2)==0){
            return true;
        }else{
            return false;
        }
    }
    public static void obtenerLetra(){
        //lectura de cadena de entrada
        System.out.println("Ingrese una cadena");
        lectorCadena = new Scanner(System.in);
        String cadena = lectorCadena.nextLine();
        
        //lectura indice
        lectorNumeros = new Scanner(System.in);
        System.out.println("Ingrese indice: ");
        int numeroLetra = lectorNumeros.nextInt();
        
        //encontrar indice en cadena
        char letra = cadena.charAt(numeroLetra);
        System.out.println("En la posicion: "+numeroLetra+" se encuentra la letra: "+letra);
    }
    public static void menuSecundario(){
        int opcion = 0;
        //despliegue de menu secundario
        do {
            System.out.println("MENU SECUNDARIO");
            System.out.println("1. Suma");      
            System.out.println("2. Resta");  
            System.out.println("3. Multiplicacion");      
            System.out.println("4. Regresar al menu anterior");
            try {
                lectorNumeros = new Scanner(System.in);
                opcion = lectorNumeros.nextInt();
            } catch (Exception e) {
                System.out.println("Por favor ingrese un numero");
            }

            switch (opcion) {
                case 1:
                    //SUMA (resta, multiplicion y division igual, validar division en 0)
                    System.out.println("Ingrese numero 1:");
                    double a = lectorNumeros.nextDouble();
                    
                    System.out.println("Ingrese numero 2:");
                    double b = lectorNumeros.nextDouble();
                    System.out.print("Resultado: "+(a+b)+"\n");
                    break;
                case 2:
                    //RESTA
                    System.out.println("soy resta");
                    break;
                case 3:
                    //MULTIPLICACION
                    System.out.println("soy multiplicacion");
                    break;
                case 4:
                    System.out.println("salida");
                    break;
                default:
                    System.out.println("La opcion indicada no es valida");
            }
        } while (opcion != 4);
    }
    public static void mostrarNumeros(){
        int contador = 1;
        //recorrer numeros. 
        for(int i=0; i<10; i++){
            for(int j=0; j<10;j++){
                System.out.print(contador+"\t");
                contador++;
            }
            System.out.println("");
        }
    }
}
