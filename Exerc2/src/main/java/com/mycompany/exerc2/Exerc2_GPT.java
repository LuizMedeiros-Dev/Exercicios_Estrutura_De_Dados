/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exerc2;
import javax.swing.JOptionPane;
import java.awt.*;
import java.awt.event.*;

public class Exerc2_GPT extends Frame implements ActionListener{
    Button b1, b2, b3, b4, b5, b6, b7;
    Label texto;
    
    public Exerc2_GPT(){
        setTitle("Exercício 2");
        setSize(500,500);
        setLayout(new FlowLayout(0,11,1));
        
        b1 = new Button("1");
        b1.setBounds(10,50,50,50);
        b1.addActionListener(this);
        
        b2 = new Button("2");
        b2.setBounds(10,100,50,50);
        b2.addActionListener(this);
        
        b3 = new Button("3");
        b3.setBounds(10,150,50,50);
        b3.addActionListener(this);
        
        b4 = new Button("4");
        b4.setBounds(10,200,50,50);
        b4.addActionListener(this);
        
        b5 = new Button("5");
        b5.setBounds(10,250,50,50);
        b5.addActionListener(this);
        
        b6 = new Button("6");
        b6.setBounds(10,300,50,50);
        b6.addActionListener(this);
        
        b7 = new Button("Sair");
        b7.setBounds(10,350,50,50);
        b7.addActionListener(this);
        
        texto = new Label();
        texto.setText("Opa");
        texto.setBounds(10,400,300,300);
                
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
        add(texto);
        addWindowListener (new FechaJanela());
    }
    
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==b1){
            texto.setText("Botão 1 apertado!");
        }
        if(e.getSource()==b2){
            texto.setText("Botão 2 apertado!"); 
        }
        if(e.getSource()==b3){
            texto.setText("Botão 3 apertado!");
        }
        if(e.getSource()==b4){
            texto.setText("Botão 4 apertado!");
        }
        if(e.getSource()==b5){
            texto.setText("Botão 5 apertado!");
        }
        if(e.getSource()==b6){
           texto.setText("Botão 6 apertado!");
        }
        if(e.getSource()==b7){
           System.exit(0);
        }
    }
    
    public static void main(String[] args) {
        new Exerc2_GPT().setVisible(true);
    }
}
