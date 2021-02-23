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
public class Alumno extends Persona{
    private Fecha fechaInscripcion;
    
    public Alumno(int dpi, int edad, String nombre, Fecha fechaInscripcion){
        super(dpi,edad,nombre);
        this.fechaInscripcion = fechaInscripcion;
    }
}
