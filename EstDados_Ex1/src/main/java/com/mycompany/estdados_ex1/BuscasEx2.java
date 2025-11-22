package com.mycompany.estdados_ex1;

import java.io.*;
import javax.swing.JOptionPane;

public class BuscasEx2{
    public static void main(String args[]){
        boolean resposta;
        int TVet, ENum, cont; 
        cont = 1;
        
        String TVetor = JOptionPane.showInputDialog("Quer inserir um vetor de qual tamanho?");
            TVet = Integer.parseInt(TVetor);
       
        int vetor[] = new int[TVet];
        
        for (int i=0;i<TVet;i++){
            String lerNum = JOptionPane.showInputDialog(null,"Digite o "+(cont)+"º número:");
                vetor[i] = Integer.parseInt(lerNum);
                cont++;
        }
        
        String EncontrarN = JOptionPane.showInputDialog(null,"Qual número deseja encontrar?");
            ENum = Integer.parseInt(EncontrarN);
            
        Metodo_Bolha.ordenar(vetor);
        resposta = Binaria.binaria(ENum, vetor);
        
        if(resposta==true){
            JOptionPane.showMessageDialog(null,"Número está presente na relação!");
        }
        
        else{
            JOptionPane.showMessageDialog(null,"Número não está presente no vetor");
        }
    }
  }