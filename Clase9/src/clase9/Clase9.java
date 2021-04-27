/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase9;

import javax.sound.sampled.AudioFileFormat;
import javax.sound.sampled.AudioSystem;

/**
 *
 * @author fernando
 */
public class Clase9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Factura fr = new Factura();
        Recibo rc = new Recibo();

        NuevaAbstracta[] objs = {fr, rc};

        for ( int i = 0; i < 2; i++) {
            objs[i].ejecutar();
        }

    }

}
