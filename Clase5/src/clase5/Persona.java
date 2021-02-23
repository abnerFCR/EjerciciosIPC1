/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase5;

import java.io.Serializable;

/**
 *
 * @author fernando
 */
public class Persona implements Serializable{
    
    private int dpi;
    private int edad;
    private String nombre;
    
    public Persona(int dpi, int edad, String nombre){
        this.dpi=dpi;
        this.edad=edad;
        this.nombre=nombre;
    }

    /**
     * @return the dpi
     */
    public int getDpi() {
        return dpi;
    }

    /**
     * @param dpi the dpi to set
     */
    public void setDpi(int dpi) {
        this.dpi = dpi;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
