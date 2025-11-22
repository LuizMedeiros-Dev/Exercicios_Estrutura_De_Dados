
package com.mycompany.estdados_ex1;

public class Linear{
    public static boolean linear(int x, int vector[]){
        int n = vector.length;
        for(int i=0;i<n;i++){
            if (x == vector[i]){
                return true;
            }
        }
        return false;
    }
}

