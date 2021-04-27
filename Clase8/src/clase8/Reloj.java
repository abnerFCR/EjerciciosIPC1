/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase8;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author fernando
 */
public class Reloj extends Thread {

    int contadorSegundos;
    int contadorMinutos;

    public void run() {
        JFrame marco = new JFrame("Probando hilos");
        marco.setSize(300, 300);

        JLabel lbl = new JLabel();
        lbl.setBounds(0, 0, 300, 100);

        marco.add(lbl);

        marco.setVisible(true);

        for (int j = 0; j < 60; j++) {
            for (int i = 0; i < 60; i++) {
                lbl.setText(j+":"+i);
                try {
                    Thread.sleep(10);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Reloj.class.getName()).log(Level.SEVERE, null, ex);
                }
            }   
        }

    }
}
