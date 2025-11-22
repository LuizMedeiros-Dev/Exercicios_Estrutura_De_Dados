
package ed_ordena;


public class Ordena_troca {    
   
    public static void main(String[] args) {


        
        int num [] = new int [7];
		num [0] = 9;
		num [1] = 1;
		num [2] = 3;
		num [3] = 2;
		num [4] = 7;
		num [5] = 5;
		num [6] = 4;
		
                bolha(num);
		
        for (int i = 0; i < num.length; i++){
			System.out.println (num [i]);}
            

    }

    
	public static void bolha (int num []){

		int n = num.length; //tamanho do vetor
		int aux; //variavel auxiliar de troca

		for (int i = 0; i < n-1; i++){
			for (int j = 0; j < n-1-i; j++){
				if (num[j] > num[j+1]){
				aux = num[j];
				num[j] = num[j+1];
				num[j+1] = aux;
				}
			}
		}
                
                
	}
}        
