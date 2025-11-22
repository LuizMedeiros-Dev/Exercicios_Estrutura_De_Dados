/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estdados_ex1;

/**
 *
 * @author luizf
 */
public class Bolha {
    public static void ordenar(int vetor[]){
       int n = vetor.length;
       int aux;
       for (int i =0; i < n-1; i++){
           for(int j = 0; j<n-1-i; j++){
               if (vetor[j]>vetor[j+1]){
                   aux = vetor[j];
                   vetor[j] = vetor[j+1];
                   vetor[j+1] = aux;
               }
           }
       }
    }
    
}
