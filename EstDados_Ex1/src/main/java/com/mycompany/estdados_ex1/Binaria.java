
package com.mycompany.estdados_ex1;

public class Binaria{
    public static boolean binaria(int x, int vector[]){
      int n = vector.length;
      int inicio  = 0, fim = n-1;
      int meio;
      
      while(inicio<=fim){
          meio = (inicio+fim)/2;
          if(x == vector[meio]){
              return true;
          }
          
          if(x > vector[meio]){
              inicio = meio + 1;
          }
          else{
              fim = meio -1;
          }
      }
        
        return false;
    }
    
}

