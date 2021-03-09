/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase6;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
/**
 *
 * @author fernando
 */

public class Clase6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Crear componentes y settear parametros
        JFrame jfr = new JFrame();
        jfr.setTitle("Ejemplo 1 Swing");
        jfr.setSize(400,300);
        jfr.getContentPane().setLayout(null);
        
        JPanel jpn = new JPanel();
        jpn.setSize(400,300);
        jpn.setLayout(null);
        jpn.setBackground(Color.red);
        
        JTextField numero1 = new JTextField();
        JTextField numero2 = new JTextField();
        numero1.setBounds(0,0,100,100);
        numero2.setBounds(100,0,100,100);
        
        
        JButton sumar = new JButton("Sumar");
        sumar.setBounds(200,100,100,100);
        JLabel respuesta = new JLabel("");
        respuesta.setBounds(300,0,100,100);
        
        //JPasswordField jpw = new JPasswordField("Primera contra");
        //jpw.setSize(50,50);
        
        //Agregar componentes a un panel
        //jpn.add(jtxt);
        //jpn.add(jpw);
        //jpn.add(jlbl);
        //jpn.add(jbtn);
        jpn.add(numero1);
        jpn.add(numero2);
        jpn.add(sumar);
        jpn.add(respuesta);
        jfr.getContentPane().add(jpn);
        jfr.setVisible(true);
        
        //Insertar accion a un boton 
        sumar.addActionListener(new ActionListener(){      
            @Override 
            public void actionPerformed(ActionEvent e){
                int num1 = Integer.parseInt(numero1.getText());
                int num2 = Integer.parseInt(numero2.getText());
                int resultado = num1 + num2;
                respuesta.setText(resultado+"");
                jfr.validate();
                jfr.setVisible(false);
                Login login = new Login();
            }
        });
        
        /*
        JDialog jd = new JDialog(jfr);
        jd.setTitle("Advertencia");
        jd.setBounds(50,50,50,50);
        jd.setVisible(true);
        */
        //EJEMPLO DE AWT
        /*
        Frame fr = new Frame();
        fr.setLayout(null);
        fr.setSize(400,300);
        //fr.setBounds(0,0,400,300);
        fr.setTitle("Primer Ejemplo AWT");
        
        Panel pn = new Panel();
        pn.setLayout(new FlowLayout());
        pn.setBounds(50,40,250,200);
        pn.setBackground(Color.GRAY);
        
        
        Label lbl = new Label("Primer Label");
        lbl.setBounds(0,0,100,25);
        
        Button btn = new Button("Click");
        btn.setBounds(100,80,100,20);
        
        Checkbox ch = new Checkbox("Acepto los terminos");
        
        pn.add(btn);
        pn.add(lbl);
        pn.add(ch);
        fr.add(pn);
        
        fr.setVisible(true);
        */
    }
    
}
