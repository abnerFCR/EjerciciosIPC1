/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nuevo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;

/**
 *
 * @author fernando
 */
public class Nuevo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        JFrame a = new JFrame("Nuevo");
        
        a.setBounds(100,100,100,100);
        JButton b = new JButton("click");
        b.setBounds(0,0,50,50);
        b.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                JDialog m= new JDialog();
                m.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
                m.setVisible(true);
            }
        
        });
        
        a.add(b);
        a.setVisible(true);
        
    }
    
}
