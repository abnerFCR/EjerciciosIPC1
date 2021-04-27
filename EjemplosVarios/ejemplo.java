// Fichero MiOyente.java
import java.awt.event.*;   // Paquete para trabajar con eventos
import javax.swing.*;      // Componentes

import jdk.javadoc.internal.doclets.formats.html.SourceToHTMLConverter;

public class MiOyente implements ActionListener {

   // Si ocurre un evento del tipo ActionEvent muestra un mensaje. Ej. pulsar un botón.
   public void actionPerformed(ActionEvent event) {
      JOptionPane.showMessageDialog(null, "¡Ha ocurrido un evento!");
   }
}

// En otra clase se crea un botón en la ventana
JButton boton = new JButton();
ventana.add(boton);

// Se crea un objeto de la clase MiOyente y se registra al botón
// Cuando se pulse el botón se ejecutará el código del método actionPerformed
MiOyente oyente = new MiOyente();
boton.addActionListener(oyente);

componente.add["tipo evento"](new ["tipo evento"](){
   metodos del evento
});


public abstract class Drawing
{
   public abstract void miMetodo(int var1, int var2);

   String miOtroMetodo( ){ 
      System.out.println("otro metodo no abstracto");

   }
}

public interface IdentificadorInterfaz {
   // Cuerpo de la interfaz ...
} 

public class Acumulador implements Modificacion {
   private int valor;

   public Acumulador (int i) {
       this.valor = i;
   }

   public int daValor () {
       return this.valor;
   }

   public void incremento (int a) {
       this.valor += a;
   }
}

public interface Una implements Dos, Tres {
   // Cuerpo de la interfaz ...
}

package java.awt.event;

import java.awt.event.ActionEvent;