

package com.mycompany.estdados_ex1;

import java.io.*;
import javax.swing.JOptionPane;

public class EstDados_Ex1{
    public static void main(String args[]){
        boolean resposta;
        int Tvetor, NBus;
        
        String lerTam = JOptionPane.showInputDialog("Digite o tamanho do vetor");
            Tvetor = Integer.parseInt(lerTam);
            
        int cont = 1;
        int vetor[] = new int[Tvetor];
        
        for (int i=0;i<Tvetor;i++){
            String lerNum = JOptionPane.showInputDialog(null,"Digite o "+cont+"º número:");
                vetor[i] = Integer.parseInt(lerNum);
                cont++;
        }
        
        String NumBuscado = JOptionPane.showInputDialog(null,"Qual número deseja encontrar?");
            NBus = Integer.parseInt(NumBuscado);
        
        String TipoBusca = JOptionPane.showInputDialog(null,"Qual tipo de busca deseja? (Digite '1' para Binária e '2' para linear): ");
        int TipoB = Integer.parseInt(TipoBusca);
        
        if (TipoB == 1){
                Metodo_Bolha.ordenar(vetor);
                resposta = Binaria.binaria(NBus, vetor);
                
                if(resposta==true){
                    JOptionPane.showMessageDialog(null,"Número está no vetor!");
                }
                
                else{
                    JOptionPane.showMessageDialog(null,"Número não está presente no vetor");
                }
        }
        
         if (TipoB == 2){
            resposta = Linear.linear(NBus, vetor);
            
            if(resposta==true){
                JOptionPane.showMessageDialog(null,"Número está no vetor!");
            }
            
            else{
                JOptionPane.showMessageDialog(null,"Número não está presente no vetor");
            }
        }
        
    }
  }