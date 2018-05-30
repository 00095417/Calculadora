/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import gui.ventana;
import javax.swing.JFrame;

/**
 *
 * @author Carlos Ruiz
 */
public class main {
    
    public static void main(String[] args) {
        
        JFrame ventana1 = new JFrame ("Calculadora");
        ventana1.setContentPane(new ventana());
        ventana1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana1.setResizable(false);
        ventana1.pack();
        ventana1.setVisible(true);

        //for (int i = 0; i <= 100; i++) {
          //  System.out.println(toBinary(i));
        //}
    }
    //public static String toBinary(int n){
      //  String res = "";
        //while(n > 0){
          //  res = (n%2)+res;
            //n/=2;
        //}
        //return res;
    //}
    
}
