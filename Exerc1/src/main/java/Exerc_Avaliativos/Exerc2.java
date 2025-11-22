/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exerc_Avaliativos;

import com.mycompany.estdados_ex1.Bolha;
import java.io.*;
import javax.swing.JOptionPane;

public class Exerc2{
    public static void main(String args[]){
        boolean resposta;
        int n, x, cont; 
        cont = 1;
        String lerN = JOptionPane.showInputDialog("Quer inserir um Vetor de Quantas unidades?");
        n = Integer.parseInt(lerN);
       
        int vetor[] = new int[n];
        for (int i=0;i<n;i++){
            String lerNum = JOptionPane.showInputDialog(null,"Digite o "+(cont)+"º número:");
            vetor[i] = Integer.parseInt(lerNum);
            cont++;
        }
        
        String lerX = JOptionPane.showInputDialog(null,"Qual número quer procurar?");
        x = Integer.parseInt(lerX);
        Bolha.ordenar(vetor);
        resposta = bBin.binaria(x, vetor);
        if(resposta==true){
            JOptionPane.showMessageDialog(null,"Número Presente na Relação!");
        }
        else{
            JOptionPane.showMessageDialog(null,"Número não está presente no vetor");
        }
    }
  }