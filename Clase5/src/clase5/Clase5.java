/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author fernando
 */
public class Clase5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*ESCRITURA DE ARCHIVOS POR SERIALIZACION*/
        
        FileOutputStream fos = null;
        ObjectOutputStream salida = null;
        
        Alumno persona;
        Fecha fecha = new Fecha(12,12,2021);
        Alumno[] alumnos = new Alumno[2];
        try{
            fos =new FileOutputStream("/home/fernando/Escritorio/Alumnos2.dat");
            salida =new ObjectOutputStream(fos);
            
            persona = new Alumno(32323,31,"Juan Perez",fecha);
            //salida.writeObject(persona);
            alumnos[0]=persona;
            persona = new Alumno(12121,23,"Pedro Rodriguez",new Fecha(15,12,2021));
            alumnos[1]=persona;
            salida.writeObject(alumnos);
            
        }catch(FileNotFoundException fnfe){
            System.out.println("Error 1:"+fnfe.getMessage());
        }catch(IOException ioe){
            System.out.println("Error 2:"+ioe.getMessage());
        }finally{
            try{
                if(fos!=null){
                    fos.close();
                }
                if(salida!=null){
                    salida.close();
                }
            }catch(IOException ioe){
                System.out.println("Error 3:"+ioe.getMessage());
            }
        }
        
        /*LECTURA DE DATOS */
        FileInputStream fis = null;
        ObjectInputStream entrada = null;
        Alumno[] alumno;
        
        try{
            fis = new FileInputStream("/home/fernando/Escritorio/Alumnos2.dat");
            entrada = new ObjectInputStream(fis);
            
            alumno = (Alumno[])entrada.readObject();
            
            for(int i=0; i<alumno.length; i++){
                System.out.println("Nombre: "+ alumno[i].getNombre());
                System.out.println("Edad: " + alumno[i].getEdad());
                System.out.println("DPI: " + alumno[i].getDpi());
            }
            
            /*
            System.out.println("Nombre: "+ alumno.getNombre());
            System.out.println("Edad: " + alumno.getEdad());
            System.out.println("DPI: " + alumno.getDpi());
            
            alumno = (Alumno)entrada.readObject();
            
            System.out.println("Nombre: "+ alumno.getNombre());
            System.out.println("Edad: " + alumno.getEdad());
            System.out.println("DPI: " + alumno.getDpi());
            */
            
        }catch(FileNotFoundException fnfe){
            System.out.println("Error1: "+fnfe.getMessage());
        }catch(ClassNotFoundException cnfe){
            System.out.println("Error2: "+cnfe.getMessage());
        }catch(IOException ioe){
            System.out.println("Error3: "+ioe.getMessage());
        }finally{
            try{
                if(fis != null){
                    fis.close();
                }
                if(entrada != null){
                    entrada.close();
                }
            }catch(IOException ioe){
                System.out.println("Error4: "+ioe.getMessage());
            }
        
        }
    }
    
    public static void guardarObjeto(Object objeto, String nombreArchivo){
    FileOutputStream fos = null;
        ObjectOutputStream salida = null;
        
        try{
            fos =new FileOutputStream("/home/fernando/Escritorio/"+nombreArchivo);
            salida =new ObjectOutputStream(fos);
           
            if(nombreArchivo.equals("Alumnos.dat")){
                salida.writeObject((Alumno)objeto);
            }

            
        }catch(FileNotFoundException fnfe){
            System.out.println("Error 1:"+fnfe.getMessage());
        }catch(IOException ioe){
            System.out.println("Error 2:"+ioe.getMessage());
        }finally{
            try{
                if(fos!=null){
                    fos.close();
                }
                if(salida!=null){
                    salida.close();
                }
            }catch(IOException ioe){
                System.out.println("Error 3:"+ioe.getMessage());
            }
        }
    }
}
