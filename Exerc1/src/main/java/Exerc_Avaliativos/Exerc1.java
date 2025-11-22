

package Exerc_Avaliativos;

import com.mycompany.estdados_ex1.Bolha;
import java.io.*;
import javax.swing.JOptionPane;

public class Exerc1{
    public static void main(String args[]){
        boolean resposta;
        int n, x; 
        String lerN = JOptionPane.showInputDialog("Quer inserir um Vetor de Quantas unidades?");
        n = Integer.parseInt(lerN);
        int cont = 1;
        int vetor[] = new int[n];
        for (int i=0;i<n;i++){
            String lerNum = JOptionPane.showInputDialog(null,"Digite o "+cont+"º número:");
            vetor[i] = Integer.parseInt(lerNum);
            cont++;
        }
        
        String lerX = JOptionPane.showInputDialog(null,"Qual número quer procurar?");
        x = Integer.parseInt(lerX);
        
        String TipoBusca = JOptionPane.showInputDialog(null,"Qual tipo de busca deseja usar? (Digite 'B' para Binária e 'L' para linear): ");
        
        if (TipoBusca.equals("B") || "b".equals(TipoBusca)){
            Bolha.ordenar(vetor);
            resposta = bBin.binaria(x, vetor);
            if(resposta==true){
                JOptionPane.showMessageDialog(null,"Número Presente na Relação!");
            }
            else{
                JOptionPane.showMessageDialog(null,"Número não está presente no vetor");
            }
        }
        
         if (TipoBusca.equals("L") || "l".equals(TipoBusca)){
            resposta = bLin.linear(x, vetor);
            if(resposta==true){
                JOptionPane.showMessageDialog(null,"Número Presente na Relação!");
            }
            else{
                JOptionPane.showMessageDialog(null,"Número não está presente no vetor");
            }
        }
        
    }
  }