/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;

import factory.FactoryProducerOperacionesCalculadora;

/**
 *
 * @author Carlos Ruiz
 */
public class ventana extends JPanel {
    
    private int width = 300, height = 150;
    private int widthTF = 75, heightTF = 25;
    private int widthBT = 60, heightBT = 25;
    private int widthTX = 100, heightTX = 50;
    
    JButton btnPlus,btnRes,btnMul,btnDiv,btnBin,btnDec;
    JTextField texfield1, texfield2, texfield3;
    JLabel text1, text2, text3, text4, text5;
    
    FactoryProducerOperacionesCalculadora calculadora;

    public ventana() {
        
        text1 = new JLabel("Arit/Binario");
        text2 = new JLabel("Aritmetico");
        text3 = new JLabel("Resultado");
        text4 = new JLabel("Aritmetico");
        text5 = new JLabel("Convercion");
        texfield1 = new JTextField();
        texfield2 = new JTextField();
        texfield3 = new JTextField();
        btnPlus = new JButton("+");
        btnRes = new JButton("-");
        btnMul = new JButton("x");
        btnDiv = new JButton("/");
        btnBin = new JButton("Bin");
        btnDec = new JButton("Dec");
        
        
        text1.setBounds(20, 5, widthTX, heightTX);
        text2.setBounds(100, 5, widthTX, heightTX);
        text3.setBounds(180, 5, widthTX, heightTX);
        text4.setBounds(55, 50, widthTX, heightTX);
        text5.setBounds(170, 50, widthTX, heightTX);
        texfield1.setBounds(20, 40, widthTF, heightTF);
        texfield2.setBounds(100, 40, widthTF, heightTF);
        texfield3.setBounds(180, 40, widthTF, heightTF);
        btnPlus.setBounds(20, 85, widthBT, heightBT);
        btnRes.setBounds(85, 85, widthBT, heightBT);
        btnMul.setBounds(20, 115, widthBT, heightBT);
        btnDiv.setBounds(85, 115, widthBT, heightBT);
        btnBin.setBounds(170, 85, widthBT, heightBT);
        btnDec.setBounds(170, 115, widthBT, heightBT);
        
        texfield1.setEditable(true);
        texfield2.setEditable(true);
        texfield3.setEditable(false);
        
        add(text1);
        add(text2);
        add(text3);
        add(text4);
        add(text5);
        add(texfield1);
        add(texfield2);
        add(texfield3);
        add(btnPlus);
        add(btnRes);
        add(btnMul);
        add(btnDiv);
        add(btnBin);
        add(btnDec);
        setLayout(null);
        setPreferredSize (new Dimension(width,height));
        
        btnPlus.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed (ActionEvent e){
                
                calculadora = new FactoryProducerOperacionesCalculadora();
                texfield3.setText(calculadora.getFactory("aritmetico").getAritmetico("suma").operacion(texfield1.getText(),texfield2.getText()));  
            }
        });
        
        btnRes.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed (ActionEvent e){
                
                calculadora = new FactoryProducerOperacionesCalculadora();
                texfield3.setText(calculadora.getFactory("aritmetico").getAritmetico("resta").operacion(texfield1.getText(),texfield2.getText()));  
            }
        });
        
        btnMul.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed (ActionEvent e){
                
                calculadora = new FactoryProducerOperacionesCalculadora();
                texfield3.setText(calculadora.getFactory("aritmetico").getAritmetico("multiplicacion").operacion(texfield1.getText(),texfield2.getText()));  
            }
        });
        
        btnDiv.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed (ActionEvent e){
                
                calculadora = new FactoryProducerOperacionesCalculadora();
                texfield3.setText(calculadora.getFactory("aritmetico").getAritmetico("division").operacion(texfield1.getText(),texfield2.getText()));  
            }
        });
        
        btnBin.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed (ActionEvent e){
                
                calculadora = new FactoryProducerOperacionesCalculadora();
                texfield3.setText(calculadora.getFactory("convertor").getConvertor("binario").convertir(texfield1.getText()));  
            }
        });
        
        btnDec.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed (ActionEvent e){
                
                calculadora = new FactoryProducerOperacionesCalculadora();
                texfield3.setText(calculadora.getFactory("convertor").getConvertor("decimal").convertir(texfield1.getText()));  
            }
        });
    }
        
}
