/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase9;

/**
 *
 * @author fernando
 */
public class Factura extends NuevaAbstracta implements NuevaInterfaz {
    
    double valor;
    
    Factura (){
    
    }
    
    @Override
    public void asignarValor(double valor) {
        this.valor = valor;
    }

    @Override
    public void rebaja(double rebaja) {
        double nuevoValor = this.valor - rebaja;
        if(nuevoValor < 0){
            this.valor = 0;
        }else{
            this.valor = nuevoValor;
        }
    }

    @Override
    public String ejecutar() {
        System.out.println("Hola Mundo 1");
        return "Si";
    }
    
}
